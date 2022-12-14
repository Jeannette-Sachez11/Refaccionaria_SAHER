package refaccionaria.Validaciones;

import java.sql.*;
import javax.swing.*;
import refaccionaria.Acciones.Conexion;

/**
 *
 * @author Noe Guillen Gerardo
 */
public class ValidarC {

    Connection conex;
    Conexion c = new Conexion();
    Statement st;
    ResultSet rs = null;
    PreparedStatement ps = null;
    String sql;//variable para recibir las sentencias de insercion
    int respu;

    public ValidarC() {
        conex = c.ConectarBD();
    }

    public int ValidarCliente(String nombre, String ap_Pat, String ap_Mat) {//metodo que valida el dato antes de registrase en la base de datos
        respu = 0;//bandera
        try {
            sql = "select nombre, ap_Pat, ap_Mat from cliente where nombre='" + nombre + "' and ap_Pat='" + ap_Pat + "' and ap_Mat='" + ap_Mat + "';";
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                System.out.println("El dato existe en la base de datos!!");
                respu = 0;//si el dato fue encontado se da la bandera de 0
            } else {
                System.out.println("El dato no ha sido registrado");
                respu = 1;//el dato NO fue encontrado asi que manda la bandera de 1
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return respu;
    }//metodo de validar categoria

    public int ValidarEmpleado(String nombre_Emp, String ap_Pat, String ap_Mat) {//metodo que valida el dato antes de registrase en la base de datos
        respu = 0;//bandera
        try {
            sql = "select nombre_Emp, ap_Pat, ap_Mat from Empleado where nombre_Emp='" + nombre_Emp + "' and ap_Pat= '" + ap_Pat + "' and ap_Mat='" + ap_Mat + "';";
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                System.out.println("El dato existe en la base de datos!!");
                respu = 0;//si el dato fue encontado se da la bandera de 0
            } else {
                System.out.println("El dato no ha sido registrado");
                respu = 1;//el dato NO fue encontrado asi que manda la bandera de 1
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return respu;
    }//metodo de validar los empleados

    public int ValidarProveedor(String rfc, String nombre, String telefono) {//metodo que valida el dato antes de registrase en la base de datos
        respu = 0;//bandera
        try {
            sql = "select rfc_Proveedor, nombre, telefono from Proveedor where rfc_Proveedor = '" + rfc + "' and nombre = '" + nombre + "' and telefono = '" + telefono + "';";
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                System.out.println("El dato existe en la base de datos!!");
                respu = 0;//si el dato fue encontado se da la bandera de 0
            } else {
                System.out.println("El dato no ha sido registrado");
                respu = 1;//el dato NO fue encontrado asi que manda la bandera de 1
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return respu;
    }//metodo de validar proveedores

    public int ValidarTipoM(String modelo, String nombre_TipoM, String marca, int anio) {//metodo que valida el dato antes de registrase en la base de datos
        respu = 0;//bandera
        try {
            sql = "select modelo, marca, anio from Tipo_De_Moto where modelo = '" + modelo + "' and marca = '" + marca + "' and anio = " + anio + ";";
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                System.out.println("El dato existe en la base de datos!!");
                respu = 0;//si el dato fue encontado se da la bandera de 0
            } else {
                System.out.println("El dato no ha sido registrado");
                respu = 1;//el dato NO fue encontrado asi que manda la bandera de 1
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return respu;
    }//metodo de validar el tipo de moto

    public int ValidarServicio(String descripcion, float precio_Servi) {//metodo que valida el dato antes de registrase en la base de datos
        respu = 0;//bandera
        try {
            sql = "select descripcion, precio_Servi from Servicios where descripcion = '" + descripcion + "' and precio_Servi = " + precio_Servi + ";";
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                System.out.println("El dato existe en la base de datos!!");
                respu = 0;//si el dato fue encontado se da la bandera de 0
            } else {
                System.out.println("El dato no ha sido registrado");
                respu = 1;//el dato NO fue encontrado asi que manda la bandera de 1
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return respu;
    }//metodo de validar el tipo de servicio

    public int ValidarArticulo(String codi_Barra, String nombre_Art) {//metodo que valida el dato antes de registrase en la base de datos
        respu = 0;//bandera
        try {
            sql = "select codi_Barra, nombre_Arti from articulos where codi_Barra='" + codi_Barra + "' and nombre_Arti='" + nombre_Art + "';";
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                System.out.println("El dato existe en la base de datos!!");
                respu = 0;//si el dato fue encontado se da la bandera de 0
            } else {
                System.out.println("El dato no ha sido registrado");
                respu = 1;//el dato NO fue encontrado asi que manda la bandera de 1
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return respu;
    }//metodo de validar el articulo

    public int ValidarUsuario(String nombre_usuario) {//metodo que valida el dato antes de registrase en la base de datos
        respu = 0;//bandera
        try {
            sql = "select nombre_usuario from usuarios where nombre_usuario='" + nombre_usuario + "';";
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                System.out.println("El dato existe en la base de datos!!");
                respu = 0;//si el dato fue encontado se da la bandera de 0
            } else {
                System.out.println("El dato no ha sido registrado");
                respu = 1;//el dato NO fue encontrado asi que manda la bandera de 1
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return respu;
    }//metodo de validar usuario

    public int Validar_ArticuloV(String codi_Barra) {//metodo que valida el dato antes de registrase en la base de datos
        respu = 0;//bandera
        try {
            sql = "select codi_Barra, nombre_Arti from articulos where codi_Barra='" + codi_Barra + "';";
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                System.out.println("El dato existe en la base de datos!!");
                respu = 0;//si el dato fue encontado se da la bandera de 0
            } else {
                System.out.println("El dato no ha sido registrado");
                respu = 1;//el dato NO fue encontrado asi que manda la bandera de 1
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return respu;
    }//metodo de validar el articulo en venta

    public int Validar_ServicioV(String descripcion) {//metodo que valida el dato antes de registrase en la base de datos
        respu = 0;//bandera
        try {
            sql = "select id_Servi, descripcion from Servicios where descripcion = '" + descripcion + "';";
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                System.out.println("El dato existe en la base de datos!!");
                respu = 0;//si el dato fue encontado se da la bandera de 0
            } else {
                System.out.println("El dato no ha sido registrado");
                respu = 1;//el dato NO fue encontrado asi que manda la bandera de 1
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return respu;
    }
    
    
    public int Validar_UsuarioI(String nombre_usuario,String contrasenia) {//metodo que valida el dato antes de registrase en la base de datos
        respu = 0;//bandera
        try {
            sql = "select * from usuarios where nombre_usuario='"+nombre_usuario+"' and contrasenia='"+contrasenia+"';";
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                System.out.println("El dato existe en la base de datos!!");
                respu = 0;//si el dato fue encontado se da la bandera de 0
            } else {
                System.out.println("El dato no ha sido registrado");
                respu = 1;//el dato NO fue encontrado asi que manda la bandera de 1
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return respu;
    }//metodo de validar usuario
    
    
    
}
