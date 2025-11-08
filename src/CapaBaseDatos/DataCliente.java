/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaBaseDatos;

import CapaLogica.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class DataCliente {

    private final Conexion conexionDB;

    public DataCliente() {
        this.conexionDB = new Conexion();
    }

   
    public boolean registrarCliente(Cliente cliente) {
        
        // Consulta SQL para insertar todos los campos
        String SQL_INSERT = "INSERT INTO cliente ("
                + "dni, nombre, apellido_paterno, apellido_materno, "
                + "fecha_nacimiento, telefono, direccion"
                + ") VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement ps = null;
        Connection conn = null;
        boolean exito = false;

        try {
            conn = conexionDB.abrirConexion();
            ps = conn.prepareStatement(SQL_INSERT);

            // 1. DNI (VARCHAR)
            ps.setString(1, cliente.getDni());
       
            ps.setString(2, cliente.getNombre());
            
            ps.setString(3, cliente.getApellidoPaterno());
           
            ps.setString(4, cliente.getApellidoMaterno());
            
            // 5. Fecha Nacimiento (DATE - requiere java.sql.Date)
            // Convertimos java.util.Date a java.sql.Date
            long tiempo = cliente.getFechaNacimiento().getTime();
            java.sql.Date sqlDate = new java.sql.Date(tiempo);
            ps.setDate(5, sqlDate);

            // 6. Teléfono (VARCHAR)
            ps.setString(6, cliente.getTelefono());
            // 7. Dirección (VARCHAR)
            ps.setString(7, cliente.getDireccion());
            
            int filasAfectadas = ps.executeUpdate(); 
            
            if (filasAfectadas > 0) {
                exito = true;
            }

        } catch (Exception e) {
            System.err.println("Error al registrar cliente: " + e.getMessage());
            e.printStackTrace();
            exito = false;
        } finally {
            // Cierre de recursos
            try {
                if (ps != null) ps.close();
                conexionDB.cerrarConexion();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return exito;
    }
}