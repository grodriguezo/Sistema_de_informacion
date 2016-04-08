package DAO;
import Modelo.Diagnostico;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Rodriguez
 */
public interface DAODiagnostico {
    public boolean insertarDiagnostico(Diagnostico diagnostico);
    public boolean modificarDiagnostico(Diagnostico diagnostico);
    public boolean eliminarDiagnostico(Diagnostico diagnostico);
}
