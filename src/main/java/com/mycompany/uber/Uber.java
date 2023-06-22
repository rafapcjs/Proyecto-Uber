/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uber;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author mi pc
 */

public class Uber implements Serializable {
private List<Conductor> conductores;
    private List<Usuario> usuarios;
    private List<Viaje> viajes;
    private String nombreArchivoConductores;
    private String nombreArchivoUsuarios;
    private String nombreArchivoViajes;

    public Uber(String nombreArchivoConductores, String nombreArchivoUsuarios, String nombreArchivoViajes) {
        this.conductores = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.viajes = new ArrayList<>();
        this.nombreArchivoConductores = nombreArchivoConductores;
        this.nombreArchivoUsuarios = nombreArchivoUsuarios;
        this.nombreArchivoViajes = nombreArchivoViajes;
        
        
       
    }

    

    public List<Conductor> getConductores() {
        return conductores;
    }

    public void setConductores(List<Conductor> conductores) {
        this.conductores = conductores;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
    }

    public String getNombreArchivoConductores() {
        return nombreArchivoConductores;
    }

    public void setNombreArchivoConductores(String nombreArchivoConductores) {
        this.nombreArchivoConductores = nombreArchivoConductores;
    }

    public String getNombreArchivoUsuarios() {
        return nombreArchivoUsuarios;
    }

    public void setNombreArchivoUsuarios(String nombreArchivoUsuarios) {
        this.nombreArchivoUsuarios = nombreArchivoUsuarios;
    }

    public String getNombreArchivoViajes() {
        return nombreArchivoViajes;
    }

    public void setNombreArchivoViajes(String nombreArchivoViajes) {
        this.nombreArchivoViajes = nombreArchivoViajes;
    }

    
    


    
    
    
    
    

    
   public Usuario buscarUsuario(String email, String contrasena, Iterable<Usuario> listaUsuarios) {
 for (Usuario usuario : listaUsuarios) {
 if (usuario.getEmail().equals(email) && usuario.getContrasena().equals(contrasena)) {
 return usuario;
 }
 }
 return null;
}

    
    public void agregarConductor(Conductor conductor) {
        this.getConductores().add(conductor);
    }
    
    

public void agregarUsuario(Usuario usuario) {
        boolean existeCorreo = false;
        for (Usuario u : getUsuarios()) {
            if (u.getEmail().equals(usuario.getEmail())) {
                existeCorreo = true;
                break;
            }
        }
        if (!existeCorreo) {
            getUsuarios().add(usuario);
        } else {
            System.out.println("El correo ya está registrado en el sistema");
        }
    }




public void agregarConductores(Conductor conductor) {
        boolean existeCorreo = false;
        for (Conductor c : getConductores()) {
            if (c.getCorreo().equals(conductor.getCorreo())) {
                existeCorreo = true;
                break;
            }
        }
        if (!existeCorreo) {
            getConductores().add(conductor);
        } else {
            System.out.println("El correo ya está registrado en el sistema");
        }
    }





   
   public void guardarUsuarios() {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(getNombreArchivoUsuarios()))) {
        oos.writeObject(getUsuarios());
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}
   
  public void guardarConductores() {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(getNombreArchivoConductores()))) {
        oos.writeObject(getConductores());
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}

 
public Usuario buscarUsuarioPorCorreoYContraseña(String correo, String contrasena) {
    ArrayList<Usuario> usuarios = Archivo.leerUsuarios("usuarios.txt");
    for (Usuario usuario : usuarios) {
        if (usuario.getEmail().equals(correo) && usuario.getContrasena().equals(contrasena)) {
            return usuario;
        }
    }
    return null;
}
 

public Conductor buscarConductorPorCorreoYContraseña(String correo, String contrasena) {
    ArrayList<Conductor> conductores = Archivo.leerConductores("conductores.txt");
    for (Conductor conductor : conductores) {
        if (conductor.getCorreo().equals(correo) && conductor.getContraseña().equals(contrasena)) {
            return conductor;
        }
    }
    return null;
}







 
    public void eliminarConductor(Conductor conductor) {
        conductores.remove(conductor);
    }
    public Conductor conductorAleatorio(){
        int index = (int)(Math.random()*conductores.size());
        return conductores.get(index);
        
    }




   

    public void agregarViaje(Viaje viaje) {
        this.getViajes().add(viaje);
    }

    public List<Conductor> conductoresDisponibles() {
        List<Conductor> conductoresDisponibles = new ArrayList<Conductor>();
        for (Conductor conductor : this.getConductores()) {
            if (conductor.getDisponible().equals("disponible")) {
                conductoresDisponibles.add(conductor);
            }
             }
        return conductoresDisponibles;
   
        
    }
    


    
 public void registrarConductorEnArchivo(Conductor conductor) {
    try {
        FileWriter fw = new FileWriter("conductores.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(conductor.getNombre() + "," + conductor.getPlaca() + "," + conductor.getUbicacion() + "," + conductor.getModeloDelCarro() + "," + conductor.getDisponible() + ","+conductor.getCorreo()+","+conductor.getContraseña()+","+conductor.getTelefono());
        bw.newLine();
        bw.close();
        fw.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
  
 }
    
    
   
    
  



    public void asignarConductor(Conductor conductor) {
        conductor.setDisponible("no disponible");
    }

    public void desasignarConductor(Conductor conductor) {
        conductor.setDisponible("disponible");
    }

   
  public void registrarConductor(String nombre, String placa, String ubicacion, String modeloDelCarro, String disponible, String correo, String contraseña, long telefono){
    Conductor conductor = new Conductor(nombre, placa, ubicacion, modeloDelCarro, disponible, correo, contraseña, telefono);
    conductores.add(conductor);
  }

   
    
    

    public void registrarUsuario(String nombre, String contrasena, String email,int telefono) {
        Usuario usuario = new Usuario(nombre, contrasena, email,telefono);
        getUsuarios().add(usuario);
    }

    public boolean validarInicioSesion(String nombreUsuario, String contrasena) {
        for (Usuario usuario : getUsuarios()) {
            if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena)) {
                return true;
            }
        }
         return false;
    }

    

   

    
public void guardarViajes() {
        try {
            FileOutputStream fos = new FileOutputStream(nombreArchivoViajes);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(viajes);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class JOptionPane {

        public JOptionPane() {
        }
    }




   
    

}
   


   

    


    
    


    
      
      
   

     
     
     
     
     
     
     
     

    
    
    
    
    
    



