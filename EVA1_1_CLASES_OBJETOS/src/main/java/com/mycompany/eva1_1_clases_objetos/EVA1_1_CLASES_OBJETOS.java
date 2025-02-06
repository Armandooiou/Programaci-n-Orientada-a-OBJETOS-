/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_1_clases_objetos;

/**
 *
 * @author aaro1
 */
public class EVA1_1_CLASES_OBJETOS {

    public static void main(String[] args) {
        // CREAR UN OBJETO
        //INSTANCIAR
        //Identificador para guardar la direccion en memoria
        //Variable de un tipo de dato abstracto
        Persona perso1;//declaramos una variable de tipo persona 
        //asignamos memoria
        perso1 = new Persona();//creamos un objeto de tipo persona
        perso1.edad = 10;
        perso1.genero = "H";
        perso1.nombre = "Juan Peres";
        perso1.imprimirDatos();
        System.out.println(perso1);
        //JAVA:
        //no accedemos a direccion reales de memoria(RAM)
        //A las dirrecciones de memoria (falsas) se les llama 
        //REFERENCIAS.
        //APUNTADOR--> Variables que almacena una direccion real (RAM)
        
        System.out.println("Hello World!");
    
    }
}

class Persona{
    //DATOS - ESTADO - ATRIBUTOS 
    String nombre;
    int edad;
    String genero;
    //COMPORTAMIENTO
    void imprimirDatos(){
        System.out.println("Nombre:" + nombre);
         System.out.println("Edad:" + edad );
          System.out.println("Genero:" + genero);
    }
}