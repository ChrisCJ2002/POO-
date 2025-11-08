/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaBaseDatos;

import CapaLogica.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author LENOVO
 */
public class DataUsuario {

    private final Conexion conexionDB;

    public DataUsuario() {
        this.conexionDB = new Conexion(); 
    }

    public Usuario autenticar(String usarname, String contrasena) {
        
        
        String SQL_LOGIN = "SELECT username, passwordHash FROM usuario WHERE username = ?";
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Usuario usuarioAutenticado = null;

        try {
            Connection conn = conexionDB.abrirConexion();
            ps = conn.prepareStatement(SQL_LOGIN);
            
            
            ps.setString(1, usarname); 
            
            rs = ps.executeQuery();

            if (rs.next()) {
                
                String dbUsarname = rs.getString("username");
                String dbPasswordHash = rs.getString("passwordHash");

                
                if (contrasena.equals(dbPasswordHash)) {
                    
                    usuarioAutenticado = new Usuario(dbUsarname, dbPasswordHash); 
                }
            }
        } catch (Exception e) {
            System.err.println("Error de Base de Datos o Conexión: " + e.getMessage());
            e.printStackTrace(); 
        } finally {
            // Asegurarse de cerrar todos los recursos
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                conexionDB.cerrarConexion();
            } catch (Exception e) {
                 e.printStackTrace();
            }
        }
        return usuarioAutenticado;
    }
}