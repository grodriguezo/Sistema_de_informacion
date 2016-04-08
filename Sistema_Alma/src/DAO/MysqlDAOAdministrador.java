
package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.Administrador;
import java.sql.ResultSet;


public class MysqlDAOAdministrador implements DAOAdministrador {

    private Connection conexion;

    public MysqlDAOAdministrador() throws SQLException {
        conexion = MysqlDAOFactory.conexion();
    }

    public boolean insertarAdministrador(Administrador administrador) {
        // TODO Auto-generated method stub
        boolean admin = false;
        try {
            String sql = "INSERT INTO administrador (CC_Administrador, Nombre, Usuario, Contraseña) "
                    + "VALUES (" + administrador.getCC() + ", '" + administrador.getNombre() + "', '" + administrador.getUsuario() + "', '" + administrador.getContraseña() + "');";
            Statement st = conexion.createStatement();
            st.executeUpdate(sql);
            admin = true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return admin;
    }

    @Override
    public boolean modificarAdministrador(Administrador admon) {
        boolean admin = false;
        try {
            String sql = "UPDATE administrador SET "
                    + "Nombre='"+ admon.getNombre() 
                    + "',Usuario= '" + admon.getUsuario() 
                    + "',Contraseña= '" + admon.getContraseña() 
                    + "'WHERE CC_Administrador='"+admon.getCC()+"';";
            Statement st = conexion.createStatement();
            st.executeUpdate(sql);
            admin = true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return admin;
    }

    @Override
    public boolean eliminarAdministrador(Administrador admon) {
 boolean admin = false;
        try {
            String sql = "DELETE from administrador WHERE CC_Administrador='"+admon.getCC()+"';";
            Statement st = conexion.createStatement();
            st.executeUpdate(sql);
            admin = true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return admin;        
        
    }

    @Override
    public String verAdministrador() {
        String admin = "no hay administrador";
        try {
            String sql = "SELECT * FROM administrador";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            admin = rs.getInt("CC_Administrador") + " " + rs.getString("Nombre");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return admin;
    }

    public boolean consultarAdministrador(String usuario, String contraseña) {
        boolean admin = false;
        try {

            String sql = "SELECT Usuario,Contraseña FROM alma_innovation.administrador where Usuario='" + usuario + "' and Contraseña='" + contraseña + "'";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String userdb = rs.getString("Usuario");
                String passdb = rs.getString("Contraseña");
                if (userdb.equals(usuario) && passdb.equals(contraseña)) {
                    admin = true;
                }
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return admin;
    }

    public Administrador BuscarAdministrador(String nombre) {
        Administrador admin = new Administrador();
        try {
            String Nombre = "";
            String Usuario = "";
            int Cedula = 0;
            String sql = "SELECT * FROM alma_innovation.administrador where Nombre='" + nombre + "'";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Nombre = rs.getString("Nombre");
                Usuario = rs.getString("Usuario");
                Cedula = rs.getInt("CC_Administrador");
            }
            admin.SetNombre(Nombre);
            admin.SetUsuario(Usuario);
            admin.SetCC(Cedula);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return admin;
    }
}
