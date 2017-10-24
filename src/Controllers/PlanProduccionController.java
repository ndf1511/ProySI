    
package Controllers;

import Conexiones.ReturnEntitiesConexion;
import Entities.Maquinaria;
import Entities.PlanProduccion;
import Entities.Suministro;
import Conexiones.UpdateConexion;
import Entities.PlanProduccion;
import Entities.Proceso;
import Entities.Producto;
import Entities.Receta;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 *
 * @author Nico
 */
public class PlanProduccionController implements Initializable{

 @FXML
    private ImageView btn_record;

    @FXML
    private Pane pane_detMes;

    @FXML
    private TextField tx_prodsMes;
    
    @FXML
    private TextField tf_cc;
     
    @FXML
    private TextField tf_sr;

    @FXML
    private ImageView btn_lista;

    @FXML
    private TableColumn<PlanProduccion, String> c_abr;

    @FXML
    private TextField tf_timeMO;

    @FXML
    private TextField tf_costoMO;

    @FXML
    private ImageView btn_pp;

    @FXML
    private TextField tf_costoEst;

    @FXML
    private ImageView btn_info;

    @FXML
    private TableColumn<PlanProduccion, String> c_may;

    @FXML
    private Pane pane_detDias;

    @FXML
    private ImageView btn_shut;

    @FXML
    private TableColumn<PlanProduccion, String> c_ene;

    @FXML
    private TableColumn<PlanProduccion, String> c_sep;

    @FXML
    private ImageView btn_output;

    @FXML
    private TextField tf_timeLuz1;

    @FXML
    private TableColumn<PlanProduccion, String> c_ag;

    @FXML
    private TextField tx_prodsInv;

    @FXML
    private Button btn_detMes;

    @FXML
    private TextField tf_timeGas;

    @FXML
    private TextField tf_lifeSpawnEst;

    @FXML
    private AnchorPane hp_options;

    @FXML
    private TextField tf_timeMez;

    @FXML
    private TextField tf_lifeSpawnMez1;

    @FXML
    private ImageView btn_mrpu;

    @FXML
    private ImageView btn_recipe;

    @FXML
    private Pane pane_prods;

    @FXML
    private Button btn_detDias;

    @FXML
    private TextField tf_costoEst1;

    @FXML
    private TextField tf_costoGas1;
    
    @FXML
    private TextField tf_costoGas;
    
    @FXML
    private TextField tf_costoLuz1;
    
    @FXML
    private TextField tf_costoLuz;

    @FXML
    private TextField tf_timeMez1;

    @FXML
    private Pane p_mes;

    @FXML
    private TableColumn<PlanProduccion, String> c_oct;

    @FXML
    private TextField tf_timeMO1;
    
    @FXML
    private TextField tf_costot;
    @FXML
    private TextField tf_lifeSpawnMez;

    @FXML
    private TextField tf_costoMO11;

    @FXML
    private TextField tf_lifeSpawnEst1;

    @FXML
    private TextField tf_timeGas1;

    @FXML
    private TextField tf_timeEst;

    @FXML
    private ImageView btn_input;

    @FXML
    private TextField tf_costoMez;

    @FXML
    private ComboBox<String> cb_meses;

    @FXML
    private TextField tx_prodsT;

    @FXML
    private TableColumn<PlanProduccion, String> c_prod;

    @FXML
    private TextField tx_prodsInvTotal;

    @FXML
    private TextField tf_timeEst1;

    @FXML
    private TableView<PlanProduccion> tb_historico;

    @FXML
    private TextField tf_costoMez1;

    @FXML
    private Button btn_prods;

    @FXML
    private ComboBox<Producto> cb_productos;

    @FXML
    private TextField tf_timeLuz;

    @FXML
    private TextField tf_costoMO1;
    
    private ObservableList<PlanProduccion> list;
    
    float carbon; 
    float resina; 


    @Override
    public void initialize(URL location, ResourceBundle resources) {
               
        this.pane_detMes.toBack();
        this.pane_detDias.toBack();
        this.pane_prods.toBack();
        this.llenarComboBox(); 
            
    }

