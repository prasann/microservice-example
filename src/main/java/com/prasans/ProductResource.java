package com.prasans;

import org.msgpack.MessagePack;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/products")
public class ProductResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Product listAsJson() {
        return new Product(123, "MyProduct", "MyDescription", 456.00);
    }

    @GET
    @Produces("application/x-msgpack")
    public Response listAsMsgPack() {
        try {
            return Response.ok(new MessagePack().write(new Product(123, "MyProduct", "MyDescription", 456.00))).build();
        } catch (IOException e) {
            e.printStackTrace();
            return Response.serverError().build();
        }
    }

}
