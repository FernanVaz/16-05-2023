package com.softtec.modelo.DAO;

public class AccesoProduccion implements DAO {
    @Override
    public String insertar(Cliente C) {
        return C.getNombre();
    }
}
