/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercisioss;

/**
 *
 * @author magox
 */
public class Arreglos9 {
       public static void main(String[] args) {
           
           String arregloA[];
  arregloA=new String[7];
 

  arregloA[0]="hola";
  arregloA[1]="como";
  arregloA[2]="estas";
  arregloA[3]="bro";
    arregloA[4]="?";
      arregloA[5]="Just";
        arregloA[6]="Do it";
  
  
  System.out.println("Saludo: "+arregloA[0]);
  System.out.println("Pregunta: "+arregloA[1]);
  System.out.println("Pregunta de como te sientes: "+arregloA[2]);
  System.out.println("hermano:  "+arregloA[3]);
   System.out.println("Signo: "+arregloA[4]);
    System.out.println("'solo': "+arregloA[5]);
     System.out.println("'hazlo': "+arregloA[6]);
           
           /////////////////////////////////////
           
     String arregloB[]; String mensaje[]={"Cristian"," y ","henry","se fueron ","de ","paseo "," y ", "no ","me ","llevaron"};

  System.out.println(mensaje[0]);
  System.out.println(mensaje[1]);
  System.out.println(mensaje[2]);                    //me di cuenta que si imprimo un array de mas por ej       
  System.out.println(mensaje[3]);                    // un array #10 me salta error pero aun asi lo imprime
    System.out.println(mensaje[4]);
      System.out.println(mensaje[5]);
        System.out.println(mensaje[6]);
          System.out.println(mensaje[7]);
            System.out.println(mensaje[8]);
              System.out.println(mensaje[9]);
              
              
              ///////////////////////////////////////////////////
              
               String[] nombres = {"cristian", "henry", "perrito del sena", "canchera"};

 
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("he " + i + ": " + nombres[i]);
        }
                
   }
}
//https://magnificent-humerus-627.notion.site/9-Arrays-c2d6ddba99e049d78b461ed6706f952d