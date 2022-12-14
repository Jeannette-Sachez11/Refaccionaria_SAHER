/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refaccionaria.buscar;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import refaccionaria.Acciones.*;

/**
 *
 * @author jesanher
 */
public class Buscar_Empleado extends javax.swing.JPanel {

    PreparedStatement ps;
    ResultSet rs;
    Connection conex;
    Conexion c = new Conexion();

    /**
     * Creates new form Buscar_Empleado
     */
    public Buscar_Empleado() {
        initComponents();
        init();
        conex = c.ConectarBD();
        mostar_datos();
    }

    public void init() {
        Tabla_Empleado.fixTable(jScrollPane1);
    }

    public void mostar_datos() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            Tabla_Empleado.setModel(modelo);
            String sql = "select id_Emp, nombre_Emp, ap_Pat, ap_Mat, case status_Empleado when 1 then 'Empleado normal' when 2 then 'Encargado' END ,tel_Empleado, correo from empleado order by id_Emp;";
            System.out.println(sql);//el case es para asignar el valor que uno quiera que aparezca
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("ID Empleado");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido paterno");
            modelo.addColumn("Apellido materno");
            modelo.addColumn("status");
            modelo.addColumn("Telefono");
            modelo.addColumn("Correp");
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
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
        bBuscar = new javax.swing.JButton();
        txtnombre = new refaccionaria.swing.txtf.TextFielda();
        roundPanel1 = new refaccionaria.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Empleado = new refaccionaria.swing.table.Table();
        txtApelidoP = new refaccionaria.swing.txtf.TextFielda();
        txtApeliidoM = new refaccionaria.swing.txtf.TextFielda();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empleado.png"))); // NOI18N
        jLabel1.setText("Mostar Empleado");

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

        txtnombre.setLabelText("Nombre del empleado");

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        Tabla_Empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID empleado", "Nombre", "Apellido Paterno", "Apellido Materno", "Estatus", "Telefono", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla_Empleado);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtApelidoP.setLabelText("Apellido paterno");

        txtApeliidoM.setLabelText("Apellido materno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel1)
                .addContainerGap(349, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApelidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApeliidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApelidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApeliidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        try {
            String nombre = txtnombre.getText();
            String ap_Pat = txtApelidoP.getText();
            String ap_Mat = txtApeliidoM.getText();
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            Tabla_Empleado.setModel(modelo);
            String sql = "select id_Emp, nombre_Emp, ap_Pat, ap_Mat, case status_Empleado when 1 then 'Empleado normal' when 2 then 'Encargado' END ,tel_Empleado, correo from empleado where nombre_Emp='" + nombre + "' and ap_Pat='" + ap_Pat + "' and ap_Mat='" + ap_Mat + "'";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("ID Empleado");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido paterno");
            modelo.addColumn("Apellido materno");
            modelo.addColumn("status");
            modelo.addColumn("Telefono");
            modelo.addColumn("Correo");
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_bBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private refaccionaria.swing.table.Table Tabla_Empleado;
    private javax.swing.JButton bBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private refaccionaria.swing.RoundPanel roundPanel1;
    private refaccionaria.swing.txtf.TextFielda txtApelidoP;
    private refaccionaria.swing.txtf.TextFielda txtApeliidoM;
    private refaccionaria.swing.txtf.TextFielda txtnombre;
    // End of variables declaration//GEN-END:variables
}
