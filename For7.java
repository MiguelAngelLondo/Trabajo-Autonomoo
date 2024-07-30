/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercisioss;

/**
 *
 * @author magox
 */
 import javax.swing.JOptionPane;

public class For7 {
    
    
  
    
    
    
  
    public static void main(String[] args) {
     
    /* tablas de multplicar con el for
        
        String multiplo = JOptionPane.showInputDialog("En múltiplos de cuánto?");
        
        String limite = JOptionPane.showInputDialog("Hasta cuánto quiere imprimir?");

        int multipl = Integer.parseInt(multiplo);
        int x = Integer.parseInt(limite);

        System.out.println("Tabla de multiplos de " + multipl + " hasta " + limite + ":");

        for (int contador = 0; contador <= x; contador++) {
            
            int operacion = multipl * contador;
            
            System.out.println(multipl + " * " + contador + " = " + operacion);
        }
    
*/
    /* disminuir un numero
          String numer = JOptionPane.showInputDialog("Numero que quiere disminuir");
          
          int x = Integer.parseInt(numer);
          
     for (; x>= -1000; x--) {
            System.out.println(x);
        }
    
      */  
    
    
    /* (investigando encontre esta estructura en un foro , la pongo porq me parecio bacana) 
    
        triangulo con for
    */
    String numerin = JOptionPane.showInputDialog("Ingresa un número entero positivo:");
     
        int N = Integer.parseInt(numerin);

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    
    
        }
    }
    
    //https://magnificent-humerus-627.notion.site/7-Estructuras-iterativas-for-abda50b2abf54f4ea4cfba5718410cdf

