/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_10_this;

/**
 *
 * @author aaro1
 */
public class Personas {
   private String nombre;
    private String apellidos;
    private int edad;

public Personas (){
 nombre = "SIN NOMBRE";
 apellidos = "SIN APELLIDO";
  edad = 0;  
}
 public Personas(String nombre, String apellido, int eda){
     this.nombre = nombre;
     this.apellidos = apellido;
     this.edad = edad;
 }   
  public void setNombre(String nombre){
    this.nombre = nombre;  
  }  
   public String getNombre(){
       return this.nombre;
   } 
   public void setApellido(String apellido){
    this.apellidos = apellidos;  
    
    }
    public String getApellido(){
        return this.apellidos;
    }
   public void setEdad(int eda){
    this.edad = edad;  
    }
    public int getEdad(){
        return this.edad;
    }

}
