package Controllers;

import Conexiones.AddConexion;
import Conexiones.ReturnEntitiesConexion;
import Conexiones.UpdateConexion;
import Entities.Demanda;
import Entities.Historico;
import Entities.Lluvia;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

public class InputsController  implements Initializable{

    @FXML
    private ImageView btn_done;

    @FXML
    private ImageView btn_record;

     @FXML
    private ImageView btn_lista;
    @FXML
    private ImageView btn_output;

    @FXML
    private TextField txt_prob;

    @FXML
    private ImageView btn_input;
    
    @FXML
    private ImageView btn_pp;

    @FXML
    private Button btn_cdem;

    @FXML
    private TextField txt_event;

    @FXML
    private ImageView btn_mas;

    @FXML
    private ImageView btn_info;

    @FXML
    private TextField txt_vis;

    @FXML
    private ComboBox<String> cb_mes;

    @FXML
    private AnchorPane hp_options;

    @FXML
    private Pane p_inputs;

    @FXML
    private ImageView btn_shut;

    @FXML
    private Pane p_lluvias;
    
    @FXML
    private ImageView btn_recipe;
    
    @FXML
    private ImageView btn_ingre;
    
    @FXML
    private ImageView btn_mrpu; 
    
    
    private int IDnueva;
    private int resultado;


    public void initialize(URL location, ResourceBundle resources) {
        
        this.p_lluvias.toBack();
        this.llenarcombobox();
        
    }
    
