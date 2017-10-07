package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ProcesosController implements Initializable{

    @FXML
    private TableColumn<?, ?> tc_timeMaquina;

    @FXML
    private ImageView btn_record;

    @FXML
    private TableColumn<?, ?> c_costoh;

    @FXML
    private ImageView btn_mrpu;

    @FXML
    private ImageView btn_recipe;

    @FXML
    private TableColumn<?, ?> c_costot;

    @FXML
    private ImageView btn_lista;

    @FXML
    private TableColumn<?, ?> ct_precioH;

    @FXML
    private TableView<?> tb_sumin;

    @FXML
    private TableColumn<?, ?> c_timevida;

    @FXML
    private Pane p_demanda;

    @FXML
    private TableColumn<?, ?> tc_detail;

    @FXML
    private TableColumn<?, ?> tc_timeM;

    @FXML
    private TableColumn<?, ?> tc_nombre;

    @FXML
    private AnchorPane hp_options1;

    @FXML
    private ImageView btn_info;

    @FXML
    private ImageView btn_shut;

    @FXML
    private TableColumn<?, ?> tc_maquina;

    @FXML
    private TableView<?> tb_procesos;

    @FXML
    private TableColumn<?, ?> tc_num;

    @FXML
    private ImageView btn_output;

    @FXML
    private TableColumn<?, ?> ct_sumi;

    @FXML
    private ImageView btn_input;

    @FXML
    private TableColumn<?, ?> c_nombremaq;

    @FXML
    private TableView<?> tb_maquinaria;

    @FXML
    private TableColumn<?, ?> tc_timet;
    
    
   @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    @FXML
    void botonOpciones(MouseEvent event) {
        
         if(event.getTarget()== btn_input){
             
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Inputs.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_record){
            
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Historico.fxml"));
           this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_info){
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Main.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_shut){
            
            System.exit(0);
                       
        }else if(event.getTarget()==btn_recipe){
                       
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Receta.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_mrpu){
        
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/MRPI.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_output){
            
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/pDemanda.fxml"));
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


}
