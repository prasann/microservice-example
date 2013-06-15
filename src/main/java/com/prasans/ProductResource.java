package com.prasans;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {
    @GET
    public Product list() {
        return new Product(123, "MyProduct", "MyDescription", 456.00);
    }

}
