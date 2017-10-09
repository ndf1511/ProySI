package Entities;

/**
 *
 * @author Yiyisman
 */
public class PlanProduccion {
    
    String Mes,NombreMaquina,Proceso;
            
    int TiempoTotal, TiempoMaquina,TiempoMO;

    public PlanProduccion(String Mes, String NombreMaquina, String Proceso, int TiempoTotal, int TiempoMO,int TiempoMaquina) {
        this.Mes = Mes;
        this.NombreMaquina = NombreMaquina;
        this.Proceso = Proceso;
        this.TiempoTotal = TiempoTotal;
        this.TiempoMaquina = TiempoMaquina;
        this.TiempoMO = TiempoMO;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getNombreMaquina() {
        return NombreMaquina;
    }

    public void setNombreMaquina(String NombreMaquina) {
        this.NombreMaquina = NombreMaquina;
    }

    public String getProceso() {
        return Proceso;
    }

    public void setProceso(String Proceso) {
        this.Proceso = Proceso;
    }

    public int getTiempoTotal() {
        return TiempoTotal;
    }

    public void setTiempoTotal(int TiempoTotal) {
        this.TiempoTotal = TiempoTotal;
    }

    public int getTiempoMaquina() {
        return TiempoMaquina;
    }

    public void setTiempoMaquina(int TiempoMaquina) {
        this.TiempoMaquina = TiempoMaquina;
    }

    public int getTiempoMO() {
        return TiempoMO;
    }

    public void setTiempoMO(int TiempoMO) {
        this.TiempoMO = TiempoMO;
    }

    @Override
    public String toString() {
        return "PlanProduccion{" + "Mes=" + Mes + ", NombreMaquina=" + NombreMaquina + ", Proceso=" + Proceso + ", TiempoTotal=" + TiempoTotal + ", TiempoMaquina=" + TiempoMaquina + ", TiempoMO=" + TiempoMO + '}';
    }
        
    
}
