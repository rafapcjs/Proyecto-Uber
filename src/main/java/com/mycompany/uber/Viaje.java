/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uber;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mi pc
 */
public class Viaje  implements Serializable {
   
    
    private String fecha;
    private String conductor;
    private String pasajero;
    private String ubicacionInicio;
    private String ubicacionFinal;
    private String Costo;

    public Viaje(String fecha, String conductor, String pasajero, String ubicacionInicio, String ubicacionFinal, String Costo) {
        this.fecha = fecha;
        this.conductor = conductor;
        this.pasajero = pasajero;
        this.ubicacionInicio = ubicacionInicio;
        this.ubicacionFinal = ubicacionFinal;
        this.Costo = Costo;
    }

 
 

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public String getUbicacionInicio() {
        return ubicacionInicio;
    }

    public void setUbicacionInicio(String ubicacionInicio) {
        this.ubicacionInicio = ubicacionInicio;
    }

    public String getUbicacionFinal() {
        return ubicacionFinal;
    }

    public void setUbicacionFinal(String ubicacionFinal) {
        this.ubicacionFinal = ubicacionFinal;
    }

    public String getCosto() {
        return Costo;
    }

    public void setCosto(String Costo) {
        this.Costo = Costo;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

  

   
}

    


    

        
