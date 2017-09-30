
package Entities;

public class PlanLluvias {
 
    
    int idLluvia,idPlanD; 

    public PlanLluvias(int idLluvia, int idPlanD) {
        this.idLluvia = idLluvia;
        this.idPlanD = idPlanD;
    }

    public int getIdLluvia() {
        return idLluvia;
    }

    public void setIdLluvia(int idLluvia) {
        this.idLluvia = idLluvia;
    }

    public int getIdPlanD() {
        return idPlanD;
    }

    public void setIdPlanD(int idPlanD) {
        this.idPlanD = idPlanD;
    }

    @Override
    public String toString() {
        return "PlanLluvias{" + "idLluvia=" + idLluvia + ", idPlanD=" + idPlanD + '}';
    }
    
    
}
