/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Yiyisman
 */
public class Proceso {
    String nombre, detalle;
    int CantidadProcesada, TiempoTotal, TiempoManoObra, idProceso;

    public Proceso(String nombre, String detalle, int CantidadProcesada, int TiempoTotal, int TiempoManoObra, int idProceso) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.CantidadProcesada = CantidadProcesada;
        this.TiempoTotal = TiempoTotal;
        this.TiempoManoObra = TiempoManoObra;
        this.idProceso = idProceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantidadProcesada() {
        return CantidadProcesada;
    }

    public void setCantidadProcesada(int CantidadProcesada) {
        this.CantidadProcesada = CantidadProcesada;
    }

    public int getTiempoTotal() {
        return TiempoTotal;
    }

    public void setTiempoTotal(int TiempoTotal) {
        this.TiempoTotal = TiempoTotal;
    }

    public int getTiempoManoObra() {
        return TiempoManoObra;
    }

    public void setTiempoManoObra(int TiempoManoObra) {
        this.TiempoManoObra = TiempoManoObra;
    }

    public int getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(int idProceso) {
        this.idProceso = idProceso;
    }

    @Override
    public String toString() {
        return "Proceso{" + "nombre=" + nombre + ", detalle=" + detalle + ", CantidadProcesada=" + CantidadProcesada + ", TiempoTotal=" + TiempoTotal + ", TiempoManoObra=" + TiempoManoObra + ", idProceso=" + idProceso + '}';
    }

    
    
}
