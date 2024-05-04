package dcodigosjava;
import dcodigosjava.Persona;

import java.util.*; 

public class Admin extends Persona{
    //sin atributos

    public Admin(String nombre, String apellidos, String correo, String contrasena, String rol, String direccion, int id, int telefono, Date fNacimiento, Date fCreacion) {
        super(nombre, apellidos, correo, contrasena, rol, direccion, id, telefono, fNacimiento, fCreacion);
    }


public Producto administrarProducto(Producto productos) {
    // Implementación del método para administrar un producto
    // Aquí puedes realizar acciones como actualizar información, cambiar precios, etc.
    return producto;
}

public Promocion agregarPromocion() {
    // Implementación del método para agregar una promoción
    // Aquí puedes crear una nueva promoción y devolverla
    return new Promocion();
}

public boolean administrarPromocion(Promocion promociones) {
    // Implementación del método para administrar una promoción
    // Aquí puedes realizar acciones como activar, desactivar o eliminar una promoción
    return false;
}

}