package Controllers;

import Conexiones.ReturnEntitiesConexion;
import Entities.Demanda;
import Entities.Demanda;
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

public class pDemandaController implements Initializable{

    @FXML
    private ImageView btn_record;

    @FXML
    private TableColumn<Demanda, String> c_abr1;

    @FXML
    private ImageView btn_output;
    
    @FXML
    private ImageView btn_lista;
    
    @FXML
    private ImageView btn_mrpu;



    @FXML
    private TableColumn<Demanda, String> c_nov1;

    @FXML
    private ImageView btn_input;

    @FXML
    private TableColumn<Demanda, String> c_ene1;

    @FXML
    private TableColumn<Demanda, String> c_sep1;

    @FXML
    private TableColumn<Demanda, String> c_feb1;

    @FXML
    private TableColumn<Demanda, String> c_jul1;

    @FXML
    private TableColumn<Demanda, String> c_ag1;

    @FXML
    private Pane p_demanda;

    @FXML
    private TableColumn<Demanda, String> c_mar1;

    @FXML
    private TableColumn<Demanda, String> c_oct1;

    @FXML
    private TableColumn<Demanda, String> c_may1;

    @FXML
    private TableColumn<Demanda, String> c_jun1;

    @FXML
    private TableColumn<Demanda, String> c_dic1;

    @FXML
    private ImageView btn_info;

    @FXML
    private TableView<Demanda> tb_demanda;

    @FXML
    private TableColumn<Demanda, String> c_prod1;

    @FXML
    private AnchorPane hp_options;

    @FXML
    private ImageView btn_shut;
    
    private ObservableList<Demanda> list;
     
    @FXML
    private ImageView btn_recipe;
    
    @FXML
    private ImageView btn_ingre;
    
      
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        this.llenar(); 
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
            
        }else if(event.getTarget()==btn_ingre){
        
                                                   
        }else if(event.getTarget()==btn_mrpu){
        
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/MRPI.fxml"));
            this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_lista){
        
             FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Procesos.fxml"));
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
            
            ArrayList<Demanda> hts=ReturnEntitiesConexion.ReturnDemanda(); 
            list = FXCollections.observableArrayList(hts);
            
            
        }
        catch(Exception e) {
        
            System.out.println(e);
        
        }
        
        this.c_prod1.setCellValueFactory(new PropertyValueFactory<Demanda, String>("prod"));
        this.c_ene1.setCellValueFactory(new PropertyValueFactory<Demanda, String>("ene"));
        this.c_feb1.setCellValueFactory(new PropertyValueFactory<Demanda, String>("feb"));
        this.c_abr1.setCellValueFactory(new PropertyValueFactory<Demanda, String>("abr"));
        this.c_mar1.setCellValueFactory(new PropertyValueFactory<Demanda, String>("mar"));
        this.c_may1.setCellValueFactory(new PropertyValueFactory<Demanda, String>("may"));
        this.c_jun1.setCellValueFactory(new PropertyValueFactory<Demanda, String>("jun"));
        this.c_jul1.setCellValueFactory(new PropertyValueFactory<Demanda, String>("jul"));
        this.c_ag1.setCellValueFactory(new PropertyValueFactory<Demanda, String>("ago"));
        this.c_sep1.setCellValueFactory(new PropertyValueFactory<Demanda, String>("sep"));
        this.c_oct1.setCellValueFactory(new PropertyValueFactory<Demanda, String>("oct"));
        this.c_nov1.setCellValueFactory(new PropertyValueFactory<Demanda, String>("nov"));
        this.c_dic1.setCellValueFactory(new PropertyValueFactory<Demanda, String>("dic"));
        
        this.tb_demanda.setItems(list);

    }
     

}
