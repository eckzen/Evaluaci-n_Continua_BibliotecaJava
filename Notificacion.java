package dcodigosjava;

import java.util.*;


public class Notificacion {

    private Date fecha;
    private String texto;
    private int id;

    public Notificacion(Date fecha, String texto, Int id){
        this.fecha = fecha;
        this.texto = texto;
        this.id = id;
    }


public String generarNotificacion(List<Producto> productos, String texto, Date fecha, int id) {
     

}

public void enviarNotificacion(String mensaje, String email){
    System.out.println("Notificación enviada.");
}
}