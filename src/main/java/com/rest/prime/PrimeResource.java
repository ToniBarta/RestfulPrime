package com.rest.prime;

import com.rest.prime.domain.PrimeResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/prime")
public class PrimeResource {

    @GET
    @Path("/{number}")
    @Produces("application/json")
    public PrimeResponse getPrimeNumbers(@PathParam("number") int number) {
        return new PrimeNumbersCommand(number).execute();
    }
}

