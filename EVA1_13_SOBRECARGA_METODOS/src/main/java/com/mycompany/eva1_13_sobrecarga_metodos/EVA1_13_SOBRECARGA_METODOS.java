/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_13_sobrecarga_metodos;

/**
 *
 * @author aaro1
 */
public class EVA1_13_SOBRECARGA_METODOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         System.out.println(100);
         System.out.println(100.10);
         System.out.println(3 > 5);
         System.out.println();
         System.out.println(new EVA1_13_SOBRECARGA_METODOS());
         System.out.println(sumar(5,3));
         System.out.println(sumar("Hola","mundo"));
         sumar();
    }
    
    //-----------HEADER (CABECEERA-------------------/
    //                    |---------FIRMA         ----|
    
    
    public static int sumar(int val1, int val2){//sumar(int,int)
        //IMPLEMENTACION
        return val1 + val2;
    } 
    public static String sumar(String val1, String val2){
//suamr(String,String)
        //IMPLEMENTACION
        return val1 + val2;
   } 
    
    public static void sumar(){
        
    }
    
}
