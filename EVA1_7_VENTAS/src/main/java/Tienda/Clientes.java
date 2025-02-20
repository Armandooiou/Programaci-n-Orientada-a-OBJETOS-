/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

/**
 *
 * @author aaro1
 */
public class Clientes {
 
 private String nombre;
    private String apellido;
    private int rfc;
    private String tipop ;
    private int edad;    
    private int telefono;

public String getNombre(){
    return nombre;
}
public void setNombre(String valor){
    nombre = valor;
}
public String getApellido(){
    return apellido;
}
public void setApellido(String valor){
    apellido = valor;
}
public int getRfc(){
    return rfc;
}
public void setRfc(int valor){
    rfc = valor;
}
public String getTipop(){
    return tipop;
}
public void setTipop(String valor){
    tipop = valor;
}
public int getEdad(){
    return edad;
}
public void setEdad(int valor){
    edad = valor;
}
public int getTelefono(){
    return telefono;
}
public void setTelefono(int valor){
    telefono = valor;
}



public void imprimirDatos(){
    
    System.out.println("Datos de la tienda:");
    System.out.println("Nombre:" + nombre);
    System.out.println("Apellido:" + apellido);
    System.out.println("Rfc:" + rfc); 
    System.out.println("Tipop:" + tipop);
    System.out.println("Edad:" + edad);
    System.out.println("Relefono" + telefono);


}































}
