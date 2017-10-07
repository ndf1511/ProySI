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
    int idSuministro;
    String Nombre;
    float PrecioHora;

    public Suministro(int idSuministro, String Nombre, float PrecioHora) {
        this.idSuministro = idSuministro;
        this.Nombre = Nombre;
        this.PrecioHora = PrecioHora;
    }

    public int getIdSuministro() {
        return idSuministro;
    }

    public void setIdSuministro(int idSuministro) {
        this.idSuministro = idSuministro;
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
        return "Suministro{" + "idSuministro=" + idSuministro + ", Nombre=" + Nombre + ", PrecioHora=" + PrecioHora + '}';
    }


    
    
}
