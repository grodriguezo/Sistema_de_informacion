package DAO;

import Modelo.Diagnostico;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MysqlDAODiagnostico implements DAODiagnostico {

    private Connection conexion;

    public MysqlDAODiagnostico() throws SQLException {
        conexion = MysqlDAOFactory.conexion();
    }

    @Override
    public boolean insertarDiagnostico(Diagnostico diagnostico) {
        boolean diag = false;
        try {
            String sql = "INSERT INTO diagnostico (Nombre) "
                    + "VALUES ('" + diagnostico.getNombre() + "');";
            Statement st = conexion.createStatement();
            st.executeUpdate(sql);
            diag = true;
            return diag;
        } catch (SQLException e) {
            e.printStackTrace();
            return diag;
        }

    }

    @Override
    public boolean modificarDiagnostico(Diagnostico diagnostico) {
        boolean diag = false;
        try {
            String sql = "UPDATE Diagnostico SET "
                    + "Nombre='"+ diagnostico.getNombre()
                    + "'WHERE Id_Diagnostico='"+diagnostico.getId_diagnostico()+"';";
            Statement st = conexion.createStatement();
            st.executeUpdate(sql);
            diag = true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return diag;
    }

    @Override
    public boolean eliminarDiagnostico(Diagnostico diagnostico) {
        boolean diag = false;
        try {
            String sql = "DELETE from Diagnostico WHERE Id_Diagnostico='"+diagnostico.getId_diagnostico()+"';";
            Statement st = conexion.createStatement();
            st.executeUpdate(sql);
            diag = true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return diag;    
    }

    public ArrayList<Diagnostico> listaDiagnostico() {
        ArrayList<Diagnostico> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Diagnostico";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Diagnostico diag = new Diagnostico();
                String nombrediag = rs.getString("Nombre");
                int Iddiag = rs.getInt("Id_Diagnostico");
                diag.SetNombre(nombrediag);
                diag.SetId_diagnostico(Iddiag);
                lista.add(diag);
            }
            return lista;
        } catch (SQLException e) {
            e.printStackTrace();
            return lista;
        }

    }

    public int buscar(String nombre) {
        int diagn = 0;
        try {
            String sql = "SELECT Id_Diagnostico FROM Diagnostico "
                    + "where Nombre='" + nombre + "'";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                diagn = rs.getInt("Id_Diagnostico");

            }
            return diagn;
        } catch (SQLException e) {
            e.printStackTrace();
            return diagn;
        }

    }

}
