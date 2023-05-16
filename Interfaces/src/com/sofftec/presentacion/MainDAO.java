package com.sofftec.presentacion;

import com.softtec.modelo.DAO.AccesoDesarrollo;
import com.softtec.modelo.DAO.AccesoProduccion;
import com.softtec.modelo.DAO.Cliente;
import com.softtec.modelo.DAO.ClienteDAO;

public class MainDAO {
    public static void main(String[] args) {
        Cliente client =new Cliente("Fer","123456789Q");
        AccesoDesarrollo AD = new AccesoDesarrollo();
        AccesoProduccion AP = new AccesoProduccion();
        ClienteDAO clienteDAO = new ClienteDAO(AD);
        System.out.println(clienteDAO.Insertar(client));
        clienteDAO.setID(AP);
        System.out.println(clienteDAO.Insertar(client));
    }
}
