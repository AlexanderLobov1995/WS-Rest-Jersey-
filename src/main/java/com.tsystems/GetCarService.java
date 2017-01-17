package com.tsystems;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/car")
public class GetCarService {

  /*  @GET
    @Path("/{brandName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Car getCar(@PathParam("brandName") String brandName) {
        return new Car(brandName);
    }*/

    @GET
    @Path("/post")
/*    @Consumes(MediaType.APPLICATION_JSON)*/
    @Produces(MediaType.TEXT_PLAIN)
   public String testMethod(){
       return "koko";
    }
    /* public Car patchCar() {
        return new Car();
    }*/
}
