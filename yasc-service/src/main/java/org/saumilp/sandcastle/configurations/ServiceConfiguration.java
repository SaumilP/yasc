package org.saumilp.sandcastle.configurations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;
import org.saumilp.sandcastle.model.ServiceType;

/**
 * Base Service Configuration Class holding landing page requirements
 */
public class ServiceConfiguration extends Configuration {
    @NotEmpty
    private String url;

    @NotEmpty
    private String friendlyName;

    @NotEmpty
    private ServiceType serviceType;

    @JsonProperty public String getUrl(){
        return url;
    }

    @JsonProperty public String getFriendlyName(){
        return friendlyName;
    }

    @JsonProperty public ServiceType getServiceType() {
        return serviceType;
    }

    @JsonProperty public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty public void stFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    @JsonProperty public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
