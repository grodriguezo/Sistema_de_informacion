package Modelo;


import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Rodriguez
 */
public class Tratamiento {
      Date now = new Date(System.currentTimeMillis());
   private int Id_tratamiento;
   private String Nombre_tratamiento;
   private Date Fecha_inicio;
   private Date Fecha_final;
   protected ArrayList<Medicamentos> ListaMedicamentos = new ArrayList<Medicamentos>();
   protected ArrayList<Medico> ListaMedicos = new ArrayList<Medico>();
   
   
   public int getId_tratamiento(){
   return Id_tratamiento;}
   public void SetId_tratamiento(int Id_tratamiento){
   this.Id_tratamiento=Id_tratamiento;}
   
   public String Nombre_tratamiento(){
   return Nombre_tratamiento;}
   public void Nombre_tratamiento(String Nombre_tratamiento){
   this.Nombre_tratamiento=Nombre_tratamiento;}
   
   public Date getFecha_inicio(){
   return Fecha_inicio;}
   public void SetFecha_inicio(Date Fecha_inicio){
   this.Fecha_inicio=Fecha_inicio;}
   
   public Date getFecha_final(){
   return Fecha_final;}
   public void SetFecha_final(Date Fecha_final){
   this.Fecha_final=Fecha_final;}
}
