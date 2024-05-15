package it.tsp.demo.control;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class HelloService {

    public String generateHelloMessage(String nome, String cognome){

        return nome.endsWith("a") ? "Bentornata " + nome + " " + cognome :
        "Bentornato " + nome + " " + cognome ;
    }
}
