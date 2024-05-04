package dcodigosjava;

import java.util.*;

public class Producto {
    private String nombre;
    private int id;
    private String categoria;
    private float precio;
    private int cantidad;
    private Date fechaCreacion;
    private Date fechaCaducidad;

    public Producto(String nombre, int id, String categoria, float precio, int cantidad, Date fechaCreacion, Date fechaCaducidad) {
        this.nombre = nombre;
        this.id = id;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaCreacion = fechaCreacion;
        this.fechaCaducidad = fechaCaducidad;
    }


    // métodos
    public boolean crearProducto() {
        if (listaProductos.contains(this)) {
            // Si el producto ya existe, devuelve false
            return false;
        } else {
            
            listaProductos.add(this);
            // devuelve true para indicar que la creación del producto fue exitosa
            return true;
    }

    public void despublicarProducto(Producto producto) {
        // Implementación del método para despublicar un producto
        // Aquí puedes realizar las acciones necesarias para despublicar un producto
    }

    private Producto administrarProducto(Producto producto) {
        // Implementación del método para administrar un producto
        // Este método es privado y solo puede ser accedido internamente
        // Aquí puedes realizar acciones como actualizar información del producto
        return producto;
    }

    // Getters y setters (omitiendo para simplificar)
}
}