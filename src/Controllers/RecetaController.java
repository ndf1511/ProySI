package Controllers;

import Conexiones.ReturnEntitiesConexion;
import Entities.Demanda;
import Entities.Inventario;
import Entities.Maquinaria;
import Entities.Proveedor;
import Entities.Receta;
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

public class RecetaController implements Initializable {

    @FXML
    private TableColumn<Receta,String> tc_mp;

    @FXML
    private ImageView btn_record;

    @FXML
    private ImageView btn_mrpu;
    
    @FXML
    private ImageView btn_lista;
    
    @FXML
    private ImageView btn_pp;


    @FXML
    private ImageView btn_output;

    @FXML
    private ImageView btn_recipe;

    @FXML
    private ImageView btn_input;

    @FXML
    private TableView<Inventario> tb_inventario;
    
    @FXML
    private TableColumn<Proveedor,String> c_provee;

    @FXML
    private Pane p_demanda;

    @FXML
    private TableColumn<Proveedor,String> tc_telefono;

    @FXML
    private TableColumn<Inventario,String> c_mp;

    @FXML
    private AnchorPane hp_options1;

    @FXML
    private TableColumn<Receta,String> tc_prod;

    @FXML
    private ImageView btn_info;

    @FXML
    private TableView<Receta> tb_receta;

    @FXML
    private TableColumn<Inventario, String> c_cant;

    @FXML
    private TableView<Proveedor> tb_proveedor;

    @FXML
    private ImageView btn_shut;
    
   

    @FXML
    private TableColumn<Receta,String> tc_cant;
    private ObservableList<Receta> list;
    private ObservableList<Proveedor> list2;
    private ObservableList<Inventario> list3;
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.llenarReceta(); 
        this.llenarProveedores(); 
        this.llenarInv(); 
       
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
            
        }else if(event.getTarget()==btn_lista){
        
             FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Proceso.fxml"));
             this.AbrirFXML(fxmlLoader,event); 
                  
        }else if(event.getTarget()==btn_output){
            
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/pDemanda.fxml"));
           this.AbrirFXML(fxmlLoader,event); 
            
        }else if(event.getTarget()==btn_pp){
            
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/PlanProduccion.fxml"));
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

    private void llenarReceta() {
        
        try{
            
            ArrayList<Receta> hts=ReturnEntitiesConexion.ReturnReceta(); 
            list = FXCollections.observableArrayList(hts);
            
            
        }
        catch(Exception e) {
        
            System.out.println(e);
        
        }
        
        this.tc_mp.setCellValueFactory(new PropertyValueFactory<Receta, String>("materiaPrima"));
        this.tc_prod.setCellValueFactory(new PropertyValueFactory<Receta, String>("prod"));
        this.tc_cant.setCellValueFactory(new PropertyValueFactory<Receta, String>("cant"));
        this.tb_receta.setItems(list);
    }

    private void llenarProveedores() {
        
         try{
            
        ArrayList<Proveedor> hts =ReturnEntitiesConexion.ReturnProv(); 
        list2 = FXCollections.observableArrayList(hts);
            
        }
        catch(Exception e) {
        
            System.out.println(e);
        
        }
        
        this.c_provee.setCellValueFactory(new PropertyValueFactory<Proveedor, String>("proveedor"));
        this.tc_telefono.setCellValueFactory(new PropertyValueFactory<Proveedor, String>("telefono"));
        this.tb_proveedor.setItems(list2);
        
    }

    private void llenarInv() {
        
        try{
            
        ArrayList<Inventario> hts =ReturnEntitiesConexion.ReturnInv(); 
        list3 = FXCollections.observableArrayList(hts);
            
        }
        catch(Exception e) {
        
            System.out.println(e);
        
        }
        
        this.c_mp.setCellValueFactory(new PropertyValueFactory<Inventario, String>("materiaP"));
        this.c_cant.setCellValueFactory(new PropertyValueFactory<Inventario, String>("cant"));
        this.tb_inventario.setItems(list3);
    }
    
   

}