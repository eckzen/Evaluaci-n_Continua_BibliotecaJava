package dcodigosjava;
import dcodigosjava.Persona;

import java.util.*; //import java.util.List;

public class Usuario extends Persona{
    private List<Producto> comprasRealizadas;
    private Tarjeta tarjetas

    public Usuario(String nombre, String apellidos, String correo, String contrasena, String rol, String direccion, int id, int telefono, Date fNacimiento, Date fCreacion, Tarjeta tarjetas){
        super(nombre, apellidos, correo, contrasena, rol, direccion, id, telefono,  fNacimiento, fCreacion);
        this.tarjetas = tarjetas;
        this.comprasRealizadas = new ArrayList<>();
    }
}



public void agregarProductoCarrito(Producto productos) {

    //aqui variables de clase Productos como ejemplo Sergi crearCurso
    comprasRealizadas.add(productos);
}

public void programarEntregaProducto() {

    Scanner scanner = new Scanner(System.in); 
    
    System.out.println("Selecciona una opción de entrega:");
    System.out.println("1. Entrega urgente");
    System.out.println("2. Entrega normal");
    System.out.println("3. Entrega programada");
    
    int opcion = scanner.nextInt(); //aqui lee la opcion
    
    // switch para responder segun opcion elegida
    switch (opcion) {
        case 1:
            System.out.println("Has elegido entrega urgente.");
            break;

        case 2:
            System.out.println("Has elegido entrega normal");
            break;

        case 3:
            System.out.println("Has elegido entrega programada");
            break;

        default:
            System.out.println("Opción no válida.");
    }
    
    scanner.close(); 
    
}

public boolean verPromocion(Promocion promociones) {
    // Implementación del método para verificar una promoción
    return false; // Supongamos que la promoción no se encuentra
}
