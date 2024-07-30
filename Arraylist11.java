/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercisioss;

/**
 *
 * @author magox
 */
 
import java.util.ArrayList;
public class Arraylist11 {
        public static void main(String[] args) {
            
            //////////////////////////
            
            ArrayList<Integer>numeros= new ArrayList<Integer>();
            
            numeros.add(5);
                        numeros.add(8);
                                    numeros.add(9);
                                                numeros.add(10);
                                                            numeros.add(11);
                                                                        numeros.add(12);
                                                                        
            System.out.print(numeros);
            
            ////////////////////////////////////
            
             ArrayList<String> nombres= new ArrayList<String>();
               nombres.add("papa");
                       nombres.add("mama");
                                   nombres.add("primo");
                                               nombres.add("prima");
                                                           nombres.add("tio");
                                                                       nombres.add("tia");
            System.out.print(nombres);
            
         
            
            //////////////////////////////////////////

               ArrayList nombress= new ArrayList();
                
               nombress.add("papa");
                       nombress.add("mama");
                                   nombress.add(8);
                                               nombress.add("prima");
                                                           nombress.add("tio");
                                                                       nombress.add("tia");
                                                                       nombress.add(2);
                                                                               
                                                                       
            System.out.print(nombress);
            
             nombress.add(2,100000);
               System.out.print(nombress);
                  String a= nombres.get(2);
               
                  System.out.print(a);
         
               
        }
}
//https://magnificent-humerus-627.notion.site/11-Estructuras-de-datos-ArrayList-23a951d207ed4a1d80d83e15d30a9d2d