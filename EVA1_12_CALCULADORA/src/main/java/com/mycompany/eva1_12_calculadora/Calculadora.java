/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_12_calculadora;

/**
 *
 * @author aaro1
 */
public class Calculadora {
private int sumar;
private int restar;
private int multiplicar;
private int dividir;
private int potencia;

public static int Sumar(int val1, int val2){
    return val1 + val2;
}
public static int Restar(int val1, int val2){    
    return val1 + val2;
}
public static int Multiplicar(int val1, int val2){
   return val1 + val2;
}
public static int Dividir(int val1, int val2){    
    return val1 + val2;
}
public static int Potencia(int val1, int val2){
   int resultado = 1;
    for (int i = 1; i <= val2; i++){
        resultado = resultado * val1;
    }
        
     return resultado;   
    }
}

