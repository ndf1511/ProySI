package Controllers;

import Conexiones.MySQLConection;
import Entities.Lluvia;
import Entities.Historico; 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;


public class MainController implements Initializable{

      @FXML
    private ImageView btn_record;

    @FXML
    private ImageView btn_output;
    
    @FXML
    private ImageView btn_lista;

    @FXML
    private ImageView btn_info;
    
    @FXML
    private ImageView btn_info1;
     
    @FXML
    private ImageView btn_input;

    @FXML
    private AnchorPane hp_options;

    @FXML
    private ImageView btn_shut;

    @FXML
    private Pane p_blanco;
    
    @FXML
    private ImageView btn_recipe;
       
    @FXML
    private ImageView btn_mrpu; 
    
    
    private static String ruta; 
    private ObservableList<Historico> plist;
    public ArrayList<Lluvia> lluvias= new ArrayList();
    public static ArrayList <String> columnData = new ArrayList<>();
    

   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
               
        
        
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
        
             FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Procesos.fxml"));
             this.AbrirFXML(fxmlLoader,event); 
                  
        }else{
             //System.exit(0);
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
    
    /*
     @FXML
    void cdemanda(ActionEvent event) {

        this.llenarDemanda();
    }

    private void filltable() {
        
       this.ruta="./archivos/prod.txt";
       reg.verificarTxt(this.ruta);
       this.llenar(); 
       //this.ExtraerTodos(); 
        
    }

    private void llenar() {

        try{
            
            ArrayList<producto> mp;
            mp = reg.sacarprods(this.ruta);
            ArrayList<producto> mp2 = new ArrayList();
            
            for(producto prod: mp){
                
                mp2.add(prod);
               
            }
            
            plist =FXCollections.observableArrayList(mp2);
                       
            
        }
        catch(Exception e) {
        System.out.println(e);
        
        }
        this.c_prod.setCellValueFactory(new PropertyValueFactory<producto, String>("name"));
        this.c_ene.setCellValueFactory(new PropertyValueFactory<producto, String>("ene"));
        this.c_feb.setCellValueFactory(new PropertyValueFactory<producto, String>("feb"));
        this.c_abr.setCellValueFactory(new PropertyValueFactory<producto, String>("abr"));
        this.c_mar.setCellValueFactory(new PropertyValueFactory<producto, String>("mar"));
        this.c_may.setCellValueFactory(new PropertyValueFactory<producto, String>("may"));
        this.c_jun.setCellValueFactory(new PropertyValueFactory<producto, String>("jun"));
        this.c_jul.setCellValueFactory(new PropertyValueFactory<producto, String>("jul"));
        this.c_ag.setCellValueFactory(new PropertyValueFactory<producto, String>("ago"));
        this.c_sep.setCellValueFactory(new PropertyValueFactory<producto, String>("sep"));
        this.c_oct.setCellValueFactory(new PropertyValueFactory<producto, String>("oct"));
        this.c_nov.setCellValueFactory(new PropertyValueFactory<producto, String>("nov"));
        this.c_dic.setCellValueFactory(new PropertyValueFactory<producto, String>("dic"));
        
        this.tb_historico.setItems(plist);

    }

    private void addlluvias() {
        
        int finde; 
        int proba;
        String mes=this.cb_mes.getValue();
        String p=this.cb_prob.getValue();
        boolean f=this.rb_opc.isSelected();
        
        if(p.equals( "0-40")){
            proba=1; 
        }else if(p.equals( "41-70")){
            proba=2;
        }else if(p.equals( "71-90")){
            proba=3; 
        }else{
            proba=4;
        }
        
        if(f==true){
            finde=1; 
        }else{
            finde=0;
        }
        
        Lluvia llu = new Lluvia(finde,proba,mes);
        this.lluvias.add(llu);
                   
    }

    private void llenarDemanda() {
        
        this.sacarDatosReg(this.cb_mes.getValue());
        //reg.calcularDemanda(this.lluvias,this.txt_event.getText(),this.txt_vis.getText(),this.cb_mes.getValue());
        
    }

    public void sacarDatosReg(String mes){
        
        int visitantes = Integer.parseInt(txt_vis.getText());
        int eventos=Integer.parseInt(this.txt_event.getText());
       
              
        if(mes=="Enero"){
            
            TableColumn<producto, String> column = this.c_ene; 
            
            for (producto item : tb_historico.getItems()) {
            
            //System.out.println(this.c_ene.getCellObservableValue(item).getValue());
            columnData.add(this.c_ene.getCellObservableValue(item).getValue());
            
            }
            
        }else if(mes=="Febrero"){
            
            TableColumn<producto, String> column = this.c_feb; 
            
             for (producto item : tb_historico.getItems()) {
            
            //System.out.println(this.c_feb.getCellObservableValue(item).getValue());
            columnData.add(this.c_feb.getCellObservableValue(item).getValue());
            
            }
            
            
        }else if(mes=="Marzo"){
            
            TableColumn<producto, String> column = this.c_mar; 
            
             for (producto item : tb_historico.getItems()) {
            
            //System.out.println(this.c_mar.getCellObservableValue(item).getValue());
            columnData.add(this.c_mar.getCellObservableValue(item).getValue());
            
            }
            
        } else if(mes=="Abril"){
            
            TableColumn<producto, String> column = this.c_abr; 
            
             for (producto item : tb_historico.getItems()) {
            
            //System.out.println(this.c_abr.getCellObservableValue(item).getValue());
            columnData.add(this.c_abr.getCellObservableValue(item).getValue());
            
            }
            
        } else if(mes=="Mayo"){
            
            TableColumn<producto, String> column = this.c_may; 
            
             for (producto item : tb_historico.getItems()) {
            
            //System.out.println(this.c_may.getCellObservableValue(item).getValue());
            columnData.add(this.c_may.getCellObservableValue(item).getValue());
            
            }
            
        } else if(mes=="Junio"){
            
            TableColumn<producto, String> column = this.c_jun; 
            
             for (producto item : tb_historico.getItems()) {
            
            //System.out.println(this.c_jun.getCellObservableValue(item).getValue());
            columnData.add(this.c_jun.getCellObservableValue(item).getValue());
            
            }
            
        } else if(mes=="Julio"){
            
            TableColumn<producto, String> column = this.c_jul; 
            
             for (producto item : tb_historico.getItems()) {
            
            //System.out.println(this.c_jul.getCellObservableValue(item).getValue());
            columnData.add(this.c_jul.getCellObservableValue(item).getValue());
            
            }
            
        } else if(mes=="Agosto"){
            
            TableColumn<producto, String> column = this.c_ag; 
            
             for (producto item : tb_historico.getItems()) {
            
            //System.out.println(this.c_ag.getCellObservableValue(item).getValue());
            columnData.add(this.c_ag.getCellObservableValue(item).getValue());
            
            }
            
        } else if(mes=="Septiembre"){
            
            TableColumn<producto, String> column = this.c_sep; 
            
             for (producto item : tb_historico.getItems()) {
            
            //System.out.println(this.c_sep.getCellObservableValue(item).getValue());
            columnData.add(this.c_sep.getCellObservableValue(item).getValue());
            
            }
            
        } else if(mes=="Octubre"){
            
            TableColumn<producto, String> column = this.c_oct; 
            
             for (producto item : tb_historico.getItems()) {
            
            //System.out.println(this.c_oct.getCellObservableValue(item).getValue());
            columnData.add(this.c_oct.getCellObservableValue(item).getValue());
            
            }
            
        } else if(mes=="Noviembre"){
            
            TableColumn<producto, String> column = this.c_nov;
            
             for (producto item : tb_historico.getItems()) {
            
            //System.out.println(this.c_nov.getCellObservableValue(item).getValue());
            columnData.add(this.c_nov.getCellObservableValue(item).getValue());
            
            }
            
        } else{
            
            TableColumn<producto, String> column = this.c_dic; 
            
             for (producto item : tb_historico.getItems()) {
            
            //System.out.println(this.c_dic.getCellObservableValue(item).getValue());
            columnData.add(this.c_dic.getCellObservableValue(item).getValue());
            
            }
        } 
               
        int resultado; 
        
        ArrayList<Integer> results = new ArrayList();

        for(String info: columnData){
            
            String hop = info;
           
            int unidades=Integer.valueOf(hop);
            
            float influvis= visitantes/5000f; 
            //float influlluvias= ((lluvias*0.06f)*100f);
            float influeventos= (eventos*200)/40000f; 
            
            if(mes=="Enero" || mes=="Septiembre"){

               resultado= (int) ((unidades-(unidades*(influlluvias))+(unidades*(influvis))+(unidades*(influeventos))-(unidades*(0.05))+(unidades*0.1)));

            }else if(mes=="Marzo"){

               resultado= (int) ((unidades-(unidades*(influlluvias))+(unidades*(influvis))+(unidades*(influeventos))-(unidades*(0.05))+(unidades*0.2)));
               
            }else if(mes=="Abril"){
                
               resultado= (int) ((unidades-(unidades*(influlluvias))+(unidades*(influvis))+(unidades*(influeventos))-(unidades*(0.05))-(unidades*0.2)));
               
            }else{
               
               resultado= (int) ((unidades-(unidades*(influlluvias))+(unidades*(influvis))+(unidades*(influeventos))-(unidades*(0.05))));
            }
            System.out.println(resultado);
            
            results.add(resultado);
            
        }
        
        this.llenarTablaDemanda(results); 
        
        
   }   

    private void llenarTablaDemanda(ArrayList<Integer> resultados) {
       
       
    }

    */
 

}