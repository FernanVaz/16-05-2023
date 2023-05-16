package com.softtec.modelo.DAO;

public class Cliente {
    String nombre, NIF;
    public Cliente(String nombre, String NIF) {
        this.nombre = nombre;
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
}
