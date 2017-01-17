package com.tsystems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.core.MediaType;
import java.io.IOException;

/**
 * Created by Haigus on 10.11.2016.
 */
public class RestClient {
    public static void main(String[] args) throws IOException {
        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/rest/player/getPlayer");
       /* Car cars = new Car("Bentley");*/
        ObjectMapper mapper = new ObjectMapper();
       /* String JSONCar = mapper.writeValueAsString(cars);*/
        ClientResponse response = webResource
                .accept(MediaType.APPLICATION_JSON)
                .type(MediaType.APPLICATION_JSON)
                .post(ClientResponse.class);
        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        String output = response.getEntity(String.class);
        Player player=mapper.readValue(output,Player.class);
        System.out.println(player.getName());
        System.out.println(player.getSurname());
        System.out.println(player.getAge());
       /* Car newCar = mapper.readValue(output, Car.class);*/
      /* String intro =mapper.readValue(String.class);*/
       /* System.out.println("Old car: " + cars);*/
        /*System.out.println("Output from Server ....");*/
       /* System.out.println(newCar.getIntroduction());*/
       /* String intro=mapper.readValue(output,String.class);*/
       /* System.out.println(intro);*/
    }
}
