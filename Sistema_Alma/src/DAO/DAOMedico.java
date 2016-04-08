package DAO;
import Modelo.Medico;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Rodriguez
 */
public interface DAOMedico {
    public void insertarMedico(Medico medico);
    public void modificarMedico(Medico medico);
    public void eliminarMedico(Medico medico);
}