    @FXML
    public void botonOpciones(MouseEvent event) {

        if(event.getTarget()== btn_input){
             
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Inputs.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_output){
            
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/pDemanda.fxml"));
           this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_record){
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Historico.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_shut){
            
             System.exit(0);
             
        }else if(event.getTarget()==btn_recipe){
                      
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Receta.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_info){
        
                                                   
        }else if(event.getTarget()==btn_mrpu){
        
             FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/MRPI.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
                  
        }else if(event.getTarget()==btn_lista){
        
             FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Proceso.fxml"));
             this.AbrirFXML(fxmlLoader,event); 
                  
        }else if(event.getTarget()==btn_info){
        
             FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Main.fxml"));
             this.AbrirFXML(fxmlLoader,event); 
                  
        }else{
             //System.exit(0);
        }
        
        
    }
    
     @FXML
    void calculoCostos(ActionEvent event) {
        
        this.pane_detMes.toFront();
        this.llenarMes();
        //this.tf_costoMez.setText("Tu Madre");
    }

    @FXML
    void calculoTiempos(ActionEvent event) {
        
        this.pane_detDias.toFront();
        
        this.llenarDia();
    }

    @FXML
    void calculoProds(ActionEvent event) {
        this.pane_prods.toFront();
    }
    
    private void AbrirFXML(FXMLLoader fxmlLoader,MouseEvent evento) {
        
         try {
                       
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            Scene scene = new Scene(root1);
            stage.setScene(scene);
            stage.show();
            stage.setResizable(false);
            ((Node)(evento.getSource())).getScene().getWindow().hide();
        
            
        } catch(Exception e) {
            
            e.printStackTrace();
        }
    }

      
    @FXML
    void llenarTabla(ActionEvent event) {

            
            int index=(this.cb_meses.getSelectionModel().getSelectedIndex())+1; 
                
            MRPIController t= new MRPIController(); 
            ArrayList<Float> mp = t.getInfoTabla(index);  
        
            resina=mp.get(0);
            carbon=mp.get(1);
                  
            //System.out.println(resina+","+carbon);
            
            Float total = resina+carbon; 

            Float pResina=(resina)/total; 
            Float pCarbon=1 - pResina; 

            System.out.println(pResina+","+pCarbon);

            Float porcionResina= 2400/pResina; 
            Float porcionCarbon= 2400/pCarbon; 

            int numeroProcesos=(int)(total/2400); 

           /*if(numeroProcesos<350){

                int resta=350-numeroProcesos; 
                numeroProcesos=numeroProcesos + resta; 

            }*/
            try{

                ArrayList<Proceso> procs = ReturnEntitiesConexion.ReturnProceso();
                ArrayList<PlanProduccion>planp = ReturnEntitiesConexion.ReturnPP(this.cb_meses.getSelectionModel().getSelectedItem());
                
                if(planp.isEmpty()){
                    
                    for(Proceso pr: procs){
                    
                    String proc=pr.getNombre(); 
                    String maq=pr.getMaquinaria();
                    System.out.println(pr.getTiempoMaquinaria()+","+numeroProcesos); 
                    int tma = pr.getTiempoMaquinaria()*numeroProcesos;
                    int ttotal= pr.getTiempoTotal()*numeroProcesos;
                    int tmo = pr.getTiempoManoObra()*numeroProcesos;
                    
                    String mes=this.cb_meses.getSelectionModel().getSelectedItem(); 
                    UpdateConexion.InsertarPlanProduccion(mes, maq, proc, ttotal, tmo, tma);
                            
                    }
                }
                
            }catch(Exception e){

                System.out.println(e);
            }
            
            this.filltable(); 
        
        
    }
    
    private void filltable() {
       System.out.println(this.cb_meses.getSelectionModel().getSelectedItem());
        
       try{
                     
            ArrayList<PlanProduccion> planp; 
            String mes=this.cb_meses.getSelectionModel().getSelectedItem(); 
            System.out.println(mes);
            planp=ReturnEntitiesConexion.ReturnPP(mes);
            list = FXCollections.observableArrayList(planp);
            
                      
        }catch(Exception e){
            
            System.out.println(e);
        }
        
        this.c_prod.setCellValueFactory(new PropertyValueFactory<PlanProduccion, String>("Proceso"));
        this.c_ene.setCellValueFactory(new PropertyValueFactory<PlanProduccion, String>("TiempoTotal"));
        this.c_ag.setCellValueFactory(new PropertyValueFactory<PlanProduccion, String>("TiempoMO"));
        this.c_sep.setCellValueFactory(new PropertyValueFactory<PlanProduccion, String>("NombreMaquina"));
        this.c_oct.setCellValueFactory(new PropertyValueFactory<PlanProduccion, String>("TiempoMaquina"));
        this.tb_historico.setItems(list);
    } 
    
