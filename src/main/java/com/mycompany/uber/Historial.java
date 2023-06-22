/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uber;

import java.io.Serializable;

/**
 *
 * @author mi pc
 */
public class Historial implements Serializable  {
    
   private static final long serialVersionUID = 1L;
    private int tamaño;
    private  Viaje Arreglo[];
    private String ubicacionArchivo = "Coche.dat";

    public Historial(int tam) {
        this.tamaño = tam;
        Arreglo = new Viaje[tamaño];
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Viaje getArreglo(int pos) {
        return Arreglo[pos];
    }

    public void setArreglo(int k, Viaje f) {
        this.Arreglo[k] = f;
    }

    public String getUbicacionArchivo() {
        return ubicacionArchivo;
    }

    public void setUbicacionArchivo(String ubicacionArchivo) {
        this.ubicacionArchivo = ubicacionArchivo;
    } 
    
    
    
    
    
    
}
