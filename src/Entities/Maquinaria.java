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
public class Maquinaria {
    String Maquina;
    int TiempoVida;
    float CostoTotal, CostoHora;

    public Maquinaria(String Maquina, int TiempoVida, float CostoTotal, float CostoHora) {
        this.Maquina = Maquina;
        this.TiempoVida = TiempoVida;
        this.CostoTotal = CostoTotal;
        this.CostoHora = CostoHora;
    }

    public String getMaquina() {
        return Maquina;
    }

    public void setMaquina(String Maquina) {
        this.Maquina = Maquina;
    }

    public int getTiempoVida() {
        return TiempoVida;
    }

    public void setTiempoVida(int TiempoVida) {
        this.TiempoVida = TiempoVida;
    }

    public float getCostoTotal() {
        return CostoTotal;
    }

    public void setCostoTotal(float CostoTotal) {
        this.CostoTotal = CostoTotal;
    }

    public float getCostoHora() {
        return CostoHora;
    }

    public void setCostoHora(float CostoHora) {
        this.CostoHora = CostoHora;
    }

    @Override
    public String toString() {
        return "Maquinaria{" + "Maquina=" + Maquina + ", TiempoVida=" + TiempoVida + ", CostoTotal=" + CostoTotal + ", CostoHora=" + CostoHora + '}';
    }

    
    
}
