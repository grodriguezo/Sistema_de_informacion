package DAO;
import Modelo.Paciente;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Rodriguez
 */
public interface DAOPaciente {
    public void insertarPaciente(Paciente paciente);
    public void modificarPaciente(Paciente paciente);
    public void eliminarPaciente(Paciente paciente);
    public Paciente getListaPacientes();
}
