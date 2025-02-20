/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_8_constructores;

/**
 *
 * @author aaro1
 */
public class Vehiculo {
    
  private String marca;
    private String modelo;
    private double precio;
    private int year;
    private String color;
    //CONSTRUCTORES - METODOS 
    //METOROS: NO TIENEN VALOR DE RETORNO
    //MODIFICADOR DE ACCESO NOMBRE DE LA CLASE (LISTA DE PARAMETROS)
    //CONSTRUCTOR  DEFAULT: CONSTRUCTOR SIN PARAMETROS   
   public Vehiculo(){
     System.out.println("CREAR OBJETO VEHICULO");
     marca = "SIN MARACA";
     modelo = "SIN MODELO";
     year = 0;
     precio = 0;
     color = "SIN COLOR";
  } 
   public Vehiculo ( String mar, String mod, int y, double pre, String col){
    marca = mar;
     modelo = mod;
     year = y;
     precio = pre;
     color = col;    
  
   
   
   }
   
   
   
   
   
   
   
//METODOS - COMPORTAMIENTO
    
    // get y set
    public String getMarca(){
        return marca;
    }
public void setMarca(String valor){
    marca = valor;
}
public String getModelo(){
    return modelo;
}
public void setModelo(String valor){
    modelo = valor;
}
public double getPrecio(){
    return precio;
}
public void setPrecio(double valor){
    precio = valor;
}
public int getYear(){
    return year;
}
public void setYear(int valor){
    year = valor;
}
public String getColor(){
    return color;
}
public void setColor(String valor){
    color = valor;
}

public void imprimirDatos(){
    
    System.out.println("Datos del vehiculo:");
    System.out.println("Marca:" + marca);
     System.out.println("Modelo:" + modelo);
      System.out.println("Precio:" + precio); 
     System.out.println("Year:" + year);
       System.out.println("Color:" + color);

}











}
