package Modelo;

import java.security.MessageDigest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Rodriguez
 */
public class Enfermera extends Usuario {
    private int Edad;
    private String Correo;
    private String Direccion;
    private int Telefono;
    private int idCiudad;
    private int ccAdministrador;
    

    public Enfermera(){
        Edad=0;
        Correo="";
    }
    
       public Enfermera(int cc, String nombre, String dir, String correo, int edad, int idcity, String contrasena, int telefono, String user, int ccadmin) {
        CC=cc;
        Nombre=nombre;
        Direccion=dir;
        Correo=correo;
        Edad=edad;
        Contraseña=contrasena;
        Telefono = telefono;
        
    }

    
    
    public String getNombre(){
    return Nombre;
    }
    public void SetNombre(String Nombre){
    this.Nombre= Nombre;
    }
    public int getCC(){
    return CC;
    }
    public void SetCC(int CC){
    this.CC= CC;}
    public String getContraseña(){
    return Contraseña;}
    public void SetContraseña(String Contraseña){
    this.Contraseña=Contraseña;}
    public int getEdad(){
    return Edad;
    }
    public void SetEdad(int Edad){
    this.Edad= Edad;}
    public String getCorreo(){
    return Correo;
    }
    public void SetCorreo(String Correo){
    this.Correo= Correo;}
    public String getDireccion(){
    return Direccion;
    }
    public void SetDireccion(String Direccion){
    this.Direccion= Direccion;}
    public int getTelefono(){
    return Telefono;
    }
    public void SetTelefono(int Telefono){
    this.Telefono= Telefono;}
    public void SetUsuario(String Usuario){
    this.Usuario= Usuario;}
    public String getUsuario(){
    return Usuario;
    }
    public void setIdCiudad(int id){
        idCiudad=id;
    }
    public int getIdCiudad(){
        return idCiudad;
    }
    public void setCcAdministrador(int id){
        ccAdministrador=id;
    }
    public int getCcAdministrador(){
        return ccAdministrador;
    }
    public void AgregarPaciente(){}
    public void ModificarPaciente(){}
    public void EliminarPaciente(){}
    
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
