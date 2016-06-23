package jaxrs.linebot.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("textres")
public class TextResponseResource {

    public TextResponseResource() {
    }

    @GET
    @Produces("text/plain")
    public String getTextResponse() {
        return "abc";
    }

}
