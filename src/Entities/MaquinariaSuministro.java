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
public class MaquinariaSuministro {
    
    int IdMaquinaria, IdSuministro;

    public MaquinariaSuministro(int IdMaquinaria, int IdSuministro) {
        this.IdMaquinaria = IdMaquinaria;
        this.IdSuministro = IdSuministro;
    }

    public int getIdMaquinaria() {
        return IdMaquinaria;
    }

    public void setIdMaquinaria(int IdMaquinaria) {
        this.IdMaquinaria = IdMaquinaria;
    }

    public int getIdSuministro() {
        return IdSuministro;
    }

    public void setIdSuministro(int IdSuministro) {
        this.IdSuministro = IdSuministro;
    }

    @Override
    public String toString() {
        return "MaquinariaSuministro{" + "IdMaquinaria=" + IdMaquinaria + ", IdSuministro=" + IdSuministro + '}';
    }

   
    
    
}
