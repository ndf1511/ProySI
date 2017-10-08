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
    String nombre, detalle, Maquinaria;

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

    public String getMaquinaria() {
        return Maquinaria;
    }

    public void setMaquinaria(String Maquinaria) {
        this.Maquinaria = Maquinaria;
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

    public int getTiempoMaquinaria() {
        return TiempoMaquinaria;
    }

    public void setTiempoMaquinaria(int TiempoMaquinaria) {
        this.TiempoMaquinaria = TiempoMaquinaria;
    }

    public Proceso(String nombre, String detalle, String Maquinaria, int CantidadProcesada, int TiempoTotal, int TiempoManoObra, int idProceso, int TiempoMaquinaria) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.Maquinaria = Maquinaria;
        this.CantidadProcesada = CantidadProcesada;
        this.TiempoTotal = TiempoTotal;
        this.TiempoManoObra = TiempoManoObra;
        this.idProceso = idProceso;
        this.TiempoMaquinaria = TiempoMaquinaria;
    }
    int CantidadProcesada, TiempoTotal, TiempoManoObra, idProceso, TiempoMaquinaria;

    @Override
    public String toString() {
        return "Proceso{" + "nombre=" + nombre + ", detalle=" + detalle + ", Maquinaria=" + Maquinaria + ", CantidadProcesada=" + CantidadProcesada + ", TiempoTotal=" + TiempoTotal + ", TiempoManoObra=" + TiempoManoObra + ", idProceso=" + idProceso + ", TiempoMaquinaria=" + TiempoMaquinaria + '}';
    }

}
