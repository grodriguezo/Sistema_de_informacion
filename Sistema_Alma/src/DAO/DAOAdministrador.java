package DAO;
import Modelo.Administrador;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Rodriguez
 */
public interface  DAOAdministrador {
    public boolean insertarAdministrador(Administrador admon);
    public boolean modificarAdministrador(Administrador admon);
    public boolean eliminarAdministrador(Administrador admon);
    public String verAdministrador();
}
