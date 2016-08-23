package com.javadrop;

import com.javadrop.health.TemplateHealthCheck;
import com.javadrop.resources.HelloWorldResource;
import com.javadrop.resources.MessageResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloDropwizardApplication extends Application<HelloDropwizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloDropwizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "HelloDropwizard";
    }

    @Override
    public void initialize(final Bootstrap<HelloDropwizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HelloDropwizardConfiguration configuration,
                    final Environment environment) {
       /* final HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(), configuration.getFnametemp(), configuration.getLnametemp(),
                configuration.getDefaultName(), configuration.getDefaultfname(), configuration.getDefaultlname()
        );
        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);*/
        final MessageResource resource = new MessageResource();
        environment.jersey().register(resource);
    }

}
