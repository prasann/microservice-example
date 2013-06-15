package com.prasans;

import com.yammer.metrics.core.HealthCheck;

public class ProductHealthCheck extends HealthCheck {

    protected ProductHealthCheck(String name) {
        super(name);
    }

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
