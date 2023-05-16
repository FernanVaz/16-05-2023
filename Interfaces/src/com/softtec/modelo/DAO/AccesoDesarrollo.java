package com.softtec.modelo.DAO;

public class AccesoDesarrollo implements DAO {
    @Override
    public String insertar(Cliente C) {
        return C.getNIF();
    }
}
