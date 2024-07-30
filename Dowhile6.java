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
public class Dowhile6 {
       public static void main(String[] args) {
           
                
           /*/do while que imprima hastqa donde yo quiera
           


           
           String num= JOptionPane.showInputDialog("hasta que numero quiere imprimir");
           
           int numero = Integer.parseInt(num);
           
           byte x=1;
            do{
                
                  System.out.println(x);
                 x++;
                
            }while(x<=numero);
            
           */
            
           
           
           
         /*
             String multiplo= JOptionPane.showInputDialog("en multiplos de cuanto?");
             String limite = JOptionPane.showInputDialog("hasta cuanto quiere imprimir?");
           
       
           int multipl= Integer.parseInt(multiplo);
           int x = Integer.parseInt(limite)-1;
           
          int contador=0;
           int operacion;
            do{
                operacion = multipl * contador;
                  System.out.println(multipl+"*"+contador+"="+operacion);
                 contador++;
                
            }while(operacion<=x);
           */
         
         
         
            String multiplo= JOptionPane.showInputDialog("en multiplos de cuanto?");
           
           
       
           int multipl= Integer.parseInt(multiplo);
         
           
          int contador=0;
           int operacion;
            do{
                operacion = multipl * contador;
                  System.out.println(multipl+"*"+contador+"="+operacion);
                 contador++;
                
            }while(operacion<=100-(1));
           
       }
}
//https://magnificent-humerus-627.notion.site/6-Estructuras-iterativas-do-while-2651ad221db74f54ac4e32462222b4a5