    private void llenarComboBox() {
        cb_meses.getItems().addAll(
            "Enero",
            "Febrero",
            "Marzo",
            "Abril",
            "Mayo",
            "Junio",
            "Julio",
            "Agosto",
            "Septiembre",
            "Octubre",
            "Noviembre",
            "Diciembre"
        );    
        
     
    }

    
    private void llenarMes() {
        
        String CostoL = "";
        String CostoG = "";
        String CostoM = "";
        String CostoE = "";
         
        
        String LifeTimeME;
        String LifeTimeMM;
        float tiempoME=0;
        float tiempoMM=0;
        float tiempoH=192;
        float CostoMO = 62;
        float tiempoMO=0;
        float CostoMOT = 3750;
        
        
        
        try{
            
            ArrayList<PlanProduccion>planp=ReturnEntitiesConexion.ReturnPP(this.cb_meses.getSelectionModel().getSelectedItem());
            
            
              
           for(PlanProduccion p: planp){
                
                System.out.println(tiempoMO+","+p.getTiempoMO());
                
                tiempoMO=tiempoMO+p.getTiempoMO(); 
           }
            
           
           for(PlanProduccion p: planp){
                
                if(p.getNombreMaquina().equals("Estufa")){
                    
                    tiempoME=tiempoME+p.getTiempoMaquina(); 
                
                }else if(p.getNombreMaquina().equals("Mezclador")){
                    
                    tiempoMM=tiempoMM+p.getTiempoMaquina(); 
                    
                }
                
           }
          
                       
            
        }catch(Exception e){
            
        }
        
        
        this.tf_costoMO.setText(Float.toString((CostoMOT*(tiempoMO/60)/9)));
        this.tf_timeMO.setText(Float.toString(tiempoMO/9));
        
        this.tf_timeGas.setText(Float.toString(tiempoME));
        this.tf_timeLuz.setText(Float.toString(tiempoMM));
        
        this.tf_timeEst.setText(Float.toString(tiempoME));
        this.tf_timeMez.setText(Float.toString(tiempoMM));
        this.tf_costot.setText("9");
                
        float tiempoMEH=tiempoME/60; 
        float tiempoMMH=tiempoMM/60; 
        
        try{
            
        ArrayList<Suministro> hts =ReturnEntitiesConexion.ReturnSum(); 
       
            for(Suministro s:hts){
                if(s.getNombre().equals("Gas")){
                    CostoL=Float.toString(s.getPrecioHora()*tiempoMEH*3000*2);
                    this.tf_costoGas.setText(CostoL);
                    
                }else{
                if(s.getNombre().equals("Electricidad")){
                    CostoG=Float.toString(s.getPrecioHora()*tiempoMMH*2);
                    this.tf_costoLuz.setText(CostoG);
                }
                }               
            }                               
        }
        catch(Exception e) {
        
            System.out.println(e);
        
        }
        
        
        try{
            
        ArrayList<Maquinaria> htss =ReturnEntitiesConexion.ReturnMaqu(); 
       
            for(Maquinaria m:htss){
                if(m.getMaquina().equals("Estufa")){
                    CostoE=Float.toString(m.getCostoHora()*tiempoMEH);
                    this.tf_costoEst.setText(CostoE);
                    
                }else{
                if(m.getMaquina().equals("Mezclador")){
                    CostoM=Float.toString(m.getCostoHora()*tiempoMMH);
                    this.tf_costoMez.setText(CostoM);
                }
                }               
            }                               
        }
        catch(Exception e) {
        
            System.out.println(e);
        
        }
        
        try{
            
        ArrayList<Maquinaria> htss =ReturnEntitiesConexion.ReturnMaqu(); 
       
            for(Maquinaria m:htss){
                if(m.getMaquina().equals("Estufa")){
                    LifeTimeME=Float.toString(m.getTiempoVida()-(tiempoME/(525600)));
                    this.tf_lifeSpawnEst.setText(LifeTimeME);
                    
                }else{
                    if(m.getMaquina().equals("Mezclador")){
                        LifeTimeMM=Float.toString(m.getTiempoVida()-(tiempoMM/(525600)));
                        this.tf_lifeSpawnMez.setText(LifeTimeMM);
                    }
                }               
            }                               
        }
        catch(Exception e) {
        
            System.out.println(e);
        
        }
        
        
        
        
    }
    
