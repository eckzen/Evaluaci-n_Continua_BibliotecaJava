package dcodigosjava;

import java.util.*;

public class Reporte{
private String nombre;
private int id;
private Date fecha;
private Inventario Inventario;

public Reporte(String nombre, int id, Date fecha, Inventario inventario){
    this.nombre = nombre;
    this.id = id;
    this.fecha = fecha;
    this.inventario = inventario;
  }

  public File generarReportePDF(){

    System.out.println("Generando reporte PDF");
    //return new File("reporte.pdf");
  }

  public void enviarReporte(File fichero){

    System.out.println("Enviando reporte");
  }
}
