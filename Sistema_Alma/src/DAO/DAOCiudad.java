package DAO;
import Modelo.Ciudad;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Rodriguez
 */
public interface DAOCiudad {
    public void insertarCiudad(Ciudad ciudad);
    public void modificarCiudad(Ciudad ciudad);
    public void eliminarCiudad(Ciudad ciudad);
    public ArrayList getListaCiudad();
}
