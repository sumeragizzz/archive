package jaxrs.linebot.resource;

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
    public void GetNone() {
    }

    @GET
    @Path("query")
    public String GetQuery(@QueryParam("param") String param) {
        return param;
    }

    @GET
    @Path("path/{param}")
    public String GetPath(@PathParam("param") String param) {
        return param;
    }

    @POST
    @Path("form")
    public String GetForm(@FormParam("param") String param) {
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

}
