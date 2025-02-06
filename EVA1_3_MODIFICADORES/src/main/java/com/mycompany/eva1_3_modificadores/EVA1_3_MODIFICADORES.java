/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_3_modificadores;

/**
 *
 * @author aaro1
 */
public class EVA1_3_MODIFICADORES {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
    //INSTANCIA UN OBJETO 
    //CLAAE IDENTIFICADOR = new CONSRUCTOR(PARAMETROS);
    Persona perso = new Persona();
    perso.setNombre("Armando Antonio");
    perso.setapellidos("Rodriguez Olivas");
    perso.setedad(18);
    perso.setGenero("Hombre");
    perso.setcurp();
    
    System.out.println("Nombre:" + perso.getNombre());
    System.out.println("Apellido:" + perso.getapellido());
    System.out.println("Edad:" + perso.getedad());
    System.out.println("Genero:" + perso.getGenero());
    System.out.println("Curp:" + perso.getcurp());
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
}
