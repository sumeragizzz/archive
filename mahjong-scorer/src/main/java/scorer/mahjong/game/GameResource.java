package scorer.mahjong.game;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("game")
public class GameResource {

    @GET
    public Response get() {
        return Response.ok().build();
    }

    @GET
    @Path("{id}")
    public Response get(@PathParam("id") int id) {
        return Response.ok().build();
    }

    @POST
    public Response post() {
        return Response.ok().build();
    }

    @PUT
    @Path("{id}")
    public Response put(@PathParam("id") int id) {
        return Response.ok().build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int id) {
        return Response.noContent().build();
    }

}
