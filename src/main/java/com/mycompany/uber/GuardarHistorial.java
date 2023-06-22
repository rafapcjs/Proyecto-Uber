/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uber;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author mi pc
 */
public class GuardarHistorial  {
    public static boolean setOb(String nomb, Serializable objeto) {
        boolean des = false;
        try (FileOutputStream fos = new FileOutputStream(nomb);
                ObjectOutputStream salida = new ObjectOutputStream(fos);) {
            salida.writeObject(objeto);
            des = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return des;
    }

    public static <E> E getOb(String nomb, Class<E> clase) {
        E objeto = null;
        try (FileInputStream fis = new FileInputStream(nomb);
                ObjectInputStream entrada = new ObjectInputStream(fis);) {
            objeto = (E) entrada.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objeto;
    }

}

