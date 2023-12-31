/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.uber;

import static com.mycompany.uber.Archivo.leerConductores;
import java.io.Serializable;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mi pc
 */
public class Jconductor extends javax.swing.JFrame {
 
int pos=0;
Historial historial = new Historial(2);
        
    /**
     * Creates new form Jconductor
     */
    public Jconductor() {
 initComponents();
}

 
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDestino = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConductores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        button2 = new java.awt.Button();
        button1 = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        button3 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 170, -1));
        jPanel1.add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 160, -1));
        jPanel1.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 170, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Destino:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ubicacion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Costo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Usuario:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 170, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 180, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Seleccione al conductor Asignado");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 6, 300, 30));

        tablaConductores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaConductores);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 48, 403, 105));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 254, 243, 134));

        button2.setLabel("Ver Viaje");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel2.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 398, 120, 40));

        button1.setLabel("Ver Conductor");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel2.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 178, 120, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ingrese la informacion del Viaje ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, -1, -1));

        button3.setLabel("Ver Historial");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel2.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 456, 108, 44));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 740, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
  ArrayList<Conductor> conductores = Archivo.leerConductores("conductores.txt");
            ModeloTablaConductores modelo = new ModeloTablaConductores(conductores);
            tablaConductores.setModel(modelo);
            
    int filaSeleccionada = tablaConductores.getSelectedRow();
    if (filaSeleccionada != -1) {
        Conductor conductorSeleccionado = conductores.get(filaSeleccionada);
        String informacionConductor = "Información del conductor seleccionado:\n";
        informacionConductor += "Nombre: " + conductorSeleccionado.getNombre() + "\n";
        informacionConductor += "correo: " + conductorSeleccionado.getCorreo() + "\n";
        informacionConductor += "Telefono: " + conductorSeleccionado.getTelefono() + "\n";
        informacionConductor += "ModeloDelCarro: " + conductorSeleccionado.getModeloDelCarro() + "\n";
        informacionConductor += "Placa: " + conductorSeleccionado.getPlaca() + "\n";
        informacionConductor += "Ubicacion: " + conductorSeleccionado.getUbicacion() + "\n";
        informacionConductor += "Telefono: " + conductorSeleccionado.getTelefono()+ "\n";
        txtArea.setText(informacionConductor);
    } else {
        JOptionPane.showMessageDialog(null, "Por favor seleccione un conductor de la tabla.");
    }


    
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
 int fila = tablaConductores.getSelectedRow();
        String conductor = (String) tablaConductores.getValueAt(fila, 0);
        
        String pasajero = txtNombre.getText().trim();
String  ubicacionInicio = txtDestino.getText().trim();
String ubicacionFinal = txtUbicacion.getText().trim();
String Costo = txtCosto.getText().trim();
String fecha = txtFecha.getText().trim();

if (!ubicacionInicio.isEmpty() && !ubicacionFinal.isEmpty() && !Costo.isEmpty()) {
    String mensaje = "Origen: " + ubicacionInicio + "\nDestino: " +ubicacionFinal + "\nCosto: " + Costo;
    txtArea.setText(txtArea.getText() + mensaje + "\n");
} else {
    JOptionPane.showMessageDialog(this, "Por favor rellene todos los campos antes de continuar.", "Error", JOptionPane.ERROR_MESSAGE);
}

Viaje viaje = new Viaje( fecha,conductor, pasajero, ubicacionInicio, ubicacionFinal, Costo);

historial.setArreglo(pos, viaje);

GuardarHistorial.setOb(historial.getUbicacionArchivo(), (Serializable) historial); 
pos++;

 JOptionPane.showMessageDialog(null, "Taxi pedido con exito");
        
            

    

    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        HistorialViaje historial = new HistorialViaje(); historial.setVisible(true);
      // Crear una instancia del Jframe de registro
        historial = new HistorialViaje();
        // Hacerlo visible
        historial.setVisible(true);
        // Opcionalmente, cerrar o ocultar el Jframe de inicio de sesión
        dispose();
    }//GEN-LAST:event_button3ActionPerformed
   

public void mostar(DefaultTableModel ss) {
 historial = GuardarHistorial.getOb(historial.getUbicacionArchivo(), Historial.class);
 if (historial == null) {
 historial = new Historial(historial.getTamaño());
 }
 for (int i = 0; i < historial.getTamaño(); i++) {
 ss.addRow(new Object[]{
 historial.getArreglo(i).getPasajero(),
historial.getArreglo(i).getConductor(),
 historial.getArreglo(i).getUbicacionInicio(),
 historial.getArreglo(i).getUbicacionFinal(),
 historial.getArreglo(i).getFecha(),
 historial.getArreglo(i).getCosto(),
 });

}
 }



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jconductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaConductores;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
