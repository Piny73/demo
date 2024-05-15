package it.tsp.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/helloservlet")
public class HelloServlet extends HttpServlet{
   
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        
        String nome = req.getParameter("nome");
        String cognome = req.getParameter("cognome");

        //genero risposta
        PrintWriter response = resp.getWriter();
        response.println(homeTemplate().formatted(nome +""+cognome));
        response.flush();
    }

    private String homeTemplate() {
        return """
            <html>
                <head>
                </head>
                <body>
                <p> hello %s </p>
                <body>
            </html
        
                """;
    }
}
