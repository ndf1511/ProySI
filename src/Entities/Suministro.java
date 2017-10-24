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
public class Suministro {
    String Nombre;
    float PrecioHora;

    public Suministro(String Nombre, float PrecioHora) {
        
        this.Nombre = Nombre;
        this.PrecioHora = PrecioHora;
    }

    public Suministro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getPrecioHora() {
        return PrecioHora;
    }

    public void setPrecioHora(float PrecioHora) {
        this.PrecioHora = PrecioHora;
    }

    @Override
    public String toString() {
        return "Suministro{Nombre=" + Nombre + ", PrecioHora=" + PrecioHora + '}';
    }


    
    
}
