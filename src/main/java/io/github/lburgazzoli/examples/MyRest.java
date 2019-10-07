package io.github.lburgazzoli.examples;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
@ApplicationScoped
public class MyRest {
    @Path("/run")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public boolean inspectRegistry() {       
        return false;
    }
}
