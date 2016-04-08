package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Rodriguez
 */
public class Ciudad {
private int Id_ciudad;
private String Nombre_ciudad;
private String Departamento;

    public Ciudad() {
    }

    public Ciudad(int Id_ciudad, String Nombre_ciudad, String Departamento) {
        this.Id_ciudad = Id_ciudad;
        this.Nombre_ciudad = Nombre_ciudad;
        this.Departamento = Departamento;
    }


public int getId_ciudad(){
return Id_ciudad;}
public void SetId_ciudad(int Id_ciudad){
this.Id_ciudad=Id_ciudad;}

public String getNombre_ciudad(){
return Nombre_ciudad;}
public void SetNombre_ciudad(String Nombre_ciudad){
this.Nombre_ciudad= Nombre_ciudad;}

public String getDepartamento(){
return Departamento;}
public void SetDepartamento(String Departamento){
this.Departamento=Departamento;}



}
