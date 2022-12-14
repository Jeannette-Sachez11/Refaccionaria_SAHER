package refaccionaria.Actualizar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import refaccionaria.Acciones.Conexion;
import refaccionaria.Acciones.Select;
import refaccionaria.Acciones.Update;
import refaccionaria.Validaciones.ValidarC;

/**
 *
 * @author jesanher
 */
public class Actualizar_Productos extends javax.swing.JPanel {

    Select s;
    ValidarC v = new ValidarC();
    Conexion c = new Conexion();

    /**
     * Creates new form Actualizar_Productos
     */
    public Actualizar_Productos() {
        initComponents();
        s = new Select();
        comboP();
    }

    public void LimpiarArticulosTxt() {
        textFieldCodi_Barra.setText("");
        // textFieldTipo_Moto.setText("");
        comboTipo.setSelectedIndex(0);
        textFieldNombre_Art.setText("");
        textFieldMarca.setText("");
        textFieldPrecio.setText("");
        textFieldStock.setText("");
    }

    public void comboP() {
        comboTipo.removeAll();
        //comboTipo.addItem("Seleccione");
        String[] buscarCod = s.verModelo();
        for (String i : buscarCod) {
            comboTipo.addItem(i);
        }

    }

    public void RellenotxtProductos() {
        String nombre = textFieldCodi_Barra.getText();
        System.out.println("" + nombre);
        String sql = "Select * from articulos where codi_barra='" + nombre + "'";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.ConectarBD();
        int id_tipo;
        String modelo;

        System.out.println(sql);
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println(sql);
            int x = 0;
            while (rs.next()) {
                //textFieldTipo_Moto.setText(rs.getString(2));
                id_tipo = Integer.parseInt(rs.getString(2));
                modelo = s.BuacarModelo(id_tipo);
                comboTipo.setSelectedItem(modelo);
                textFieldNombre_Art.setText(rs.getString(3));
                textFieldMarca.setText(rs.getString(4));
                textFieldPrecio.setText(rs.getString(5));
                textFieldStock.setText(rs.getString(6));
                x = 1;
            }
            if (x == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro producto");
                LimpiarArticulosTxt();
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
        textFieldCodi_Barra = new refaccionaria.swing.txtf.TextFielda();
        textFieldNombre_Art = new refaccionaria.swing.txtf.TextFielda();
        textFieldMarca = new refaccionaria.swing.txtf.TextFielda();
        textFieldPrecio = new refaccionaria.swing.txtf.TextFielda();
        textFieldStock = new refaccionaria.swing.txtf.TextFielda();
        bBuscar = new javax.swing.JButton();
        bActualizar = new javax.swing.JButton();
        Bcancelar = new javax.swing.JButton();
        comboTipo = new refaccionaria.swing.txtf.ComboBoxA();
        jLabel2 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(890, 690));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar Productos");

        textFieldCodi_Barra.setLabelText("Codigo de barras");

        textFieldNombre_Art.setLabelText("Nombre del articulo");

        textFieldMarca.setLabelText("Marca");

        textFieldPrecio.setLabelText("Precio");

        textFieldStock.setLabelText("Stock");

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

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));
        comboTipo.setLabeText("");
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el codigo de barras del producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(Bcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textFieldCodi_Barra, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                        .addComponent(textFieldNombre_Art, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldCodi_Barra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addComponent(textFieldNombre_Art, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(textFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(textFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(textFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents
     Update update = new Update();
    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        RellenotxtProductos();
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        // TODO add your handling code here:
        String modelo = comboTipo.getSelectedItem().toString();
        int id_Tipo;

        if (!"".equals(textFieldCodi_Barra.getText()) || !"".equals(textFieldNombre_Art.getText())
                || !"".equals(textFieldMarca.getText()) | !"".equals(textFieldPrecio.getText()) | !"".equals(textFieldStock.getText())) {
            id_Tipo = Integer.parseInt(s.BuacarIDTM(modelo));

            update.updateProductos(textFieldCodi_Barra.getText(), id_Tipo, textFieldNombre_Art.getText(), textFieldMarca.getText(), (float) Double.parseDouble(textFieldPrecio.getText()), Integer.parseInt(textFieldStock.getText()));
            LimpiarArticulosTxt();

            JOptionPane.showMessageDialog(null, "Articulos actualizado!");
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_bActualizarActionPerformed

    private void BcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcancelarActionPerformed
        // TODO add your handling code here:
        LimpiarArticulosTxt();
    }//GEN-LAST:event_BcancelarActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        // TODO add your handling code here:
        //  c = new Conexion();
        try {
            c = new Conexion();
            String modelo = comboTipo.getSelectedItem().toString();
            if (!modelo.equals("")) {
                String datos[] = s.verModelo();
            }
        } catch (Exception x) {

        }
    }//GEN-LAST:event_comboTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcancelar;
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bBuscar;
    private refaccionaria.swing.txtf.ComboBoxA comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private refaccionaria.swing.txtf.TextFielda textFieldCodi_Barra;
    private refaccionaria.swing.txtf.TextFielda textFieldMarca;
    private refaccionaria.swing.txtf.TextFielda textFieldNombre_Art;
    private refaccionaria.swing.txtf.TextFielda textFieldPrecio;
    private refaccionaria.swing.txtf.TextFielda textFieldStock;
    // End of variables declaration//GEN-END:variables
}
