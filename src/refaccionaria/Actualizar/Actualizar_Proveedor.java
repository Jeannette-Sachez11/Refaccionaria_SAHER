/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refaccionaria.Actualizar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import refaccionaria.Acciones.Conexion;
import refaccionaria.Acciones.Update;
import refaccionaria.buscar.Buscar_Proveedor;

/**
 *
 * @author jesanher
 */
public class Actualizar_Proveedor extends javax.swing.JPanel {

    /**
     * Creates new form Actualizar_Proveedor
     */
    public Actualizar_Proveedor() {
        initComponents();
    }

    public void LimpiarProveedorTxt() {
        textFieldNombre_Prov.setText("");
        textFieldRfc.setText("");
        textFieldTel.setText("");

    }

    public void RellenotxtProveedor() {
        String nombre = textFieldRfc.getText();
        System.out.println("" + nombre);
        String sql = "Select * from Proveedor where rfc_Proveedor='" + nombre + "'";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.ConectarBD();

        System.out.println(sql);
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println(sql);
            int x = 0;

            while (rs.next()) {
                textFieldNombre_Prov.setText(rs.getString(2));
                textFieldTel.setText(rs.getString(3));
                x = 1;
            }
            if (x == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro proveeedor");
                LimpiarProveedorTxt();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
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
        textFieldTel = new refaccionaria.swing.txtf.TextFielda();
        textFieldRfc = new refaccionaria.swing.txtf.TextFielda();
        textFieldNombre_Prov = new refaccionaria.swing.txtf.TextFielda();
        bBuscar = new javax.swing.JButton();
        bActualizar = new javax.swing.JButton();
        Bcancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_businessman_35px_1.png"))); // NOI18N
        jLabel1.setText("Actualizar Proveedor");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setVerifyInputWhenFocusTarget(false);

        textFieldTel.setLabelText("Numero Telefonico");

        textFieldRfc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textFieldRfc.setLabelText("RFC del proveedor");

        textFieldNombre_Prov.setLabelText("Nombre del proveedor");

        bBuscar.setBackground(new java.awt.Color(165, 254, 203));
        bBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bBuscar.setForeground(new java.awt.Color(25, 25, 25));
        bBuscar.setText("Buscar");
        bBuscar.setBorder(null);
        bBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bActualizar.setBackground(new java.awt.Color(32, 189, 255));
        bActualizar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bActualizar.setForeground(new java.awt.Color(25, 25, 25));
        bActualizar.setText("Actualizar");
        bActualizar.setBorder(null);
        bActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

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

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese el RFC del proveedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldRfc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldNombre_Prov, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldRfc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(textFieldNombre_Prov, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(textFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );
    }// </editor-fold>//GEN-END:initComponents
      Update update = new Update();
    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        RellenotxtProveedor();

    }//GEN-LAST:event_bBuscarActionPerformed

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        // TODO add your handling code here:
        if (!"".equals(textFieldRfc.getText()) || !"".equals(textFieldNombre_Prov.getText())
                || !"".equals(textFieldTel.getText())) {

            update.updateProveedor(textFieldRfc.getText(), textFieldNombre_Prov.getText(), textFieldTel.getText());
            LimpiarProveedorTxt();

            JOptionPane.showMessageDialog(null, "Proveedor actualizado!");
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_bActualizarActionPerformed

    private void BcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcancelarActionPerformed
        // TODO add your handling code here:
        LimpiarProveedorTxt();
    }//GEN-LAST:event_BcancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcancelar;
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private refaccionaria.swing.txtf.TextFielda textFieldNombre_Prov;
    private refaccionaria.swing.txtf.TextFielda textFieldRfc;
    private refaccionaria.swing.txtf.TextFielda textFieldTel;
    // End of variables declaration//GEN-END:variables
}
