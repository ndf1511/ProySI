package Controllers;

import Conexiones.ReturnEntitiesConexion;
import Entities.Historico;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HistoricoController implements Initializable {

    @FXML
    private TableColumn<Historico, String> c_sep;

    @FXML
    private ImageView btn_record;

    @FXML
    private ImageView btn_output;

    @FXML
    private TableColumn<Historico, String> c_nov;

    @FXML
    private ImageView btn_input;

    @FXML
    private Pane p_historico;

    @FXML
    private TableColumn<Historico, String> c_abr;

    @FXML
    private TableColumn<Historico, String> c_prod;

    @FXML
    private TableColumn<Historico, String> c_ag;

    @FXML
    private TableColumn<Historico, String> c_may;

    @FXML
    private ImageView btn_info;

    @FXML
    private TableColumn<Historico, String> c_feb;

    @FXML
    private TableColumn<Historico, String> c_jun;

    @FXML
    private TableView<Historico> tb_historico;

    @FXML
    private TableColumn<Historico, String> c_jul;

    @FXML
    private TableColumn<Historico, String> c_oct;

    @FXML
    private AnchorPane hp_options;

    @FXML
    private ImageView btn_shut;
    
    @FXML
    private ImageView btn_recipe;
    
    @FXML
    private ImageView btn_ingre;
    
    @FXML
    private ImageView btn_mrpu;

    @FXML
    private TableColumn<Historico, String> c_mar;

    @FXML
    private TableColumn<Historico, String> c_dic;

    @FXML
    private TableColumn<Historico, String> c_ene;

    private ObservableList<Historico> list;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        this.llenar(); 
        
        
    }
    
    
    @FXML
    void botonOpciones(MouseEvent event) {

        
        if(event.getTarget()== btn_input){
             
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Inputs.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_output){
            
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/pDemanda.fxml"));
           this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_info){
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Main.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_shut){
            System.exit(0);
        }else if(event.getTarget()==btn_recipe){
                       
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Receta.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_ingre){
        
                                                   
        }else if(event.getTarget()==btn_mrpu){
        
             FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/MRPI.fxml"));
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
     
     
     private void llenar() {

        try{
            
            ArrayList<Historico> hts=ReturnEntitiesConexion.ReturnHistorico(); 
            list = FXCollections.observableArrayList(hts);
            
        }
        catch(Exception e) {
        System.out.println(e);
        
        }
        
        this.c_prod.setCellValueFactory(new PropertyValueFactory<Historico, String>("prod"));
        this.c_ene.setCellValueFactory(new PropertyValueFactory<Historico, String>("ene"));
        this.c_feb.setCellValueFactory(new PropertyValueFactory<Historico, String>("feb"));
        this.c_abr.setCellValueFactory(new PropertyValueFactory<Historico, String>("abr"));
        this.c_mar.setCellValueFactory(new PropertyValueFactory<Historico, String>("mar"));
        this.c_may.setCellValueFactory(new PropertyValueFactory<Historico, String>("may"));
        this.c_jun.setCellValueFactory(new PropertyValueFactory<Historico, String>("jun"));
        this.c_jul.setCellValueFactory(new PropertyValueFactory<Historico, String>("jul"));
        this.c_ag.setCellValueFactory(new PropertyValueFactory<Historico, String>("ago"));
        this.c_sep.setCellValueFactory(new PropertyValueFactory<Historico, String>("sep"));
        this.c_oct.setCellValueFactory(new PropertyValueFactory<Historico, String>("oct"));
        this.c_nov.setCellValueFactory(new PropertyValueFactory<Historico, String>("nov"));
        this.c_dic.setCellValueFactory(new PropertyValueFactory<Historico, String>("dic"));
        
        this.tb_historico.setItems(list);
        
    }

    

    

}