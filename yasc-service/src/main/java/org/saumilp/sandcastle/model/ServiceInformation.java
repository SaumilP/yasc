package org.saumilp.sandcastle.model;

import org.hibernate.validator.constraints.Length;

/**
 * Service Information container POJO
 */
public class ServiceInformation {
    private long id;
    @Length(max = 50)
    private String serviceName;
    @Length(max = 10)
    private String environmentName;
    @Length(max = 100)
    private String url;
    private ServiceType serviceType;

    public ServiceInformation(long id, String serviceName,
                              String environmentName, String url,
                              ServiceType serviceType) {
        this.id = id;
        this.serviceName = serviceName;
        this.environmentName = environmentName;
        this.url = url;
        this.serviceType = serviceType;
    }

    public ServiceInformation() {
    }

    public long getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getEnvironmentName() {
        return environmentName;
    }

    public String getUrl() {
        return url;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }
}
