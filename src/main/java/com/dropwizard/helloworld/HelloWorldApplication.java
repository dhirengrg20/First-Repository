package com.dropwizard.helloworld;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import com.dropwizard.helloworld.resources.*;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "HelloWorld";
    }

    @Override
    public void initialize(final Bootstrap<HelloWorldConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HelloWorldConfiguration configuration,
                    final Environment environment) {
    	environment.jersey().register(
    				new HelloWorldResource()
    				);
        // TODO: implement application
    }

}
