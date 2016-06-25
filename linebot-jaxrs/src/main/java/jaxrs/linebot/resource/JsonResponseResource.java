package jaxrs.linebot.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import jaxrs.linebot.entity.Person;

@Path("jsonres")
public class JsonResponseResource {

    public JsonResponseResource() {
    }

    @GET
    @Produces("application/json")
    public Person getJson() {
        Person person = new Person();
        person.setFirstName("Hello");
        person.setLastName("World!");
        return person;
    }

}
