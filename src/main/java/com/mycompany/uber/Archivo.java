/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uber;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author mi pc
 */
public class Archivo implements Serializable {
   
 



 
    
        public void guardarUsuarios(ArrayList<Usuario> usuarios, String archivo) {
        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(usuarios);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

            
            
    public static ArrayList<Viaje> leerViajes(String archivo) {
        ArrayList<Viaje> viajes = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);

            viajes = (ArrayList<Viaje>) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return viajes;
    }
    
    public static ArrayList<Usuario> leerUsuarios(String archivo) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);

            usuarios = (ArrayList<Usuario>) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
    

    public static ArrayList<Conductor> leerConductores(String archivo) {
    ArrayList<Conductor> conductores = new ArrayList<>();
    try {
        FileInputStream fis = new FileInputStream(archivo);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        conductores = (ArrayList<Conductor>) ois.readObject();

        ois.close();
        fis.close();
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    return conductores;
    
    
}


}

     
    



    
    
    
    
    
    
    
    
    
    
    
    



    

