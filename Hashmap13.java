/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercisioss;

/**
 *
 * @author magox
 */
import java.util.Map;
public class Hashmap13 {
    public static void main(String[] args) {
        
        
        /*
         HashMap<String, Integer> edades = new HashMap<>();

      
        edades.put("Juan", 30);
        edades.put("Maria", 25);
        edades.put("Pedro", 35);

       
        String nombre = "Maria";
        
        if (edades.containsKey(nombre)) {
            int edad = edades.get(nombre);
            System.out.println(nombre + " tiene " + edad + " anios.");
        } else {
            System.out.println(nombre + " no esta en el HashMap.");
        }

    
                     
     
                
        System.out.println("\nElementos del HashMap:");
        
        for (String nombrePersona : edades.keySet()) {
            int edad = edades.get(nombrePersona);
            
            System.out.println(nombrePersona + " : " + edad);
        }
        */
        
        
        
      /*
           HashMap<Integer, String> listaDeContactos = new HashMap<>();

           
        listaDeContactos.put(101, "Luis");
        listaDeContactos.put(202, "Ana");
        listaDeContactos.put(303, "Juan");
        listaDeContactos.put(404, "Lucia");
        listaDeContactos.put(505, null);

     
        System.out.println("Llaves: " + listaDeContactos.keySet());
        
 
        System.out.println("Valores: " + listaDeContactos.values());


        if (listaDeContactos.containsValue(null)) {
            System.out.println("a");
        }

   
        Iterator<Integer> iterador = listaDeContactos.keySet().iterator();
        while (iterador.hasNext()) {
            Integer id = iterador.next();
            System.out.println("ID: " + id + " - Nombre: " + listaDeContactos.get(id));
        }
        */
      
      
       Map<String, String> telefonos = new Hasmap<>();

 
        telefonos.put("Juan", "555-1234");
        telefonos.put("Ana", "555-5678");
        telefonos.put("Luis", "555-8765");

       
        String numeroDeJuan = telefonos.get("Juan");
        
        System.out.println("Numero de telefono de Juan: " + numeroDeJuan);

 
        System.out.println("Lista de todos los contactos:");
        for (Map.Entry<String, String> entrada : telefonos.entrySet()) {
            String nombre = entrada.getKey();
            String numero = entrada.getValue();
            System.out.println("Nombre: " + nombre + " - Telefono: " + numero);
        }
      
    
        
       
    }
}

    //https://magnificent-humerus-627.notion.site/13-Estructuras-de-datos-HashMap-0bb8a6b52b104fc1a1842a1782a59fdf
