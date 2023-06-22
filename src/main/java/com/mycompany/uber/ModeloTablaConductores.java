/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uber;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mi pc
 */
public class ModeloTablaConductores extends DefaultTableModel {
   public ModeloTablaConductores(ArrayList<Conductor> conductores) {
        super(conductores.size(), 7);
        setColumnIdentifiers(new String[]{"Nombre", "Correo", "Telefono", "Modelo del carro", "Placa", "Ubicacion", "Disponible"});
        for (int i = 0; i < conductores.size(); i++) {
            setValueAt(conductores.get(i).getNombre(), i, 0);
            setValueAt(conductores.get(i).getCorreo(), i, 1);
            setValueAt(conductores.get(i).getTelefono(), i, 2);
            setValueAt(conductores.get(i).getModeloDelCarro(), i, 3);
            setValueAt(conductores.get(i).getPlaca(), i, 4);
            setValueAt(conductores.get(i).getUbicacion(), i, 5);
            setValueAt(conductores.get(i).getDisponible(), i, 6);
        }
      
     }
    public int getColumnCount() {
        return 7;
    } 

}
