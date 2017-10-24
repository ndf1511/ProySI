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
public class MaquinaProceso {
    int IdProceso, IdMaquinaria, TiempoMaquinariaProceso;

    public MaquinaProceso(int IdProceso, int IdMaquinaria, int TiempoMaquinariaProceso) {
        this.IdProceso = IdProceso;
        this.IdMaquinaria = IdMaquinaria;
        this.TiempoMaquinariaProceso = TiempoMaquinariaProceso;
    }

    public int getTiempoMaquinariaProceso() {
        return TiempoMaquinariaProceso;
    }

    public void setTiempoMaquinariaProceso(int TiempoMaquinariaProceso) {
        this.TiempoMaquinariaProceso = TiempoMaquinariaProceso;
    }

    public MaquinaProceso(int IdProceso, int IdMaquinaria) {
        this.IdProceso = IdProceso;
        this.IdMaquinaria = IdMaquinaria;
    }

    public int getIdProceso() {
        return IdProceso;
    }

    public void setIdProceso(int IdProceso) {
        this.IdProceso = IdProceso;
    }

    public int getIdMaquinaria() {
        return IdMaquinaria;
    }

    public void setIdMaquinaria(int IdMaquinaria) {
        this.IdMaquinaria = IdMaquinaria;
    }

    @Override
    public String toString() {
        return "MaquinaProceso{" + "IdProceso=" + IdProceso + ", IdMaquinaria=" + IdMaquinaria + ", TiempoMaquinariaProceso=" + TiempoMaquinariaProceso + '}';
    }

    
    
}
