package dcodigosjava;

import java.util.*;

public class Promocion{

    private float precioDescuento;
    private String texto;
    private int id;
    private String categoria;
    private Date fechaInicio;
    private Date fechaFinal;


    public Promocion(float precioDescuento, String texto, int id, String categoria, Date fechaInicio, Date fechaFinal){
        this.precioDescuento = precioDescuento;
        this.texto = texto;
        this.id = id;
        this.categoria = categoria;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public boolean crearPromocion(){
        return true;
        //retorna true cuando sea promocion creada
    }

    public void despublicarPromocion(Promocion promociones){

    }

    public Promocion administrarPromocion(Promocion promociones){
        
    }
}