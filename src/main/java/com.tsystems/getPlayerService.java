package com.tsystems;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by alex1_000 on 17.11.2016.
 */
@Path("/player")
public class getPlayerService {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getPlayer")
    public Player getPlayer(){
        return new Player();
    }
}
