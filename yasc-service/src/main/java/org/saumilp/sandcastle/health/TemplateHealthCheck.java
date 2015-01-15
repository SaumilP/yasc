package org.saumilp.sandcastle.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Template Health Check Class for the Application
 *
 * TODO Adjust Health Check class to use custom POJO
 */
public class TemplateHealthCheck extends HealthCheck {
    private final String template;

    public TemplateHealthCheck(String template) {
        this.template = template;
    }

    @Override
    protected Result check() throws Exception {
        final String blah = String.format(template, "TEST");
        if(!blah.contains("TEST")){
            return Result.unhealthy("Template cannot include name");
        }
        return Result.healthy();
    }
}
