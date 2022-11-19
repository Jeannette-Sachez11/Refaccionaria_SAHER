/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refaccionaria.Altas;

import java.awt.Component;
import java.sql.Connection;
import javax.swing.*;
import refaccionaria.Acciones.Conexion;
import refaccionaria.Acciones.Insert;
import refaccionaria.Validaciones.ValidarC;

/**
 *
 * @author jesanher
 */
public class Alta_Usuarios extends javax.swing.JPanel {

    Insert in = new Insert();
    Connection conex;
    ValidarC v = new ValidarC();
    Conexion c = new Conexion();
    private Component rootPane;

    /**
     * Creates new form Alta_Usuarios
     */
    public Alta_Usuarios() {
        initComponents();
    }

    public void Limpiar() {
        txtUsuario.setText("");
        txtContra1.setText("");
        txtcontra2.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bGuardar = new javax.swing.JButton();
        txtContra1 = new refaccionaria.swing.txtf.Password();
        txtcontra2 = new refaccionaria.swing.txtf.Password();
        txtUsuario = new refaccionaria.swing.txtf.TextFielda();
        Bcancelar = new javax.swing.JButton();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jLabel1.setText("Guardar Usuarios");

        bGuardar.setBackground(new java.awt.Color(44, 203, 87));
        bGuardar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bGuardar.setForeground(new java.awt.Color(25, 25, 25));
        bGuardar.setText("Guardar");
        bGuardar.setBorder(null);
        bGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        txtContra1.setBackground(new java.awt.Color(61, 61, 61));
        txtContra1.setForeground(new java.awt.Color(255, 255, 255));
        txtContra1.setLabelText("Contraseña");

        txtcontra2.setBackground(new java.awt.Color(61, 61, 61));
        txtcontra2.setForeground(new java.awt.Color(255, 255, 255));
        txtcontra2.setLabelText("Confirmar Contraseña");

        txtUsuario.setLabelText("Nombre de usuario");

        Bcancelar.setBackground(new java.awt.Color(235, 47, 47));
        Bcancelar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Bcancelar.setForeground(new java.awt.Color(25, 25, 25));
        Bcancelar.setText("Cancelar");
        Bcancelar.setBorder(null);
        Bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtContra1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                            .addComponent(txtcontra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtContra1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txtcontra2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        // TODO add your handling code here:
        try {
            String nombreUsuario = txtUsuario.getText();
            String contrasenia = txtContra1.getText();
            String contrasenia2 = txtcontra2.getText();
            
            if (!nombreUsuario.equals("") && !contrasenia.equals("") && !contrasenia2.equals("")) {
              
                if (v.ValidarUsuario(nombreUsuario) == 0) {
                    JOptionPane.showMessageDialog(rootPane, "El usuario ya fue registrado!!");
                } else {
                    if (contrasenia.equals(contrasenia2)) {
                        if (in.insertUsuarios(nombreUsuario, contrasenia)) {
                            JOptionPane.showMessageDialog(rootPane, "Registro exitoso!!");
                        } else {
                            JOptionPane.showConfirmDialog(rootPane, "Registro fallido");
                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Las contraseñas no son iguales!!");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Favor de ingresar todos datos!!!!");
            }

        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
        Limpiar();
    }//GEN-LAST:event_bGuardarActionPerformed

    private void BcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcancelarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_BcancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcancelar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JLabel jLabel1;
    private refaccionaria.swing.txtf.Password txtContra1;
    private refaccionaria.swing.txtf.TextFielda txtUsuario;
    private refaccionaria.swing.txtf.Password txtcontra2;
    // End of variables declaration//GEN-END:variables
}
