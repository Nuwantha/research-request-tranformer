package com.request.transformer;

import com.request.transformer.resources.SpecificationResource;
import io.dropwizard.Application;



import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloApplication extends Application<HelloConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloApplication().run(args);
    }

    @Override
    public String getName() {
        return "Hello";
    }

    @Override
    public void initialize(final Bootstrap<HelloConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HelloConfiguration configuration,
                    final Environment environment) {
        final SpecificationResource resource = new SpecificationResource();
        // TODO: implement application
        environment.jersey().register(resource);
    }

}
