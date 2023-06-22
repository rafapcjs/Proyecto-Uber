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
public class Conductor implements Serializable {
   
    private  String nombre;
    private  String placa;
    private String ubicacion;
    private String ModeloDelCarro;
    private String Disponible;
    private String Correo;
    private String Contraseña;
    private long telefono;
    

    public Conductor(String nombre, String placa, String ubicacion, String ModeloDelCarro, String Disponible, String Correo, String Contraseña, long telefono) {
        this.nombre = nombre;
        this.placa = placa;
        this.ubicacion = ubicacion;
        this.ModeloDelCarro = ModeloDelCarro;
        this.Disponible = Disponible;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
        this.telefono = telefono;
    }
    
    public String getInformacion() {
        return "Nombre: " + nombre + ", Correo: " + Correo + ", Placa: " + placa + ", Ubicación: " + ubicacion + ", Modelo: " + ModeloDelCarro+ ", Disponible: " + Disponible + ", Teléfono: " + telefono;}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getModeloDelCarro() {
        return ModeloDelCarro;
    }

    public void setModeloDelCarro(String ModeloDelCarro) {
        this.ModeloDelCarro = ModeloDelCarro;
    }

    public String getDisponible() {
        return Disponible;
    }

    public void setDisponible(String Disponible) {
        this.Disponible = Disponible;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    
}

    

