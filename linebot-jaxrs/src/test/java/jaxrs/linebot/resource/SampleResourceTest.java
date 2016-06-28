package jaxrs.linebot.resource;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import jaxrs.linebot.entity.Person;

public class SampleResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(SampleResource.class);
    }

    @Test
    public void testGetNone() {
        Response response = target("sample/none").request().get();
        assertThat(response.getStatus(), is(204));
    }

    @Test
    public void testGetQuery() {
        String response = target("sample/query").queryParam("param", "abc").request().get(String.class);
        assertThat(response, is("abc"));
    }

    @Test
    public void testGetPath() {
        String response = target("sample/path").path("abc").request().get(String.class);
        assertThat(response, is("abc"));
    }

    @Test
    public void testGetForm() {
        String response = target("sample/form").request().post(
                Entity.entity(new Form("param", "abc"), MediaType.APPLICATION_FORM_URLENCODED_TYPE), String.class);
        assertThat(response, is("abc"));
    }

    @Test
    public void testGetJson() {
        Person person = target("sample/json").request().get(Person.class);
        assertThat(person.getFirstName(), is("Hello"));
        assertThat(person.getLastName(), is("World!"));
    }

}