    @FXML
    public void botonOpciones(MouseEvent event) {

        if(event.getTarget()== btn_info){
             
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Main.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_output){
            
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/pDemanda.fxml"));
           this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_record){
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Historico.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
            
        }
        else if(event.getTarget()==btn_mas){
            
            this.p_lluvias.toFront();
             
        }else if(event.getTarget()==btn_done){
        
                this.crearLluvia(); 
                this.p_lluvias.toBack();                     
                this.txt_prob.setText("");
                                       
        }else if(event.getTarget()==btn_shut){
            
            System.exit(0);
            
        }else if(event.getTarget()==btn_recipe){
                       
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Receta.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_ingre){
        
                                                   
        }else if(event.getTarget()==btn_mrpu){
                
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/MRPI.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
                  
        }else if(event.getTarget()==btn_lista){
        
             FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Proceso.fxml"));
             this.AbrirFXML(fxmlLoader,event); 
                  
             
        }else if(event.getTarget()==btn_pp){
        
             FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/PlanP.fxml"));
             this.AbrirFXML(fxmlLoader,event); 
                  
        }else{
            
        }
        
        
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
    void cdemanda(ActionEvent event) {
        
         this.agregarDemanda(); 
       
         this.txt_event.setText("");
         this.txt_vis.setText("");
         this.cb_mes.getItems().clear();
         this.txt_prob.setText("");
         this.llenarcombobox();
         
         
    }

    private void llenarcombobox() {
        
        cb_mes.getItems().addAll(
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

    private void crearLluvia()  {
        
            try{
                
                ArrayList<Integer>idList = new ArrayList<Integer>();
                boolean repetido; 
            
                do{
                    try { 
                        idList=ReturnEntitiesConexion.ConsultarIdLluvia();
                    } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                        System.out.print(ex);
                    }

                    int newID = Integer.parseInt(UUID.randomUUID().toString().replaceAll("[^\\d]", "").substring(0, 5));
                    repetido=false; 
                    this.IDnueva = newID;
                    for(Integer identificacion:idList){
                        if(newID==identificacion){
                           repetido=true; 
                        }
                    }
                }while(repetido);
                
                AddConexion.InsertarLluvia(this.IDnueva,this.cb_mes.getValue(),Integer.parseInt(this.txt_prob.getText()));
                AddConexion.insertarLLuviasPlan(this.IDnueva);
                
            }
            
            catch(Exception e) {
            System.out.println(e);

            }    
    
    }

    private void agregarDemanda() {
       
    try{
        System.out.println(this.cb_mes.getValue());
        ArrayList<Historico> reg=ReturnEntitiesConexion.ReturnHistoricoID();
        ArrayList<Lluvia> llov=ReturnEntitiesConexion.ConsultarLluvias(this.cb_mes.getValue());
        
        int contbajo=0,contmedio=0,contalto=0; 
        boolean campañas= false; 
        int semanaS=0; 
        
        for(Lluvia yy:llov){
                   
                   int proba=yy.getProb();
                   
                   if(proba>0&&proba<40){
                       
                       contbajo++; 
                                              
                   }else if(proba>=40&&proba<75){
                       
                       contmedio++;
                       
                   }else{
                       contalto++; 
                   }
               }
        
        float influlluvias=(float)((contbajo*0.01)+(contmedio*0.02)+(contalto*0.03));
        
        for(Historico his: reg){
                        
            if(this.cb_mes.getValue().equals("Enero")){
            campañas=true;                          
            int hisProd=Integer.parseInt(his.getEne()); 
            int idPlan=his.getId();
            this.calculo(hisProd,idPlan,influlluvias,campañas,semanaS); 
               
            }else if(this.cb_mes.getValue().equals("Febrero")){
                
            int hisProd=Integer.parseInt(his.getFeb()); 
            int idPlan=his.getId();
            this.calculo(hisProd,idPlan,influlluvias,campañas,semanaS);  
                    
            }else if(this.cb_mes.getValue().equals("Marzo")){
            
            semanaS=2; 
            int hisProd=Integer.parseInt(his.getMar()); 
            int idPlan=his.getId();
            this.calculo(hisProd,idPlan,influlluvias,campañas,semanaS);  
                    
            }else if(this.cb_mes.getValue().equals("Abril")){
            semanaS=1;     
            int hisProd=Integer.parseInt(his.getAbr()); 
            int idPlan=his.getId();
            this.calculo(hisProd,idPlan,influlluvias,campañas,semanaS);  
                    
            }else if(this.cb_mes.getValue().equals("Mayo")){
                
            int hisProd=Integer.parseInt(his.getMay()); 
            int idPlan=his.getId();
            this.calculo(hisProd,idPlan,influlluvias,campañas,semanaS);   
            
                    
            }else if(this.cb_mes.getValue().equals("Junio")){
                
            int hisProd=Integer.parseInt(his.getJun()); 
            int idPlan=his.getId();
            this.calculo(hisProd,idPlan,influlluvias,campañas,semanaS);  
            
            }else if(this.cb_mes.getValue().equals("Julio")){
                
            int hisProd=Integer.parseInt(his.getJul()); 
            int idPlan=his.getId();
            this.calculo(hisProd,idPlan,influlluvias,campañas,semanaS);  
                    
            }else if(this.cb_mes.getValue().equals("Agosto")){
                
            int hisProd=Integer.parseInt(his.getAgo()); 
            int idPlan=his.getId();
            this.calculo(hisProd,idPlan,influlluvias,campañas,semanaS);  
                    
            }else if(this.cb_mes.getValue().equals("Septiembre")){
            
            campañas=true; 
            int hisProd=Integer.parseInt(his.getSep()); 
            int idPlan=his.getId();
            this.calculo(hisProd,idPlan,influlluvias,campañas,semanaS);  
                    
            }else if(this.cb_mes.getValue().equals("Octubre")){
                
            int hisProd=Integer.parseInt(his.getOct()); 
            int idPlan=his.getId();
            this.calculo(hisProd,idPlan,influlluvias,campañas,semanaS);  
                    
            }else if(this.cb_mes.getValue().equals("Noviembre")){
                
            int hisProd=Integer.parseInt(his.getNov()); 
            int idPlan=his.getId();
            this.calculo(hisProd,idPlan,influlluvias,campañas,semanaS);  
                    
            }else{         
                   
            int hisProd=Integer.parseInt(his.getDic()); 
            int idPlan=his.getId();
            this.calculo(hisProd,idPlan,influlluvias,campañas,semanaS); 
                
            }
            
            
        }
        
        JOptionPane.showMessageDialog(null,"Su Plan de Demanda ha sido actualizado");
        
    } catch(Exception e){
        System.out.print(e);
        
    } 
                           
    }

    private void calculo(int dato,int idP,float influlluvias,boolean camp, int semS) {
        
        
    float influvis= Integer.parseInt(this.txt_vis.getText())/5000f; 
    float influeventos= (Integer.parseInt(this.txt_event.getText())*200)/40000f; 
        
        
            try{
                
                if(camp){
                                     
                  resultado= (int) ((dato -(dato *(influlluvias))+(dato *(influvis))+(dato *(influeventos))-(dato *(0.05))+(dato *0.1)));
                  
                }else{
                    
                    if(semS==1){
                        
                            resultado= (int) ((dato -(dato *(influlluvias))+(dato *(influvis))+(dato *(influeventos))-(dato *(0.05))+(dato *0.2)));
                            
                    }else if(semS==2){
                    
                            resultado= (int) ((dato -(dato *(influlluvias))+(dato *(influvis))+(dato *(influeventos))-(dato *(0.05))-(dato *0.2)));
                    }else{
                            
                            resultado= (int) ((dato -(dato *(influlluvias))+(dato *(influvis))+(dato *(influeventos))-(dato *(0.05))));
                    }
                }
                    
            UpdateConexion.ActualizarDemanda(idP,resultado,this.cb_mes.getValue());
                
            }catch(Exception e){
                System.out.print(e);
            }
            
    }

}
