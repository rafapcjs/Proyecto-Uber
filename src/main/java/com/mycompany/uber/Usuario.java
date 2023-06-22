/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uber;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mi pc
 */
public class Usuario implements Serializable  {
     private String nombreUsuario;
    private String contrasena;
    private String email;
    private long telefono;
   

   public Usuario(String nombre, String correo, String contrasena, long telefono) {
        this.nombreUsuario = nombre;
        this.email = correo;
        this.contrasena = contrasena;
        this.telefono = telefono;
    


   
   
   
   
   
}

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

}