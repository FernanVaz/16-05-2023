package com.softtec.modelo.DAO;

public class ClienteDAO {
    DAO id;

    public ClienteDAO(DAO d){
        this.id = d;
    }
    public String Insertar(Cliente c){
        return id.insertar(c);
    }

    public void setID(DAO id){ this.id = id;}
}
