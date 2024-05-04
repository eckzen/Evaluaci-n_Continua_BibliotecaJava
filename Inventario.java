package dcodigosjava;

import java.util.*;


public class Inventario {

    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public boolean crearInventario() {
        
        return true; // true porque creas inventario
    }

    public List<Producto> buscarProducto(String categoria) {
        List<Producto> productosEnCategoria = new ArrayList<>();
    
        // Itera sobre la lista de productos y agrega aquellos que coincidan con la categoría especificada
        for (Producto producto : productos) {
            if (producto.getCategoria().equals(categoria)) { //.equals() se usa para comparar si dos objetos son iguales en cuanto a su contenido

                productosEnCategoria.add(producto);
            }
        }
        return productosEnCategoria;

    /*creada nueva lista llamada productosEnCategoria, que se llenará con los productos
       que coinciden con la categoría especificada.
       después devuelve esta lista como resultado de la búsqueda,
       sin modificar la lista original de productos
       POR COMPROBAR */
    }
    
}
