package jaxrs.linebot.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import jaxrs.linebot.entity.ReceiveMessage;
import jaxrs.linebot.entity.ReceiveMessage.Content;

@Path("callback")
public class CallbackResource {

    public CallbackResource() {
    }

    @POST
    @Consumes("application/json")
    public Response postCallback(ReceiveMessage message) {
        Content content = message.getResult().get(0).getContent();
        System.out.println(content.getContentType().toPlainString());
        System.out.println(content.getFrom());
        System.out.println(content.getText());
        return Response.ok().build();
    }

}
