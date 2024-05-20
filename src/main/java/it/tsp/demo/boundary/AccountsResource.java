package it.tsp.demo.boundary;

import java.util.Arrays;
import java.util.List;

import it.tsp.demo.Account;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/accounts")
public class AccountsResource {

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    /* @Consumes - non lo metto perchè non ricevo nulla*/
    public List<Account> account(){
        return Arrays.asList(new Account( "Pina", "Salemme"), new Account("Mario", "Rossi"));
    }
}
