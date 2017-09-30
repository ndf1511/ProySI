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
public class Producto {
    
    String Nombre;
    int id_producto; 

    public Producto(String Nombre, int id_producto) {
        this.Nombre = Nombre;
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    @Override
    public String toString() {
        return "Producto{" + "Nombre=" + Nombre + ", id_producto=" + id_producto + '}';
    }
    
    
}
