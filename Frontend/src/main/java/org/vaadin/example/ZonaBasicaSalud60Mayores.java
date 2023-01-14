/*
 * Autor: Hemant García Puente - B8
 * Ingeniería Informática, Ciberseguridad y Hacking Ético
 * Curso - 3ºB
 * Profesor: Carlos Emilio Rabazo
 *
 * En esta clase vamos a guardar un centro cuando lo leamos del archivo Json "Covid19-TIA_ZonasBásicasSalud_Mayores60.json" que vamos
 * a usar para guardar toda la información de todos los centros.
 *
 * */


package org.vaadin.example;

public class ZonaBasicaSalud60Mayores {

    //codigo_geometria (string/string), zona_basica_salud (String/String), tasa_incidencia_acumulada_ultimos_14dias (Number/float)
    //tasa_incidencia_acumulada_total(Number/Float), casos_confirmados_totales (Number/int), casos_confirmados_ultimos_14dias (Number/Int)
    //fecha_informe (String/Date)


    //Atributos
    private String codigo_geometria;
    private String zona_basica_salud;
    private float tasa_incidencia_acumulada_P60mas_ultimos_14dias;
    private int casos_confirmados_P60mas_ultimos_14dias;
    private String fecha_informe;
    //Atributos


    //Constructor
    public ZonaBasicaSalud60Mayores(String codigo_geometria, String zona_basica_salud, float tasa_incidencia_acumulada_P60mas_ultimos_14dias, int casos_confirmados_P60mas_ultimos_14dias, String fecha_informe) {
        this.codigo_geometria = codigo_geometria;
        this.zona_basica_salud = zona_basica_salud;
        this.tasa_incidencia_acumulada_P60mas_ultimos_14dias = tasa_incidencia_acumulada_P60mas_ultimos_14dias;
        this.casos_confirmados_P60mas_ultimos_14dias = casos_confirmados_P60mas_ultimos_14dias;
        this.fecha_informe = fecha_informe;
    }
    //Constructor


    public String getCodigo_geometria() {
        return codigo_geometria;
    }

    public void setCodigo_geometria(String codigo_geometria) {
        this.codigo_geometria = codigo_geometria;
    }

    public String getZona_basica_salud() {
        return zona_basica_salud;
    }

    public void setZona_basica_salud(String zona_basica_salud) {
        this.zona_basica_salud = zona_basica_salud;
    }

    public float getTasa_incidencia_acumulada_P60mas_ultimos_14dias() {
        return tasa_incidencia_acumulada_P60mas_ultimos_14dias;
    }

    public void setTasa_incidencia_acumulada_P60mas_ultimos_14dias(float tasa_incidencia_acumulada_P60mas_ultimos_14dias) {
        this.tasa_incidencia_acumulada_P60mas_ultimos_14dias = tasa_incidencia_acumulada_P60mas_ultimos_14dias;
    }

    public int getCasos_confirmados_P60mas_ultimos_14dias() {
        return casos_confirmados_P60mas_ultimos_14dias;
    }

    public void setCasos_confirmados_P60mas_ultimos_14dias(int casos_confirmados_P60mas_ultimos_14dias) {
        this.casos_confirmados_P60mas_ultimos_14dias = casos_confirmados_P60mas_ultimos_14dias;
    }

    public String getFecha_informe() {
        return fecha_informe;
    }

    public void setFecha_informe(String fecha_informe) {
        this.fecha_informe = fecha_informe;
    }
}//Class ZonaBasicaSalud60mayores
