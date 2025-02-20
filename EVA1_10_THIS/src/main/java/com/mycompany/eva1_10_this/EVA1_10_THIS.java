/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10_this;

/**
 *
 * @author aaro1
 */
public class EVA1_10_THIS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
   Personas perso = new Personas ("Armando", "Rodriguez", 18);
   Laptop lap = new Laptop("Ryzen", 32, 1, 17, "Asus", "ASUS ROG Strix Scar 18");
   
   perso.setNombre("Armando");
   perso.setApellido("Rodriguez");
   perso.setEdad(18);
    
    
    
    System.out.println("Nombre:" + perso.getNombre());
    System.out.println("Apellido:" + perso.getApellido());
    System.out.println("Edad:" + perso.getEdad());

    lap.setProcesador("core i3");
     lap.setRam(8);
     lap.setSolidisk(1);
     lap.setPanrtalla(17);
     lap.setModelo("lenovo");
     lap.setModelo("lenovo v 14");

         System.out.println("Procesador: " + lap.getProcesador());
         System.out.println("Ram: " + lap.getRam());
         System.out.println("Disco Solido: " + lap.getSolidisk());
         System.out.println("Pantalla: " + lap.getPantalla());
         System.out.println("Marca: " + lap.getMarca());
         System.out.println("Modelo: " + lap.getModelo());

    
    
    
    }
}
