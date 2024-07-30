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

public class Estruc_control3 {

    public static void main(String[] args) {
   
        
     
    
    
       /* simple 
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
        String edadBoton = JOptionPane.showInputDialog("ingresa tu edad");
        
        int edad = Integer.parseInt(edadBoton);
        
          if(edad>=18){
                    
            JOptionPane.showMessageDialog(null, "su nombre es: " +nombre + " y usted es mayor de edad" );
        }else{
              
    
                 JOptionPane.showMessageDialog(null, "su nombre es: " +nombre + " y usted es menor de edad" ); 
              
          }  
*/
       
     /*////anidada
     
      JOptionPane.showMessageDialog(null, "Materia 1");

        String materia1 = JOptionPane.showInputDialog("Ingresa el nombre de la materia:");
        String nota1 = JOptionPane.showInputDialog("Ingresa la nota 1:");

        JOptionPane.showMessageDialog(null, "Materia 2");

        String materia2 = JOptionPane.showInputDialog("Ingresa el nombre de la materia:");
        String nota2 = JOptionPane.showInputDialog("Ingresa la nota 2:");
         String random = JOptionPane.showInputDialog("ingresa un numero random que no pase de 100");
        
        

     
      
            int nota1_1 = Integer.parseInt(nota1);
            int nota2_2 = Integer.parseInt(nota2);
            int rando= Integer.parseInt(random);

          
            if (nota1_1 < 0 || nota1_1 > 5 || nota2_2 < 0 || nota2_2 > 5) {
                JOptionPane.showMessageDialog(null, "Las notas deben estar entre 0 y 5");
            } 
            
            else if(rando>100){
                
                   JOptionPane.showMessageDialog(null, "te dije que el numero no podia pasar de 100");
            }
            else {
              
                int promedio = (nota1_1 + nota2_2) / 2;

               
                JOptionPane.showMessageDialog(null, "La materia 1 es: " + materia1 + "\n"
                        + "La materia 2 es: " + materia2 + "\n"
                        + "El promedio de notas es: " + promedio +"\n"
                
                        + "el numero que escogiste es: " + rando);
            }

            */
            
     
            
     ////otro ejemplo
     
         String op = JOptionPane.showInputDialog("Ingresa el resultado\n\n  cuanto es 100*200");
         
        
        int ope = Integer.parseInt(op);
        
          if(ope>=20000){
                    
            JOptionPane.showMessageDialog(null, "Muy bien! usted es todo un matematico" );
        }else{
              
    
                 JOptionPane.showMessageDialog(null, "No es bro, sigue intentando" ); 
              
          }  
    }
}

//https://magnificent-humerus-627.notion.site/3-Estructuras-de-control-en-condicionales-simples-y-dobles-656fad0680ff4394b2ec71c2a4084f46