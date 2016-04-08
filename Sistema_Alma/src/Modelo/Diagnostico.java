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
public class Diagnostico {
    private int Id_diagnostico;
    private String Nombre;
    
    
    public int getId_diagnostico(){
    return Id_diagnostico;}
    public void SetId_diagnostico(int Id_diagnostico){
    this.Id_diagnostico=Id_diagnostico;}
    
    public String getNombre(){
    return Nombre;}
    public void SetNombre(String Nombre){
    this.Nombre=Nombre;}
            
}
