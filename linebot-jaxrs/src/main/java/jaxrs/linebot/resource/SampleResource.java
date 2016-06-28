package jaxrs.linebot.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import jaxrs.linebot.entity.Person;

@Path("sample")
public class SampleResource {

    public SampleResource() {
    }

    @GET
    @Path("none")
    public void getNone() {
    }

    @GET
    @Path("query")
    public String getQuery(@QueryParam("param") String param) {
        return param;
    }

    @GET
    @Path("path/{param}")
    public String getPath(@PathParam("param") String param) {
        return param;
    }

    @POST
    @Path("form")
    public String postForm(@FormParam("param") String param) {
        return param;
    }

    @GET
    @Path("json")
    @Produces("application/json")
    public Person getJson() {
        Person person = new Person();
        person.setFirstName("Hello");
        person.setLastName("World!");
        return person;
    }

    @POST
    @Path("jsonparam")
    @Consumes("application/json")
    @Produces("application/json")
    public Person postJsonParam(Person person) {
        return person;
    }

    @GET
    @Path("xml")
    @Produces("application/xml")
    public Person getXml() {
        Person person = new Person();
        person.setFirstName("Hello");
        person.setLastName("World!");
        return person;
    }

    @POST
    @Path("jsonxml")
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    public Person postJsonXml(Person person) {
        return person;
    }

}
