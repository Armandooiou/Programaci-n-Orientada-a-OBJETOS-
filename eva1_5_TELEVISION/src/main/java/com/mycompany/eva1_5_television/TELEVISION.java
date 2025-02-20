/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_5_television;

/**
 *
 * @author aaro1
 */
public class TELEVISION {
private boolean encendido;
private int volumen;
private int canal;
  
  public void encenderApagar(){
    if(encendido == true)//TV encendido
                encendido = false; //apaga la TV
        else
        encendido = true;             
   }
   
  public void imprimirDatos(){
      if(encendido == true)
          System.out.println("TV Encendida!!");
      else
          System.out.println("TV Apagada");
      
      System.out.println("Volumen:" + volumen);
      System.out.println("canal" + canal);
  }
    
  //VOLUMEN REQUIERE DOS METODOS: SUBIR Y BAJAR VOLUMEN
  public void subirVolumen(){
       if (( volumen < 100)&& (encendido == true))
      volumen += 1;//acumulador --> volumen = volumen + 1;
  }
    
     public void bajarVolumen(){
        if ((volumen > 0)&& (encendido == true))
         volumen -= 1;//acumulador --> volumen = volumen - 1;
    //CANALES REQUIERE TRES METODOS: SUBIR,  BAJAR, ASIGNAR CANALES; 
     }
    
    public void subirCanales(){
        if (encendido == true)
        if ( canal == 10)
            canal = 0;
        else{
            canal += 1;
        }
            

    }
    public void bajarCanales(){
        
        if (encendido == true)
          if (canal == 0)
            canal = 10;
          else{
               canal -=1;
          } 
       
   
    }
    
    public void setCanal(int valor){
        canal = valor;
    }
    
    
    
    
    
    
    
    
    
    
    
}
