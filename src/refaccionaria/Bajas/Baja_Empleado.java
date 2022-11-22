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
public class Baja_Empleado extends javax.swing.JPanel {

    /**
     * Creates new form Baja_Empleado
     */
    public Baja_Empleado() {
        initComponents();
    }

    public void RellenotxtEmpleado() {
        String nombre = textFielda1.getText();
        System.out.println("" + nombre);
        String sql = "Select * from Empleado where nombre_Emp='" + nombre + "'";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.ConectarBD();

        System.out.println(sql);
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println(sql);

            while (rs.next()) {
                textFielda7.setText(rs.getString(1));
                textFielda2.setText(rs.getString(3));
                textFielda3.setText(rs.getString(4));
                textFielda4.setText(rs.getString(5));
                textFielda5.setText(rs.getString(6));
                textFielda6.setText(rs.getString(7));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }

    public void LimpiarEmpleadoTxt() {
        textFielda7.setText("");
        textFielda1.setText("");
        textFielda2.setText("");
        textFielda3.setText("");
        textFielda4.setText("");
        textFielda5.setText("");
        textFielda6.setText("");

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
        bBuscar = new javax.swing.JButton();
        textFielda1 = new refaccionaria.swing.txtf.TextFielda();
        textFielda2 = new refaccionaria.swing.txtf.TextFielda();
        textFielda3 = new refaccionaria.swing.txtf.TextFielda();
        textFielda4 = new refaccionaria.swing.txtf.TextFielda();
        textFielda5 = new refaccionaria.swing.txtf.TextFielda();
        textFielda6 = new refaccionaria.swing.txtf.TextFielda();
        textFielda7 = new refaccionaria.swing.txtf.TextFielda();
        bEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empleado.png"))); // NOI18N
        jLabel1.setText(" Eliminar Empleado");

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

        textFielda1.setLabelText("Nombre  del Empleado");

        textFielda2.setLabelText("Apelldio Paterno");

        textFielda3.setLabelText("Apellido materno");

        textFielda4.setLabelText("Status del empleado");

        textFielda5.setLabelText("Numero Telefonico");

        textFielda6.setLabelText("Correo electronico");

        textFielda7.setLabelText("ID del Empleado");

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

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el nombre del empleado");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("para poder buscar y Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel1)
                .addContainerGap(320, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFielda7, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFielda5, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFielda4, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFielda3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFielda6, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(textFielda2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(textFielda1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(textFielda7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFielda1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFielda2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)))
                .addGap(31, 31, 31)
                .addComponent(textFielda3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(textFielda4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(textFielda5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(textFielda6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        RellenotxtEmpleado();
    }//GEN-LAST:event_bBuscarActionPerformed

    Delete delete= new Delete();
    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
        if(!"".equals(textFielda7.getText())|| !"".equals(textFielda1.getText())
            || !"".equals(textFielda2.getText())
            || !"".equals(textFielda3.getText())| !"".equals(textFielda4.getText())|!"".equals(textFielda5.getText())|!"".equals(textFielda6.getText())){
            
            delete.deleteEmpleado(Integer.parseInt(textFielda7.getText()));
            

            
            LimpiarEmpleadoTxt();

            JOptionPane.showMessageDialog(null, "Empleado eliminado con exito!");
        }else{
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_bEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private refaccionaria.swing.txtf.TextFielda textFielda1;
    private refaccionaria.swing.txtf.TextFielda textFielda2;
    private refaccionaria.swing.txtf.TextFielda textFielda3;
    private refaccionaria.swing.txtf.TextFielda textFielda4;
    private refaccionaria.swing.txtf.TextFielda textFielda5;
    private refaccionaria.swing.txtf.TextFielda textFielda6;
    private refaccionaria.swing.txtf.TextFielda textFielda7;
    // End of variables declaration//GEN-END:variables
}
