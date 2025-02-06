/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_4_autos;

import java.util.Scanner;

/**
 *
 * @author aaro1
 */
public class EVA1_4_AUTOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    Scanner captu = new Scanner(System.in);
    Vehivulo vehivu = new Vehivulo();
     
    System.out.println("Marca del vehiculo: ");
    String cade = captu.nextLine();
    vehivu.setMarca(cade);
    vehivu.setMarca("FORD");
    vehivu.setModelo("mustang");
    vehivu.setPrecio(2000000);
    vehivu.setYear(2024);
    vehivu.setColor("rojo");
    
    
     System.out.println("marca:" + vehivu.getMarca());
     System.out.println("modelo:" + vehivu.getModelo());
      System.out.println("precio:" + vehivu.getPrecio());
       System.out.println("year:" + vehivu.getYear());
        System.out.println("color:" + vehivu.getColor());
    vehivu.imprimirDatos();
    
    
    
    
    
    
    
    }
}
