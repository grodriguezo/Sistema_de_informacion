
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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try {
            String sql= "INSERT INTO enfermera (CC_Enfermera, Nombre, Direccion, Correo, edad, id_ciudad, Contraseña, Telefono, Usuario, CC_Administrador) "
			+ "VALUES ("+enfermera.getCC()+", '"+enfermera.getNombre()+"', '"+enfermera.getDireccion()+"', '"+enfermera.getCorreo() +", '"+enfermera.getEdad()+"', '"+enfermera.getContraseña()+"', '"+enfermera.getTelefono()+"', '"+enfermera.getUsuario() +"');";
            Statement st = conexion.createStatement();
            st.executeUpdate(sql);
	} catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
	}
    
    }

    @Override
    public void modificarEnfermera(Enfermera enfermera) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarEnfermera(Enfermera enfermera) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
   // public ArrayList getListaEnfermera() {
      /*  ArrayList lista = new ArrayList<Enfermera>();
        Enfermera temp = new Enfermera();
        try {
            String sql = "SELECT * FROM enfermera";
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
                lista.add(temp);
            }
            //admin = rs.getInt("CC_Administrador") + " " + rs.getString("Nombre");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
     //   return lista;
    //}
    
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
                        } catch (SQLException e) {
                        // TODO Auto-generated catch block
                         e.printStackTrace();
                    }
    return enfermera;
            }

    @Override
    public ArrayList getListaEnfermera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
