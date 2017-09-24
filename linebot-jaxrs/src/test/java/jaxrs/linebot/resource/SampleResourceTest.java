package jaxrs.linebot.resource;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.SyncInvoker;
import javax.ws.rs.client.WebTarget;
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
    public void testPostForm() {
        String response = target("sample/form").request().post(
                Entity.entity(new Form("param", "abc"), MediaType.APPLICATION_FORM_URLENCODED_TYPE), String.class);
        assertThat(response, is("abc"));
    }

    @Test
    public void testGetJson() {
        Person response = target("sample/json").request().get(Person.class);
        assertThat(response.getFirstName(), is("Hello"));
        assertThat(response.getLastName(), is("World!"));
    }

    @Test
    public void testPostJsonParam() {
        Person person = new Person();
        person.setFirstName("abc");
        person.setLastName(null);
        Entity<Person> entity = Entity.entity(person, MediaType.APPLICATION_JSON_TYPE);
        Person response = target("sample/jsonparam").request().post(entity, Person.class);
        assertThat(response.getFirstName(), is("abc"));
        assertThat(response.getLastName(), nullValue());
    }

    @Test
    public void testGetXml() {
        Person response = target("sample/xml").request().get(Person.class);
        assertThat(response.getFirstName(), is("Hello"));
        assertThat(response.getLastName(), is("World!"));

        System.out.println(target("sample/xml").request().get(String.class));
    }

    @Test
    public void testPostJsonXml() {
        Person json = new Person();
        json.setFirstName("abc");
        json.setLastName("def");
        Entity<Person> jsonEntity = Entity.entity(json, MediaType.APPLICATION_JSON_TYPE);

        Person xml = new Person();
        xml.setFirstName("ghi");
        xml.setLastName("jkl");
        Entity<Person> xmlEntity = Entity.entity(xml, MediaType.APPLICATION_XML_TYPE);

        WebTarget target = target("sample/jsonxml");
        SyncInvoker jsonInvoker = target.request(MediaType.APPLICATION_JSON_TYPE);
        SyncInvoker xmlInvoker = target.request(MediaType.APPLICATION_XML_TYPE);

        Person jsonToJson = jsonInvoker.post(jsonEntity, Person.class);
        Person xmlToJson = jsonInvoker.post(xmlEntity, Person.class);
        Person jsonToXml = xmlInvoker.post(jsonEntity, Person.class);
        Person xmlToXml = xmlInvoker.post(xmlEntity, Person.class);

        assertThat(jsonToJson.getFirstName(), is("abc"));
        assertThat(jsonToJson.getLastName(), is("def"));
        assertThat(xmlToJson.getFirstName(), is("ghi"));
        assertThat(xmlToJson.getLastName(), is("jkl"));
        assertThat(jsonToXml.getFirstName(), is("abc"));
        assertThat(jsonToXml.getLastName(), is("def"));
        assertThat(xmlToXml.getFirstName(), is("ghi"));
        assertThat(xmlToXml.getLastName(), is("jkl"));

        System.out.println(jsonInvoker.post(jsonEntity, String.class));
        System.out.println(jsonInvoker.post(xmlEntity, String.class));
        System.out.println(xmlInvoker.post(jsonEntity, String.class));
        System.out.println(xmlInvoker.post(xmlEntity, String.class));
    }

}
