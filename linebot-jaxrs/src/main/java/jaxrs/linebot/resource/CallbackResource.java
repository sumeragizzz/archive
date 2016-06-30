package jaxrs.linebot.resource;

import java.math.BigDecimal;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;

import jaxrs.linebot.entity.ReceiveMessage;
import jaxrs.linebot.entity.ReceiveMessage.Content;
import jaxrs.linebot.entity.SendMessage;

@Path("callback")
public class CallbackResource {

    public CallbackResource() {
    }

    @POST
    @Consumes("application/json")
    public Response postCallback(ReceiveMessage message) {
        Content content = message.getResult().get(0).getContent();
        sendMessage(content.getFrom(), content.getText());
        return Response.ok().build();
    }

    private void sendMessage(String to, String text) {
        Invocation.Builder invocationBuilder = ClientBuilder.newClient()
                .target("https://trialbot-api.line.me/v1/events").request()
                .header("Host", "trialbot-api.line.me")
                .header("Content-type", "application/json; charset=UTF-8")
                .header("X-Line-ChannelID", System.getenv("LINE_CHANNEL_ID"))
                .header("X-Line-ChannelSecret", System.getenv("LINE_CHANNEL_SECRET"))
                .header("X-Line-Trusted-User-With-ACL", System.getenv("LINE_MID"));

        SendMessage.Content content = new SendMessage.Content();
        content.setContentType(BigDecimal.ONE);
        content.setToType(BigDecimal.ONE);
        content.setText(text);
        SendMessage message = new SendMessage();
        message.addTo(to);
        message.setToChannel(BigDecimal.valueOf(1383378250));
        message.setEventType("138311608800106203");
        message.setContent(content);

        Response response = invocationBuilder.post(Entity.json(message));
        if (response.getStatus() != 200) {
            // TODO エラー処理
        }
    }

}
