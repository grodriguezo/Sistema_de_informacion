package DAO;
import Modelo.Tratamiento;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Rodriguez
 */
public interface DAOTratamiento {
    public void insertarTratamiento(Tratamiento tratamiento);
    public void modificarTratamiento(Tratamiento tratamiento);
    public void eliminarTratamiento(Tratamiento tratamiento);
}
