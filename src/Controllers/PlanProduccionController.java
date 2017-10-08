    
package Controllers;

import Conexiones.ReturnEntitiesConexion;
import Entities.Maquinaria;
import Entities.PlanProduccion;
import Entities.Suministro;
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
    private ImageView btn_lista;

    @FXML
    private TableColumn<?, ?> c_abr;

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
    private TableColumn<?, ?> c_may;

    @FXML
    private Pane pane_detDias;

    @FXML
    private ImageView btn_shut;

    @FXML
    private TableColumn<?, ?> c_ene;

    @FXML
    private TableColumn<?, ?> c_sep;

    @FXML
    private ImageView btn_output;

    @FXML
    private TextField tf_timeLuz1;

    @FXML
    private TableColumn<?, ?> c_ag;

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
    private TableColumn<?, ?> c_oct;

    @FXML
    private TextField tf_timeMO1;

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
    private ComboBox<?> cb_meses;

    @FXML
    private TextField tx_prodsT;

    @FXML
    private TableColumn<?, ?> c_prod;

    @FXML
    private TextField tx_prodsInvTotal;

    @FXML
    private TextField tf_timeEst1;

    @FXML
    private TableView<?> tb_historico;

    @FXML
    private TextField tf_costoMez1;

    @FXML
    private Button btn_prods;

    @FXML
    private ComboBox<?> cb_productos;

    @FXML
    private TextField tf_timeLuz;

    @FXML
    private TextField tf_costoMO1;
    private ObservableList<Suministro> list;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
               
        this.pane_detMes.toBack();
        this.pane_detDias.toBack();
        this.pane_prods.toBack();
        
        
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
    }

    @FXML
    void calculoTiempos(ActionEvent event) {
        
        this.pane_detDias.toFront();
        
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

    private void llenarMes() {
        
        String CostoL = "";
        String CostoG = "";
        String CostoM = "";
        String CostoE = "";
        float tiempoL=3;
        try{
            
        ArrayList<Suministro> hts =ReturnEntitiesConexion.ReturnSum(); 
       
            for(Suministro s:hts){
                if(s.getNombre().equals("Gas")){
                    CostoL=Float.toString(s.getPrecioHora()*tiempoL);
                    this.tf_costoGas.setText(CostoL);
                    System.out.println("Hola" + s.getPrecioHora());
                }else{
                if(s.getNombre().equals("Electricidad")){
                    CostoG=Float.toString(s.getPrecioHora()*tiempoL);
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
                    CostoE=Float.toString(m.getCostoHora()*tiempoL);
                    this.tf_costoEst.setText(CostoE);
                    
                }else{
                if(m.getMaquina().equals("Mezclador")){
                    CostoM=Float.toString(m.getCostoHora()*tiempoL);
                    this.tf_costoMez.setText(CostoM);
                }
                }               
            }                               
        }
        catch(Exception e) {
        
            System.out.println(e);
        
        }
        
        
    }

}

    

