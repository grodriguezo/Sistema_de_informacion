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
public class Medico {
    private String Nombre;
    private int Telefono;
    private int Id_medico;
    
     public String getNombre(){
    return Nombre;}
    public void SetNombre(String Nombre){
    this.Nombre= Nombre;}
    
    public int getTelefono(){
    return Telefono;}
    public void SetTelefono(int Telefono){
    this.Telefono=Telefono;}

    public int getId_medico(){
    return Id_medico;}
    public void SetId_medico(int Id_medico){
    this.Id_medico=Id_medico;} 
}
