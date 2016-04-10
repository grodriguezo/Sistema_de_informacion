package DAO;
import Modelo.Enfermera;
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
public interface DAOEnfermera {
    public void insertarEnfermera(Enfermera enfermera);
    public void modificarEnfermera(Enfermera enfermera);
    public void eliminarEnfermera(int cc);
    public Enfermera consultarEnfermera(int cedula);
}
