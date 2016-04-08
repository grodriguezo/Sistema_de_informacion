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
public class Medicamentos {
    private int Id_medicamento;
    private String Nombre_medicamento;
    private String Dosis;
    private String Observaciones;
    
    public int Id_medicamento(){
    return Id_medicamento;}
    public void SetId_medicamento(int Id_medicamento){
    this.Id_medicamento=Id_medicamento;}
    
    public String Nombre_medicamento(){
    return Nombre_medicamento;}
    public void SetNombre_medicamento(String Nombre_medicamento){
    this.Nombre_medicamento=Nombre_medicamento;}
    
    public String getObservaciones(){
    return Observaciones;}
    public void SetObservaciones(String Observaciones){
    this.Observaciones=Observaciones;}
    
}
