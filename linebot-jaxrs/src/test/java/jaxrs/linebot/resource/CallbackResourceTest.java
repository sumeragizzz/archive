package jaxrs.linebot.resource;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.math.BigDecimal;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import jaxrs.linebot.entity.ReceiveMessage;
import jaxrs.linebot.entity.ReceiveMessage.Content;
import jaxrs.linebot.entity.ReceiveMessage.Result;

public class CallbackResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(CallbackResource.class);
    }

    @Test
    public void testPostCallback() {
        Content content = new Content();
        content.setContentType(BigDecimal.ONE);
        content.setFrom("fromID");
        content.setText("Hello World!");
        Result result = new Result();
        result.setContent(content);
        ReceiveMessage message = new ReceiveMessage();
        message.addResult(result);

        Response response = target("callback").request().post(Entity.json(message));
        assertThat(response.getStatus(), is(200));
    }

}
