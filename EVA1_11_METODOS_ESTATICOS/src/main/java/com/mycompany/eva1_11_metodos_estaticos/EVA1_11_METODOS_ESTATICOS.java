/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_metodos_estaticos;

/**
 *
 * @author aaro1
 */
public class EVA1_11_METODOS_ESTATICOS {

   public static void main(String[] args) {
   // Math 
       double valorAleatorio = Math.random();
        int valor = (int)(Math.random()* 1000);
       System.out.println(valorAleatorio);
        System.out.println(valor);
          //
          persona perso = new persona();
          perso.mostrarMensaje();
          //Math math = new Math();
   //USAR FORMULAS DE TEMPERATURA
  // Temperaturas tempe = new Temperaturas();
  // System.out.println(tempe.convertirFaC(100));
   System.out.println(Temperaturas.convertirFaC(100));
   System.out.println(Temperaturas.convertirCaF(100));
 System.out.println(Temperaturas.convertirCaK(100));
    System.out.println(Temperaturas.convertirKaC(100));
   
   
   
   }
}

class persona{
    int valor ;
            public void mostrarMensaje(){
               System.out.println("Hola mundo!!");
            }
}