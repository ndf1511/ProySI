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
public class PlanProduccion {
    
    String Mes,NombreMaquina;
            
    int TiempoTotal, TiempoMaquina;

    public PlanProduccion(String Mes, String NombreMaquina, int TiempoTotal, int TiempoMaquina) {
        this.Mes = Mes;
        this.NombreMaquina = NombreMaquina;
        this.TiempoTotal = TiempoTotal;
        this.TiempoMaquina = TiempoMaquina;
    }

    public PlanProduccion() {
        
    }

    


    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getNombreMaquina() {
        return NombreMaquina;
    }

    public void setNombreMaquina(String NombreMaquina) {
        this.NombreMaquina = NombreMaquina;
    }

    public int getTiempoTotal() {
        return TiempoTotal;
    }

    public void setTiempoTotal(int TiempoTotal) {
        this.TiempoTotal = TiempoTotal;
    }

    public int getTiempoMaquina() {
        return TiempoMaquina;
    }

    public void setTiempoMaquina(int TiempoMaquina) {
        this.TiempoMaquina = TiempoMaquina;
    }

    @Override
    public String toString() {
        return "PlanProduccion{" + "Mes=" + Mes + ", NombreMaquina=" + NombreMaquina + ", TiempoTotal=" + TiempoTotal + ", TiempoMaquina=" + TiempoMaquina + '}';
    }
    
}
