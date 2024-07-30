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
public class ArreglosSuma10 {
     public static void main(String[] args) {
         
         
         
         /*
         int cant= Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del arreglo"));
         int[]a = new int[cant];
         int[]b = new int [a.length];
         int []c= new int [cant];
         
       
         for(int i=0; i<a.length; i++){
             
             a[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de a en la posicion"+i));
             System.out.print(a[i]+" |");
         }
            System.out.print("-----------------------");
          for(int i=0; i<b.length; i++){
             
             b[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de b en la posicion"+i));
             System.out.print(b[i]+" |");
             
         }
           System.out.print("-----------------------");
          
           for(int i=0; i<c.length; i++){
             
           c[i]=a[i]+b[i];    
           
           System.out.print(c[i]+" |");
         }
            System.out.print("-----------------------");
         
         */ 
            
         
         
         
            /*
            String[] arregloA = new String[1];
           
                String[] arregloB = new String[1];
                                                //// ME QUEDO BIEN T_T (Estaba jugando con la suma de los arrays)
                     String[] arregloC = new String[1];

      
             arregloA[0] = JOptionPane.showInputDialog("Ingrese su nombre");
        
                 arregloB[0] = JOptionPane.showInputDialog("Ingrese su apellido");


                      arregloC[0] = arregloA[0] + " " + arregloB[0];

      
        JOptionPane.showMessageDialog(null, "Nombre completo: " + arregloC[0]);


*/
            
            
           int[] arregloA = {1, 2, 3, 4, 5};
           
              int[] arregloB = {6, 7, 8, 9, 10};


        int[] suma = new int[arregloA.length];

        
        for (int i = 0; i < arregloA.length; i++) {
            
            suma[i] = arregloA[i] + arregloB[i];
        }

     
        System.out.println("La suma de los arreglos es:");
        
        for (int i = 0; i < suma.length; i++) {
            
            System.out.println(suma[i]);
        }     
        
     }
    
}
//https://magnificent-humerus-627.notion.site/10-Ejercicio-Suma-Arreglos-en-Java-d0d5cf1c7204499aa4a0fd0bfe99f608
