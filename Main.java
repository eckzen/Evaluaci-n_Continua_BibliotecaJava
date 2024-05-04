package dcodigosjava;

import java.util.*;

import dcodigosjava.*; //importar todos o con package ya sirve?


 public class Main{
     public static void main (String[] arg){
    
        //por cada clase creada, se crea en main una instancia(nuevo objeto)?
         Persona persona1 = new Persona("erick", "Montoya", "correo@correo.com", "1234567890", 5,6,7,8,9,10);
        //con la instancia creada, se hace la llamada a cada método de esa clase
         persona1.iniciarSesion("correo@correo.com", "12345677890");
         persona1.cerrarSesion();
         //..luego resto de métodos...

        

         //Siguiente clase, por ejemplo Producto, primero se instancia:
         Producto producto = new Producto("Producto1", 1, "Categoria1", 10.99€, 100, new Date(), new Date());

         /*luego llamamos a su metodo boolean crearProducto pasandole la variable instancia
           producto y la listaProductos como argumento, y en este caso almacenarlo
           en una nueva variable (creacionExitosa) que tendrá un ifelse de verificación*/

         boolean creacionExitosa = persona1.crearProducto(producto, listaProductos);

         if (creacionExitosa) {
            System.out.println("Producto creado exitosamente.");
        } else {
            System.out.println("El producto ya existe.");
        }

         //..luego resto de métodos...así con cada clase,

         
        
    
     }
     }