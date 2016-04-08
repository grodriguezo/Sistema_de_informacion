package Modelo;


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
public class Paciente {
    private String Nombre;
    private int CC;
    private String Direccion;
    private String Estado_tratamiento;
    private String Eps;
    private int Edad;
    private String Autorizacion_consentimiento ;
    private int Telefono;
    protected ArrayList<Tratamiento> ListaTratamiento = new ArrayList<Tratamiento>();
    protected ArrayList<Diagnostico> ListaDiagnostico = new ArrayList<Diagnostico>();
    
    
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
    this.CC=CC;}
    public String getEstado_taramiento(){
    return Estado_tratamiento;
    }
    public void SetEstado_tratamiento(String Estado_tratamiento){
    this.Estado_tratamiento= Estado_tratamiento;}
    public String getDireccion(){
    return Direccion;
    }
    public void SetDireccion(String Direccion){
    this.Direccion= Direccion;}
    public String getEps(){
    return Eps;
    }
    public void SetEps(String Eps){
    this.Eps= Eps;
    }
     public int getEdad(){
    return Edad;
    }
    public void SetEdad(int Edad){
    this.Edad= Edad;}
    
    public String getAutorizacion_consentimiento(){
    return Autorizacion_consentimiento; }
    public void SetAutorizacion_consentimiento(String Autorizacion_consentimiento){
    this.Autorizacion_consentimiento= Autorizacion_consentimiento;}
    public int getTelefono(){
    return Telefono;}
    public void SetTelefono(int Telefono){
    this.Telefono=Telefono;}
}
