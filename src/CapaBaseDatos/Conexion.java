/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */

public class Conexion {

    private final String controlador = "org.postgresql.Driver";
    private final String urlConexion = "jdbc:postgresql://localhost:5432/ProyectoPoo";
    private final String usuario = "postgres";
    private final String clave = "123456";
    private Connection conexion;

    public Connection abrirConexion() throws Exception {
        Class.forName(controlador);
        conexion = DriverManager.getConnection(urlConexion, usuario, clave);
        return conexion;
    }

    public void cerrarConexion() throws Exception {
        if (conexion != null && !conexion.isClosed()) {
            conexion.close();
        }
    }

    public ResultSet ejecutarSQL(String sql) throws Exception {
        Statement sentencia = this.abrirConexion().createStatement();
        return sentencia.executeQuery(sql);
        // NO se cierra aquí
    }

    public ResultSet ejecutarSQL(PreparedStatement sp) throws Exception {
        return sp.executeQuery();
        // NO se cierra aquí
    }

    public int ejecutarSQLActualizable(PreparedStatement sp) throws Exception {
        int valor = sp.executeUpdate();
        return valor;
        // NO se cierra aquí
    }
}
