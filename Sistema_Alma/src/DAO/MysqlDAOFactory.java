package DAO;

import DAO.DAOTratamiento;
//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo Rodriguez
 */
public class MysqlDAOFactory extends DAOFactory {

    public static final String URL = "jdbc:mysql://localhost:3306/alma_innovation";
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    private String sql;

    public static Connection conexion() throws SQLException {
        String user = "root";
        String clave = "1234";
        Connection cn = null;
        try {
            //CLASE USADA PARA EL DRIVER
            Class.forName(DRIVER);
            //CONECCION A LA BASE DE DATOS
            cn = DriverManager.getConnection(URL, user, clave);

        } catch (ClassNotFoundException ex) {
            // TODO: handle exception
            System.out.print("Error en el Driver ");
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.print(e.getMessage());
        }
        return cn;
    }

    @Override
    public DAOPaciente getDAOPaciente() {
        return new MysqlDAOPaciente();
    }

    @Override
    public DAOEstatus getDAOEstatus() {
        return new MysqlDAOEstatus();
    }

    @Override
    public DAODiagnostico getDAODiagnostico() {
        try {
            return new MysqlDAODiagnostico();
        } catch (SQLException ex) {
            Logger.getLogger(MysqlDAOFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public DAOCiudad getDAOCiudad() {
        return new MysqlDAOCiudad();
    }

    @Override
    public DAOAdministrador getDAOAdministrador() {
        try {
            return new MysqlDAOAdministrador();
        } catch (SQLException ex) {
            Logger.getLogger(MysqlDAOFactory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("error");
        }
        return null;
    }

    @Override
    public DAOMedicamento getDAOMedicamento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOMedico getDAOMedico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOEnfermera getDAOEnfermera() {
        try {
            return new MysqlDAOEnfermera();
        } catch (SQLException ex) {
            Logger.getLogger(MysqlDAOFactory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("error");
        }
        return null;
    }

    @Override
    public DAOTratamiento getDAOTratamiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String testConnection() {
        String estado = "inicial";
        try {
            conexion();
            estado = "conectado";
        } catch (SQLException ex) {
            Logger.getLogger(MysqlDAOFactory.class.getName()).log(Level.SEVERE, null, ex);
            estado = "fallo";
        }
        return estado;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
