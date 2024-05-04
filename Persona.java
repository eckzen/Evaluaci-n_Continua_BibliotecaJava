package dcodigosjava;

import java.util.*;

public class Persona{
    private String nombre;
    private String apellidos;
    private String correo;
    private String contrasena;
    private String rol;
    private String direccion;
    private int id;
    private int telefono;
    private Date fNacimiento;
    private Date fCreacion;



    public Persona(String nombre, String apellidos, String correo, String contrasena, String rol, String direccion, int id, int telefono, Date fNacimiento, Date fCreacion){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rol = rol;
        this.direccion = direccion;
        this.id = id;
        this.telefono = telefono;
        this.fNacimiento = fNacimiento;
        this.fCreacion = fCreacion;
    }





    private boolean iniciarSesion(String correos, String contrasenas){

        if(this.correo == correos && this.contrasena == contrasenas){
            console.out.println("Inicio correcto");
            return True;
        }
        else{
            console.out.println("Inicio incorrecto");
            return False;
        }
    

    }

    private void cerrarSesion(){
        System.out.println("Sesión cerrada");
    }

    public boolean verProducto(Producto productos){
        //comprobar si hay producto y mostrar sus atributos
        if(productos != null){ // si producto != no es igual a null..
            //atributos de clase Producto privados, ver como proporcionar método publico en esa clase
            System.out.println("Producto:");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Categoría: " + producto.getCategoria());
            System.out.println("Cantidad disponible: " + producto.getCantidad());
            return true;
            } else { 
                System.out.println("El producto no existe.");
                return false;
            }
        
    }

    public void rastrearEntregaProducto(){
        System.out.println("Rastreando la entrega del producto...");
        //consultar por ejemplo si se usa un programa externo de
        //seguimiento a partir de los datos (id, etc) o si hay que
        //añadir métodos públicos en la clase Inventario/Notificacion
        //para poder tomarlos aquí con un if else, por ej.
        //Inventario inventarios = obtenerInventario();
        //if(inventario != null){
        //List<Producto> productos = inventario.getProducto();
        //printnl...}else{...}

    }
    
    public String getNombre(){
        return nombre;

    }

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;

    }
}


