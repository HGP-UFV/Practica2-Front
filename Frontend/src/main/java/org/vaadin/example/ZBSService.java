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


    public String leeCentrosPorNombre(String nombre) throws URISyntaxException, IOException,
            InterruptedException {
        API api = new API();
        return api.getCentroPorNombre(nombre);
    }//leeCentrosPorNombre

    public ArrayList<ZonaBasicaSalud> leeCentros() throws URISyntaxException, IOException,
            InterruptedException {
        API api = new API();
        String resultsAPI = api.getCentros();
        Gson gson = new Gson();
        ArrayList<ZonaBasicaSalud> lista = gson.fromJson(resultsAPI, new TypeToken<ArrayList<ZonaBasicaSalud>>() {}.getType());
        return lista;
    }
}
