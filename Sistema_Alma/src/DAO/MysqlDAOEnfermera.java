
package DAO;

import Modelo.Enfermera;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MysqlDAOEnfermera implements DAOEnfermera {

    private Connection conexion;

    public MysqlDAOEnfermera()  throws SQLException{
        conexion = MysqlDAOFactory.conexion();
        
    }

    @Override
    public void insertarEnfermera(Enfermera enfermera) {
        try {
            String sql = "INSERT INTO enfermera (CC_Enfermera, Nombre, Direccion, Correo, edad, id_ciudad, Contraseña, Telefono, Usuario, CC_Administrador) "
                    + "VALUES (" + enfermera.getCC() + ", '" + enfermera.getNombre() + "', '"+ enfermera.getDireccion() + "', '" + enfermera.getCorreo() + "', '" + enfermera.getEdad() + "', " + enfermera.getIdCiudad() + ", '" + enfermera.getContraseña() + "', '" + enfermera.getTelefono() + "', '"  + enfermera.getUsuario() + "', '" + enfermera.getCcAdministrador() + "');";
            Statement st = conexion.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
    }

    @Override
    public void modificarEnfermera(Enfermera enfermera) {
        try {
            String sql = "UPDATE enfermera SET "
                    + "Nombre='"+ enfermera.getNombre() 
                    + "',Direccion= '" + enfermera.getDireccion() 
                    + "',Correo='"+ enfermera.getCorreo() 
                    + "',edad= " + enfermera.getEdad() 
                    + ",Id_Ciudad= " + enfermera.getIdCiudad()  
                    + ",Contraseña= '" + enfermera.getContraseña()  
                    + "',Telefono= " + enfermera.getTelefono() 
                    + ",Usuario= '" + enfermera.getUsuario()
                    + "' WHERE CC_Enfermera='"+enfermera.getCC()+"';";
            Statement st = conexion.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarEnfermera(int cc) {
        try {
            String sql = "DELETE from enfermera WHERE CC_Enfermera='"+cc+"';";
            Statement st = conexion.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @Override
    public Enfermera consultarEnfermera(int cedula) {
        Enfermera temp = new Enfermera();
        try {
            String sql = "SELECT * FROM enfermera where CC_Enfermera='"+cedula+"';";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            for(;rs.next();){
                int cc = rs.getInt("CC_enfermera");
                String nombre = rs.getString("Nombre");
                String dir = rs.getString("Direccion");
                String correo = rs.getString("Correo");
                int edad = rs.getInt("Edad");
                int idcity = rs.getInt("Id_Ciudad");
                String contrasena = rs.getString("Contrasena");
                int telefono = rs.getInt("Telefono");
                String user = rs.getString("Usuario");
                int ccadmin = rs.getInt("CC_Administrador");
                temp = new Enfermera(cc,nombre,dir,correo,edad,idcity,contrasena,telefono,user,ccadmin);
            }
            //admin = rs.getInt("CC_Administrador") + " " + rs.getString("Nombre");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return temp;
    }
    
    public boolean consultarEnfermera(String usuario,String contraseña){
        boolean enfermera =false;
        try {
            String sql= "SELECT Usuario,Contraseña FROM alma_innovation.enfermera where Usuario='"+usuario+"' and Contraseña='"+contraseña+"'";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String userdb=rs.getString("Usuario");
                String passdb=rs.getString("Contraseña");
                if (userdb.equals(usuario)&& passdb.equals(contraseña)){
                    enfermera=true;
                }
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return enfermera;
    }

}
