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
public class Movimiento {
    private Date fecha;
    private String tipomovimiento;
    private double monto;
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;
    private double saldoResultante;

    public Movimiento(Date fecha, String tipomovimiento, double monto, Cuenta cuentaOrigen, Cuenta cuentaDestino, double saldoResultante) {
        this.fecha = fecha;
        this.tipomovimiento = tipomovimiento;
        this.monto = monto;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.saldoResultante = saldoResultante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipomovimiento() {
        return tipomovimiento;
    }

    public void setTipomovimiento(String tipomovimiento) {
        this.tipomovimiento = tipomovimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Cuenta getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(Cuenta cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public Cuenta getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(Cuenta cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public double getSaldoResultante() {
        return saldoResultante;
    }

    public void setSaldoResultante(double saldoResultante) {
        this.saldoResultante = saldoResultante;
    }
    
    
}
