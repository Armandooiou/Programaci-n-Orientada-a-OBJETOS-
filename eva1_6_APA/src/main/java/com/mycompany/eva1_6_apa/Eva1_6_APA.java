/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_apa;

import Fichas_APA.Libro;
import Fichas_APA.SitioWeb;

/**
 *
 * @author aaro1
 */
public class Eva1_6_APA {

    public static void main(String[] args) {
        
        Libro book = new Libro();
        SitioWeb web = new SitioWeb();
     //LIBRO

        book.setAutor("Antoine de saint-Exupery");
       
        book.setTitulo("El Principito");
      
        book.setYear(1943);
        
         book.setCiudad("New York");
         
         book.setEditorial("Penguin Random");
book.imprimirReferencia();
         
     //Sitio_Web
web.imprimirReferencia();
     

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }

