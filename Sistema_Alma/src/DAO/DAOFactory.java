package DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Rodriguez
 */
public abstract class DAOFactory {
    static final int Mysql =1;
    static final int XML =2;
    
    public static DAOFactory  getDAOFactory(int BD){
        switch(BD){
            case 1:
                return new MysqlDAOFactory();
             
            default:
                return null;
        } 
    }
    public abstract DAOPaciente getDAOPaciente();
    public abstract DAOEstatus getDAOEstatus();
    public abstract DAODiagnostico getDAODiagnostico();
    public abstract DAOCiudad getDAOCiudad();
    public abstract DAOAdministrador getDAOAdministrador();
    public abstract DAOMedicamento getDAOMedicamento();
    public abstract DAOMedico getDAOMedico();
    public abstract DAOEnfermera getDAOEnfermera();
    public abstract DAOTratamiento getDAOTratamiento();
    public abstract String testConnection();
}
