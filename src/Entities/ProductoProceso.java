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
public class ProductoProceso {
    int IdProceso ,IdProducto;

    public ProductoProceso(int IdProceso, int IdProducto) {
        this.IdProceso = IdProceso;
        this.IdProducto = IdProducto;
    }

    public int getIdProceso() {
        return IdProceso;
    }

    public void setIdProceso(int IdProceso) {
        this.IdProceso = IdProceso;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    @Override
    public String toString() {
        return "ProductoProceso{" + "IdProceso=" + IdProceso + ", IdProducto=" + IdProducto + '}';
    }
    
    
}
