/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercisioss;

/**
 *
 * @author magox
 */
public class Constantes2 {
       public static void main(String[] args) {
    
           
           //convercion implicita
int edad = 30;
long edadL = edad;

System.out.println("Edad: " + edadL);



/////convercion explicita

double salarioD = 2500.75;
int salarioI = (int) salarioD; 

System.out.println("Salario: " + salarioI);


//////otro ejemplo

  double piDouble = 3.14159265359;
        float piFloat = (float) piDouble; 
        
        System.out.println("Valor de pi como float: " + piFloat);


        
}
}
//https://magnificent-humerus-627.notion.site/2-Constantes-en-Java-29e4b2e581f641aa91a57fc7fcd60a93