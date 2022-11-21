/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refaccionaria.Bajas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import refaccionaria.Acciones.Conexion;
import refaccionaria.Acciones.Delete;

/**
 *
 * @author jesanher
 */
public class Baja_TipoM extends javax.swing.JPanel {

    /**
     * Creates new form Baja_TipoM
     */
    public Baja_TipoM() {
        initComponents();
    }

    public void RellenotxtTM() {
        int nombre = Integer.parseInt(textFielda5.getText());
        System.out.println("" + nombre);
        String sql = "Select * from Tipo_De_Moto where id_Tipo=" + nombre + ";";
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
                textFielda1.setText(rs.getString(2));
                textFielda2.setText(rs.getString(3));
                textFielda3.setText(rs.getString(4));
                textFielda4.setText(rs.getString(5));
                x = 1;
            }
            if (x == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro Tipo de moto");
                LimpiarTMTxt();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }

    public void LimpiarTMTxt() {
        textFielda5.setText("");
        textFielda1.setText("");
        textFielda2.setText("");
        textFielda3.setText("");
        textFielda4.setText("");
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
        textFielda1 = new refaccionaria.swing.txtf.TextFielda();
        textFielda2 = new refaccionaria.swing.txtf.TextFielda();
        textFielda3 = new refaccionaria.swing.txtf.TextFielda();
        textFielda4 = new refaccionaria.swing.txtf.TextFielda();
        textFielda5 = new refaccionaria.swing.txtf.TextFielda();
        bBuscar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TipoM.png"))); // NOI18N
        jLabel1.setText("Tipo de moto");

        textFielda1.setLabelText("Modelo");

        textFielda2.setLabelText("Nombre del tipo de moto");

        textFielda3.setLabelText("Marca");

        textFielda4.setLabelText("Año de la motocicleta");

        textFielda5.setLabelText("ID del tipo de moto");

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

        bEliminar.setBackground(new java.awt.Color(235, 47, 47));
        bEliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bEliminar.setForeground(new java.awt.Color(25, 25, 25));
        bEliminar.setText("Eliminar");
        bEliminar.setBorder(null);
        bEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1))
                    .addComponent(textFielda2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFielda3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFielda1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textFielda5, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFielda4, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFielda5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(textFielda1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(textFielda2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(textFielda3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(textFielda4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        RellenotxtTM();
    }//GEN-LAST:event_bBuscarActionPerformed

    Delete delete = new Delete();
    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
        if (!"".equals(textFielda5.getText()) || !"".equals(textFielda1.getText())
                || !"".equals(textFielda2.getText())
                || !"".equals(textFielda3.getText()) | !"".equals(textFielda4.getText())) {

            delete.deleteTipoDeMoto((int) Double.parseDouble(textFielda5.getText()));
            LimpiarTMTxt();

            JOptionPane.showMessageDialog(null, "Tipo de moto eliminado con exito!");
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_bEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JLabel jLabel1;
    private refaccionaria.swing.txtf.TextFielda textFielda1;
    private refaccionaria.swing.txtf.TextFielda textFielda2;
    private refaccionaria.swing.txtf.TextFielda textFielda3;
    private refaccionaria.swing.txtf.TextFielda textFielda4;
    private refaccionaria.swing.txtf.TextFielda textFielda5;
    // End of variables declaration//GEN-END:variables
}
