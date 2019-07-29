package com.orrily;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class dropwizbasicApplication extends Application<dropwizbasicConfiguration> {

    public static void main(final String[] args) throws Exception {
        new dropwizbasicApplication().run(args); // using the default constructor
    }

    @Override
    public String getName() {
        return "dropwizbasic";
    }

    @Override
    public void initialize(final Bootstrap<dropwizbasicConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final dropwizbasicConfiguration configuration, final Environment environment) {
        // TODO: implement application
    }

}


/*
 * This class contains our public static void main() method, which doesn’t do too much except call our microservice’s run() method.
 * It also has a getName() method, which is shown at startup.
 * The initialize() and run() methods are the key places where we can bootstrap our application.
 *
 */
