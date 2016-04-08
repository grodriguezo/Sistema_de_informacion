package Modelo;

import DAO.DAOFactory;
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
public class Empresa {

    protected ArrayList<Enfermera> ListaEnfermera = new ArrayList<Enfermera>();
    protected ArrayList<Paciente> ListaPacientes = new ArrayList<Paciente>();
    protected ArrayList<Tratamiento> ListaTratamiento = new ArrayList<Tratamiento>();
    protected ArrayList<Medicamentos> ListaMedicamento = new ArrayList<Medicamentos>();
    public DAOFactory Mysql;
    
    public Empresa(){
        Mysql = DAOFactory.getDAOFactory(1);
    }
    public void cargarListaEnfermeras() {
        ListaEnfermera = Mysql.getDAOEnfermera().getListaEnfermera();
    }

    public void verInformacionPacientes() {
    }

    public void ModificarInformacion() {
    }

    public void EliminarInformacion() {
    }
}
