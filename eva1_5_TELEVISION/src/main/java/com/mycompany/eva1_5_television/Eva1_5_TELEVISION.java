/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_television;

/**
 *
 * @author aaro1
 */
public class Eva1_5_TELEVISION {

    public static void main(String[] args) {
        System.out.println("Hello World!");
   
TELEVISION tv = new TELEVISION();

tv.encenderApagar();//BOTON ENCENDIDO DEL CONTROL
tv.subirVolumen();
tv.imprimirDatos();
tv.setCanal(3);
tv.subirCanales();
tv.imprimirDatos();
tv.subirCanales();
tv.imprimirDatos();
tv.subirCanales();
tv.imprimirDatos();
    
    }
    
}