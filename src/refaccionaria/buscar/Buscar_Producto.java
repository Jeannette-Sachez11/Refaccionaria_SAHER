/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refaccionaria.buscar;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import refaccionaria.Acciones.Conexion;

/**
 *
 * @author jesanher
 */
public class Buscar_Producto extends javax.swing.JPanel {

    PreparedStatement ps;
    ResultSet rs;
    Connection conex;
    Conexion c = new Conexion();

    /**
     * Creates new form Buscar_Producto
     */
    public Buscar_Producto() {
        initComponents();
        conex = c.ConectarBD();
        init();
        mostrar_datos();
    }
    
    public void init(){
        tabla_productos.fixTable(jScrollPane1);
    }

    public void mostrar_datos() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            tabla_productos.setModel(modelo);
            String sql = "select ar.codi_Barra, tm.modelo, ar.nombre_Arti, ar.marca, ar.precio, ar.stock from articulos ar inner join tipo_de_moto tm on ar.id_Tipo = tm.id_Tipo order by codi_Barra;";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Codigo de barra");
            modelo.addColumn("Modelo");
            modelo.addColumn("Nombre del articulo");
            modelo.addColumn("Marca");
            modelo.addColumn("Precio");
            modelo.addColumn("Stock");
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
        textFielda1 = new refaccionaria.swing.txtf.TextFielda();
        roundPanel1 = new refaccionaria.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_productos = new refaccionaria.swing.table.Table();
        bBuscar = new javax.swing.JButton();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mostrar Productos");

        textFielda1.setLabelText("Codigo de barra");

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de barra", "Modelo", "Nombre del articulo", "Marca", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_productos);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 353, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(344, 344, 344))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(textFielda1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFielda1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:ç
         try {
             String codi_barra=textFielda1.getText();
             
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            tabla_productos.setModel(modelo);
            String sql = "select ar.codi_Barra, tm.modelo, ar.nombre_Arti, ar.marca, ar.precio, ar.stock from articulos ar inner join tipo_de_moto tm on ar.id_Tipo = tm.id_Tipo where codi_Barra= '"+codi_barra+"';";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Codigo de barra");
            modelo.addColumn("Modelo");
            modelo.addColumn("Nombre del articulo");
            modelo.addColumn("Marca");
            modelo.addColumn("Precio");
            modelo.addColumn("Stock");
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
    private javax.swing.JButton bBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private refaccionaria.swing.RoundPanel roundPanel1;
    private refaccionaria.swing.table.Table tabla_productos;
    private refaccionaria.swing.txtf.TextFielda textFielda1;
    // End of variables declaration//GEN-END:variables
}
