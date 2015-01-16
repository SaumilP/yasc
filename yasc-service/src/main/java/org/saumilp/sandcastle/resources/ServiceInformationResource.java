package org.saumilp.sandcastle.resources;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import org.saumilp.sandcastle.infrastructure.ResponseFactory;
import org.saumilp.sandcastle.model.ServiceInformation;
import org.saumilp.sandcastle.model.ServiceType;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Endpoint for ServiceInformation
 *
 * Path : http://localhost:8080/yascservice/info/service
 */
@Path("/info/service")
@Produces(MediaType.APPLICATION_JSON)
public class ServiceInformationResource {
    private final String defaultServiceName;
    private final String defaultEnvName;
    private final ServiceType serviceType;
    private final String template;

    private final ResponseFactory factory = new ResponseFactory();

    public ServiceInformationResource(String template, ServiceType serviceType, String defaultEnvName, String defaultServiceName) {
        this.template = template;
        this.serviceType = serviceType;
        this.defaultEnvName = defaultEnvName;
        this.defaultServiceName = defaultServiceName;
    }

    @GET @Timed public ServiceInformation getService(@QueryParam("name")Optional<String> name,
                                                     @QueryParam("envName")Optional<String> envName){
        final String srvName = String.format(template, name.or(defaultServiceName));
        final String environmentName = String.format(template, envName.or(defaultEnvName));
        return new ServiceInformation(null, srvName, environmentName);
    }

    @POST @Timed public Response saveServiceDetails(@QueryParam("service")Optional<ServiceInformation> serviceInfo){
        String jsonResponse = "Service Details information successfully cached";
        return factory.okResponse(jsonResponse);
    }
}
