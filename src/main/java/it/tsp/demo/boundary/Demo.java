package it.tsp.demo.boundary;

import java.util.Arrays;
import java.util.*;
import it.tsp.demo.Account;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;


@RequestScoped
@Named("demo")
public class Demo {

    public List<Account> account(){

        return Arrays.asList(new Account( "Pina", "Salemme"), new Account("Mario", "Rossi"));
    }

}
