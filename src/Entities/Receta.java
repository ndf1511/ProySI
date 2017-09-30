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
public class Receta {
    
    String materiaPrima; 
    float cant; 
    String prod; 

    public Receta(String materiaPrima, float cant, String prod) {
        this.materiaPrima = materiaPrima;
        this.cant = cant;
        this.prod = prod;
    }

    public String getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(String materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public float getCant() {
        return cant;
    }

    public void setCant(float cant) {
        this.cant = cant;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    @Override
    public String toString() {
        return "Receta{" + "materiaPrima=" + materiaPrima + ", cant=" + cant + ", prod=" + prod + '}';
    }
    
    
}
