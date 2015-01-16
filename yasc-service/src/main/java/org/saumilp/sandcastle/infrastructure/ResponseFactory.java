package org.saumilp.sandcastle.infrastructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * JSON Response generator factory class
 */
public final class ResponseFactory {
    private static final Logger log = LoggerFactory.getLogger(ResponseFactory.class);

    public Response okResponse(String jsonString){
        return Response.ok(jsonString, MediaType.APPLICATION_JSON_TYPE);
    }
}
