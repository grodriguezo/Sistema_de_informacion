package Modelo;

import DAO.DAOFactory;
import java.security.MessageDigest;
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
public class Administrador extends Usuario {
    private DAOFactory dao;

    public void SetNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Administrador() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void SetCC(int CC) {
        this.CC = CC;
    }

    public int getCC() {
        return CC;
    }

    public void SetContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void SetUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void AgregarEnfermera(Enfermera enfermera) {
        dao.getDAOEnfermera().insertarEnfermera(enfermera);
    }
    public void ModificarEnfermera(Enfermera enfermera) {
        dao.getDAOEnfermera().modificarEnfermera(enfermera);
    }

    public void EliminarEnfermera(int cc) {
        dao.getDAOEnfermera().eliminarEnfermera(cc);
    }

    public  String md5(String clear) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] b = md.digest(clear.getBytes());

        int size = b.length;
        StringBuffer h = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            int u = b[i] & 255;
            if (u < 16) {
                h.append("0" + Integer.toHexString(u));
            } else {
                h.append(Integer.toHexString(u));
            }
        }
        return h.toString();
    }
}
