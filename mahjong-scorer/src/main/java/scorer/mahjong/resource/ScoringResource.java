package scorer.mahjong.resource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("scoring")
public class ScoringResource {

    @POST
    public Response post() {
        return Response.ok().build();
    }

}
