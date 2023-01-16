/*
 * Autor: Hemant García Puente - B8
 * Ingeniería Informática, Ciberseguridad y Hacking Ético
 * Curso - 3ºB
 * Profesor: Carlos Emilio Rabazo
 *
 * En esta clase vamos a crear un servicio que se encargue de comunicarse con la API
 *
 * */

package org.vaadin.example;
import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;
@Service
public class ZBSService implements Serializable {

    /*public String leeCentros(String nombre) throws URISyntaxException, IOException,
            InterruptedException {
        API api = new API();
        return api.getCentroPorVALOR(nombre);
    }//leeCentros por algun valor concreto*/

    //PRIMER FICHERO

    public String leeCentrosPorNombre(String nombre) throws URISyntaxException, IOException,
            InterruptedException {
        API api = new API();
        return api.getCentroPorNombre(nombre);
    }//leeCentrosPorNombre

    public ArrayList<ZonaBasicaSalud> leeCentros() throws URISyntaxException, IOException,
            InterruptedException {
        API api2 = new API();
        String resultsAPI = api2.getCentros();
        Gson gson = new Gson();
        ArrayList<ZonaBasicaSalud> lista = gson.fromJson(resultsAPI, new TypeToken<ArrayList<ZonaBasicaSalud>>() {}.getType());
        return lista;
    }

    //PRIMER FICHERO



    //SEGUNDO FICHERO

    public String leeCentrosMayores60PorNombre(String nombre) throws URISyntaxException, IOException,
            InterruptedException {
        API api3 = new API();
        return api3.getCentroPorNombreMayores(nombre);
    }//leeCentrosPorNombre

    public ArrayList<ZonaBasicaSalud60Mayores> leeCentrosMayores60() throws URISyntaxException, IOException,
            InterruptedException {
        API api3 = new API();
        String resultsAPI = api3.getCentrosMayores();
        Gson gson = new Gson();
        ArrayList<ZonaBasicaSalud60Mayores> lista = gson.fromJson(resultsAPI, new TypeToken<ArrayList<ZonaBasicaSalud60Mayores>>() {}.getType());
        return lista;
    }


    //SEGUNDO FICHERO




}//ZBS Service
