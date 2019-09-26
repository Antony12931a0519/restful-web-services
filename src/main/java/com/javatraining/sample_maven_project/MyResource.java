package com.javatraining.sample_maven_project;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("welcome")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@Path("hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Hello Welcome o my Application!";
    }
	
	@Path("hi")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHiMessag() {
        return "Hello Hi welcme to my Application!";
    }
}
