package com.example.dianac.coc.models;

/**
 * Created by Diana C on 29/11/2017.
 */

public class Deportista {
    private String nombre, disciplina, logros;

    public Deportista(String nombre, String disciplina, String logros) {
        this.nombre = nombre;
        this.disciplina = disciplina;
        this.logros = logros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public String getLogros(){
        return logros;
    }
}
