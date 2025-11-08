/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Cuenta {
     private String numeroCuenta;
    private Date fechaApertura;
    private double montoInicial;
    private Moneda tipoMoneda;
    private Estado tipoEstado;
    private String dniCliente;
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuento(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    public Moneda getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(Moneda tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public Estado getTipoestado() {
        return tipoEstado;
    }

    public void setTipoestado(Estado tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public Estado getTipoEstado() {
        return tipoEstado;
    }

    public void setTipoEstado(Estado tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }
    

      public Cuenta() {
        numeroCuenta = "";
        fechaApertura = null;
        montoInicial = 0.0;
        tipoMoneda = null;
        tipoEstado = Estado.ABIERTA;
        dniCliente = "";
    }
   
        
    
    
}
