package jaxrs.linebot.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("textreq")
public class TextRequestResource {

    public TextRequestResource() {
    }

    @GET
    @QueryParam("param")
    public void getTextRequest(String param) {
        System.out.println(param);
    }

}
