
package Entities;

public class Lluvia {
    
    int id; 
    int prob;
    String mes; 

    public Lluvia(int id, int prob, String mes) {
        this.id = id;
        this.prob = prob;
        this.mes = mes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProb() {
        return prob;
    }

    public void setProb(int prob) {
        this.prob = prob;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String Enero) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Lluvia{" + "id=" + id + ", prob=" + prob + ", Mes=" + mes + '}';
    }
    
    
}
