/*
 * Autor: Hemant García Puente - B8
 * Ingeniería Informática, Ciberseguridad y Hacking Ético
 * Curso - 3ºB
 * Profesor: Carlos Emilio Rabazo
 *
 * En esta clase vamos a gestionar toodo el proceso de comunicación con la
 * api.
 *
 * */


package org.vaadin.example;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class API {


    //"Cable" con el que nos vamos a conectar al otro ejercicio. Usaremos el puerto 8090, ya que es el empleado en el Backend
    private static final String urlPrefix = "http://localhost:8080/%s/%s";



    //PRIMER FICHERO
    public String getCentroPorNombre(String tipo) throws URISyntaxException, IOException, InterruptedException {
        String fullUrl = String.format(urlPrefix, "centros/porNombreZona",tipo);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(fullUrl))
                .GET()
                .build();
        HttpResponse <String> response = HttpClient
                .newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }//GetCentroPorNombre

    public String getCentros() throws URISyntaxException, IOException, InterruptedException {
        String fullUrl = String.format(urlPrefix, "centros","");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(fullUrl))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient
                .newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }//GetCentros

    //PRIMER FICHERO




    //SEGUNDO FICHERO

    public String getCentroPorNombreMayores(String tipo) throws URISyntaxException, IOException, InterruptedException {
        String fullUrl = String.format(urlPrefix, "centrosMayores/porNombreZona",tipo);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(fullUrl))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient
                .newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }//GetCentroPorNombre



    public String getCentrosMayores() throws URISyntaxException, IOException, InterruptedException {
        String fullUrl = String.format(urlPrefix, "centrosMayores","");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(fullUrl))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient
                .newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }//GetCentros

    //SEGUNDO FICHERO










}//Class API