    private void llenarDia() {
        
        String CostoL = "";
        String CostoG = "";
        String CostoM = "";
        String CostoE = "";
         
        
        String LifeTimeME;
        String LifeTimeMM;
        float tiempoME=0;
        float tiempoMM=0;
        float tiempoH=192;
        float CostoMO = 62;
        float tiempoMO=0;
        float CostoMOT = 3750;
        
        try{
            
            ArrayList<PlanProduccion>planp=ReturnEntitiesConexion.ReturnPP(this.cb_meses.getSelectionModel().getSelectedItem());
            
            
              
           for(PlanProduccion p: planp){
                
                System.out.println(tiempoMO+","+p.getTiempoMO());
                
                tiempoMO=tiempoMO+p.getTiempoMO(); 
           }
            
           
           for(PlanProduccion p: planp){
                
                if(p.getNombreMaquina().equals("Estufa")){
                    
                    tiempoME=tiempoME+p.getTiempoMaquina(); 
                
                }else if(p.getNombreMaquina().equals("Mezclador")){
                    
                    tiempoMM=tiempoMM+p.getTiempoMaquina(); 
                    
                }
                
           }
          
                       
            
        }catch(Exception e){
            
        }
        
        tiempoMO=tiempoMO/24; 
        tiempoME=tiempoME/24;
        tiempoMM=tiempoMM/24; 
        
                 
            
        this.tf_cc.setText(Float.toString(carbon/24));
        this.tf_sr.setText(Float.toString(resina/24));
        
        this.tf_costoMO1.setText(Float.toString((CostoMOT*(tiempoMO/60))/9));
        this.tf_timeMO1.setText(Float.toString(tiempoMO/9));
        
        this.tf_timeGas1.setText(Float.toString(tiempoME));
        this.tf_timeLuz1.setText(Float.toString(tiempoMM));
        
        this.tf_timeEst1.setText(Float.toString(tiempoME));
        this.tf_timeMez1.setText(Float.toString(tiempoMM));
        this.tf_costoMO11.setText("9");
                
        float tiempoMEH=tiempoME/60; 
        float tiempoMMH=tiempoMM/60; 
        
        try{
            
        ArrayList<Suministro> hts =ReturnEntitiesConexion.ReturnSum(); 
       
            for(Suministro s:hts){
                if(s.getNombre().equals("Gas")){
                    CostoL=Float.toString(s.getPrecioHora()*tiempoMEH*3000*2);
                    this.tf_costoGas1.setText(CostoL);
                    
                }else{
                if(s.getNombre().equals("Electricidad")){
                    CostoG=Float.toString(s.getPrecioHora()*tiempoMMH*2);
                    this.tf_costoLuz1.setText(CostoG);
                }
                }               
            }                               
        }
        catch(Exception e) {
        
            System.out.println(e);
        
        }
        
        
        try{
            
        ArrayList<Maquinaria> htss =ReturnEntitiesConexion.ReturnMaqu(); 
       
            for(Maquinaria m:htss){
                if(m.getMaquina().equals("Estufa")){
                    CostoE=Float.toString(m.getCostoHora()*tiempoMEH);
                    this.tf_costoEst1.setText(CostoE);
                    
                }else{
                if(m.getMaquina().equals("Mezclador")){
                    CostoM=Float.toString(m.getCostoHora()*tiempoMMH);
                    this.tf_costoMez1.setText(CostoM);
                }
                }               
            }                               
        }
        catch(Exception e) {
        
            System.out.println(e);
        
        }
        
            
       
        
        
    }

}

    

