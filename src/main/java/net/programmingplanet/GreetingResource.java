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

        // Default constructor needed for Jackson serialization
        public Message() {}

        public Message(String message) {
            this.message = message;
        }

        // Optional: Add getter if needed for JSON serialization
        public String getMessage() {
            return message;
        }

        // Optional: Add setter if needed for JSON deserialization
        public void setMessage(String message) {
            this.message = message;
        }
    }
}
