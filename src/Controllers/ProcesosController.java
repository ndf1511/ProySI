package Controllers;

import Conexiones.ReturnEntitiesConexion;
import Entities.Inventario;
import Entities.Maquinaria;
import Entities.Proceso;
import Entities.Proveedor;
import Entities.Receta;
import Entities.Suministro;
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

public class ProcesosController implements Initializable{

    @FXML
    private TableColumn<Proceso, String> tc_timeMaquina;

    @FXML
    private ImageView btn_record;
    
    @FXML
    private ImageView btn_pp;

    @FXML
    private TableColumn<Maquinaria, String> c_costoh;

    @FXML
    private ImageView btn_mrpu;

    @FXML
    private ImageView btn_recipe;

    @FXML
    private TableColumn<Maquinaria, String> c_costot;

    @FXML
    private ImageView btn_lista;

    @FXML
    private TableColumn<Suministro, String> ct_precioH;

    @FXML
    private TableView<Suministro> tb_sumin;

    @FXML
    private TableColumn<Maquinaria, String> c_timevida;

    @FXML
    private Pane p_demanda;

    @FXML
    private TableColumn<Proceso, String> tc_detail;

    @FXML
    private TableColumn<Proceso, String> tc_timeM;

    @FXML
    private TableColumn<Proceso, String> tc_nombre;

    @FXML
    private AnchorPane hp_options1;

    @FXML
    private ImageView btn_info;

    @FXML
    private ImageView btn_shut;

    @FXML
    private TableColumn<Proceso, String> tc_maquina;

    @FXML
    private TableView<Proceso> tb_procesos;

    @FXML
    private TableColumn<Proceso, String> tc_num;

    @FXML
    private ImageView btn_output;

    @FXML
    private TableColumn<Suministro, String> ct_sumi;

    @FXML
    private ImageView btn_input;

    @FXML
    private TableColumn<Maquinaria, String> c_nombremaq;

    @FXML
    private TableView<Maquinaria> tb_maquinaria;

    @FXML
    private TableColumn<Proceso, String> tc_timet;
    private ObservableList<Maquinaria> list4;
    private ObservableList<Proceso> list5;
    private ObservableList<Suministro> list6;
    
    
   @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        this.llenarMaqu();
        this.llenarProc();
        this.llenarSum();
        
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
     
     private void llenarMaqu() {
        
        try{
            
        ArrayList<Maquinaria> hts =ReturnEntitiesConexion.ReturnMaqu(); 
        list4 = FXCollections.observableArrayList(hts);
            
        }
        catch(Exception e) {
        
            System.out.println(e);
        
        }
        
        this.c_nombremaq.setCellValueFactory(new PropertyValueFactory<Maquinaria, String>("Maquina"));
        this.c_timevida.setCellValueFactory(new PropertyValueFactory<Maquinaria, String>("TiempoVida"));
        this.c_costot.setCellValueFactory(new PropertyValueFactory<Maquinaria, String>("CostoTotal"));
        this.c_costoh.setCellValueFactory(new PropertyValueFactory<Maquinaria, String>("CostoHora"));
        this.tb_maquinaria.setItems(list4);
    }
     
     private void llenarProc() {
        
        try{
            
        ArrayList<Proceso> hts =ReturnEntitiesConexion.ReturnProceso(); 
        list5 = FXCollections.observableArrayList(hts);
            
        }
        catch(Exception e) {
        
            System.out.println(e);
        
        }
        
        this.tc_num.setCellValueFactory(new PropertyValueFactory<Proceso, String>("idProceso"));
        this.tc_nombre.setCellValueFactory(new PropertyValueFactory<Proceso, String>("nombre"));
        this.tc_detail.setCellValueFactory(new PropertyValueFactory<Proceso, String>("detalle"));
        this.tc_timet.setCellValueFactory(new PropertyValueFactory<Proceso, String>("TiempoTotal"));
        this.tc_timeM.setCellValueFactory(new PropertyValueFactory<Proceso, String>("TiempoManoObra"));
        this.tc_maquina.setCellValueFactory(new PropertyValueFactory<Proceso, String>("Maquinaria"));
        this.tc_timeMaquina.setCellValueFactory(new PropertyValueFactory<Proceso, String>("TiempoMaquinaria"));
        this.tb_procesos.setItems(list5);
    }
     
     private void llenarSum() {
        
        try{
            
        ArrayList<Suministro> hts =ReturnEntitiesConexion.ReturnSum(); 
        list6 = FXCollections.observableArrayList(hts);
            
        }
        catch(Exception e) {
        
            System.out.println(e);
        
        }
        
        this.ct_sumi.setCellValueFactory(new PropertyValueFactory<Suministro, String>("Nombre"));
        this.ct_precioH.setCellValueFactory(new PropertyValueFactory<Suministro, String>("PrecioHora"));
        this.tb_sumin.setItems(list6);
    }


}
