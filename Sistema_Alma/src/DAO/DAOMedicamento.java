package DAO;
import Modelo.Medicamentos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Rodriguez
 */
public interface DAOMedicamento {
    public void insertarMedicamentos(Medicamentos medicamento);
    public void modificarMedicamentos(Medicamentos medicamento);
    public void eliminarMedicamentos(Medicamentos medicamento);
}
