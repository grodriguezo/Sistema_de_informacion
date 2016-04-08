/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.MysqlDAOFactory.conexion;
import Modelo.Ciudad;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo Rodriguez
 */
public class MysqlDAOCiudad implements DAOCiudad{
  private Connection conexion;
    public MysqlDAOCiudad() {
        try {
            conexion = MysqlDAOFactory.conexion();
        } catch (SQLException ex) {
            Logger.getLogger(MysqlDAOCiudad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insertarCiudad(Ciudad ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarCiudad(Ciudad ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarCiudad(Ciudad ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public ArrayList getListaCiudad() {
        ArrayList listaCiudad = new ArrayList<Ciudad>();
        Ciudad tempCiudad = new Ciudad();
        try {
            String sql = "SELECT * FROM ciudad";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            for(;rs.next();){
                int id_ciudad=rs.getInt("Id_Ciudad");     
                String nombre = rs.getString("Nombre");
                String departamento = rs.getString("Departamento");
                tempCiudad = new Ciudad(id_ciudad,nombre,departamento);
                listaCiudad.add(tempCiudad);
            }
            //admin = rs.getInt("CC_Administrador") + " " + rs.getString("Nombre");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listaCiudad;
    }
    
}
