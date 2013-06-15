package com.prasans;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class ProductService extends Service<ProductConfiguration> {
    @Override
    public void initialize(Bootstrap<ProductConfiguration> bootstrap) {
        bootstrap.setName("product-list");
    }

    @Override
    public void run(ProductConfiguration productConfiguration, Environment environment) throws Exception {

    }
}
