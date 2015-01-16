package org.saumilp.sandcastle.controllers;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.saumilp.sandcastle.configurations.ServiceConfiguration;

/**
 * Home Controller Application
 */
public class HomeApplication extends Application<ServiceConfiguration> {

    @Override public void initialize(Bootstrap<ServiceConfiguration> serviceConfigurationBootstrap) {

    }

    @Override public void run(ServiceConfiguration serviceConfiguration, Environment environment) throws Exception {
        //configure RESTful resources here for the application
    }
}
