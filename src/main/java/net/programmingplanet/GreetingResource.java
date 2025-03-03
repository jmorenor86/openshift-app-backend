package net.programmingplanet;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        return Response.ok(new Message("Hello from Quarkus REST")).build();
    }

    public static class Message {
        public String message;

        public Message(String message) {
            this.message = message;
        }
    }
}
