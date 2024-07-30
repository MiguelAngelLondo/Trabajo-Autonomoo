/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercisioss;

/**
 *
 * @author magox
 */

import java.util.Hashtable;

public class Hastable12 {
            public static void main(String[] args) {
                
       ////////////////////////////
       
        Hashtable<String, String> hashK = new Hashtable<>();

  
        hashK.put("key1", "valor1");
        hashK.put("key2", "valor2");
        hashK.put("key3", "valor3");

   
        System.out.println("Elementos del Hashtable:");
        System.out.println(hashK);
                
        
        ////////////////////
                
       Hashtable<Integer, Integer> hashtable = new Hashtable<>();

     
        hashtable.put(1, 10);
        hashtable.put(2, 20);
        hashtable.put(3, 30);

       
        System.out.println("Elementos del Hashtable:");
        System.out.println(hashtable);
        
        //////////////////////////////////////////
        
         Hashtable<String, Integer> edades = new Hashtable<>();

     
        edades.put("Juan", 30);
        edades.put("Maria", 25);
        edades.put("Pedro", 35);

        String nombre = "Maria"; 
        int edad = edades.get(nombre);
        System.out.println(nombre + " tiene " + edad + " anios.");
        System.out.println("\nElementos del Hashtable:");
        for (String key : edades.keySet()) {
            System.out.println(key + " : " + edades.get(key));
        }
            }
    
}
//https://magnificent-humerus-627.notion.site/12-Estructuras-de-datos-HashTable-24eb3a7a8fe74d69a0012ad601bd358d