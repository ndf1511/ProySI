/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Nico
 */
public class Inventario {
    
    String materiaP; 
    float cant; 

    public Inventario(String materiaP, float cant) {
        this.materiaP = materiaP;
        this.cant = cant;
    }

    public String getMateriaP() {
        return materiaP;
    }

    public void setMateriaP(String materiaP) {
        this.materiaP = materiaP;
    }

    public float getCant() {
        return cant;
    }

    public void setCant(float cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "Inventario{" + "materiaP=" + materiaP + ", cant=" + cant + '}';
    }
    
    
    
}
