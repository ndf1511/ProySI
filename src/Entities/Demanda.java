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
public class Demanda {
    
    int id; 
    
    String prod; 
    
    int ene,feb,mar,abr,may,jun,jul,ago,sep,oct,nov,dic; 

    public Demanda(int id, String prod, int ene, int feb, int mar, int abr, int may, int jun, int jul, int ago, int sep, int oct, int nov, int dic) {
        this.id = id;
        this.prod = prod;
        this.ene = ene;
        this.feb = feb;
        this.mar = mar;
        this.abr = abr;
        this.may = may;
        this.jun = jun;
        this.jul = jul;
        this.ago = ago;
        this.sep = sep;
        this.oct = oct;
        this.nov = nov;
        this.dic = dic;
    }

    public Demanda(int id, String prod) {
        this.id = id;
        this.prod = prod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public int getEne() {
        return ene;
    }

    public void setEne(int ene) {
        this.ene = ene;
    }

    public int getFeb() {
        return feb;
    }

    public void setFeb(int feb) {
        this.feb = feb;
    }

    public int getMar() {
        return mar;
    }

    public void setMar(int mar) {
        this.mar = mar;
    }

    public int getAbr() {
        return abr;
    }

    public void setAbr(int abr) {
        this.abr = abr;
    }

    public int getMay() {
        return may;
    }

    public void setMay(int may) {
        this.may = may;
    }

    public int getJun() {
        return jun;
    }

    public void setJun(int jun) {
        this.jun = jun;
    }

    public int getJul() {
        return jul;
    }

    public void setJul(int jul) {
        this.jul = jul;
    }

    public int getAgo() {
        return ago;
    }

    public void setAgo(int ago) {
        this.ago = ago;
    }

    public int getSep() {
        return sep;
    }

    public void setSep(int sep) {
        this.sep = sep;
    }

    public int getOct() {
        return oct;
    }

    public void setOct(int oct) {
        this.oct = oct;
    }

    public int getNov() {
        return nov;
    }

    public void setNov(int nov) {
        this.nov = nov;
    }

    public int getDic() {
        return dic;
    }

    public void setDic(int dic) {
        this.dic = dic;
    }

    @Override
    public String toString() {
        return "Demanda{" + "id=" + id + ", prod=" + prod + ", ene=" + ene + ", feb=" + feb + ", mar=" + mar + ", abr=" + abr + ", may=" + may + ", jun=" + jun + ", jul=" + jul + ", ago=" + ago + ", sep=" + sep + ", oct=" + oct + ", nov=" + nov + ", dic=" + dic + '}';
    } 

}
