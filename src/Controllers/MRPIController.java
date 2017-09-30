package Controllers;

import Conexiones.ReturnEntitiesConexion;
import Entities.Demanda;
import Entities.Historico;
import Entities.MRPI;
import Entities.Receta;
import Entities.tablamedia;
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

public class MRPIController implements Initializable {

    @FXML
    private TableColumn<MRPI, String> c_sep;

    @FXML
    private ImageView btn_record;

    @FXML
    private ImageView btn_mrpu;

    @FXML
    private ImageView btn_output;

    @FXML
    private TableColumn<MRPI, String> c_nov;

    @FXML
    private ImageView btn_recipe;

    @FXML
    private ImageView btn_input;

    @FXML
    private Pane p_historico;

    @FXML
    private TableColumn<MRPI, String> c_abr;

    @FXML
    private TableColumn<MRPI, String> c_prod;

    @FXML
    private TableColumn<MRPI, String> c_ag;

    @FXML
    private ImageView btn_ingre;

    @FXML
    private TableColumn<MRPI, String> c_may;

    @FXML
    private ImageView btn_info;

    @FXML
    private TableColumn<MRPI, String> c_feb;

    @FXML
    private TableColumn<MRPI, String> c_jun;

    @FXML
    private TableView<MRPI> tb_historico;

    @FXML
    private TableColumn<MRPI, String> c_jul;

    @FXML
    private TableColumn<MRPI, String> c_oct;

    @FXML
    private AnchorPane hp_options;

    @FXML
    private ImageView btn_shut;

    @FXML
    private TableColumn<MRPI, String> c_mar;

    @FXML
    private TableColumn<MRPI, String> c_dic;

    @FXML
    private TableColumn<MRPI, String> c_ene;
    
    ArrayList<MRPI> listaMRP = new ArrayList(); 
    private ObservableList<MRPI> list;
    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        this.llenar(); 
        
    }    

    @FXML
    void botonOpciones(MouseEvent event) {
        
        if(event.getTarget()== btn_info){
             
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Main.fxml"));
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
            
        }else if(event.getTarget()==btn_ingre){
        
            
                                                   
        }else if(event.getTarget()==btn_input){
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Frames/Inputs.fxml"));
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
             
             ArrayList<Receta> listaR=ReturnEntitiesConexion.ReturnReceta(); 
             ArrayList<Demanda> listaD=ReturnEntitiesConexion.ReturnDemanda();
             ArrayList<tablamedia> tabla = new ArrayList(); 
             
             float newEne=0; 
             float newFeb=0;
             float newMar=0;
             float newAbr=0;
             float newMay=0; 
             float newJun=0;
             float newJul=0;
             float newAgo=0;
             float newSep=0; 
             float newOct=0;
             float newNov=0;
             float newDic=0;
             float mSalE=0;
             float mSalF=0;
             float mSalM=0;
             float mSalA=0;
             float mSalMy=0;
             float mSalJun=0;
             float mSalJul=0;
             float mSalAg=0;
             float mSalOc=0;
             float mSalNo=0;
             float mSalSe=0;
             float mSalDic=0;
             float mCarE=0;
             float mCarF=0;
             float mCarM=0;
             float mCarA=0;
             float mCarMy=0;
             float mCarJun=0;
             float mCarJul=0;
             float mCarAg=0;
             float mCarOc=0;
             float mCarNo=0;
             float mCarSe=0;
             float mCarDic=0;
             float mVelE=0;
             float mVelF=0;
             float mVelM=0;
             float mVelA=0;
             float mVelMy=0;
             float mVelJun=0;
             float mVelJul=0;
             float mVelAg=0;
             float mVelOc=0;
             float mVelNo=0;
             float mVelSe=0;
             float mVelDic=0;
             
             
             for(Receta rs: listaR){
                 
                 for(Demanda de: listaD){
                     
                     if(rs.getProd().equals(de.getProd())){
                         
                        newEne=de.getEne()*rs.getCant(); 
                        newFeb=de.getFeb()*rs.getCant();
                        newMar=de.getMar()*rs.getCant();
                        newAbr=de.getAbr()*rs.getCant();
                        newMay=de.getMay()*rs.getCant(); 
                        newJun=de.getJun()*rs.getCant();
                        newJul=de.getJul()*rs.getCant();
                        newAgo=de.getAgo()*rs.getCant();
                        newSep=de.getSep()*rs.getCant(); 
                        newOct=de.getOct()*rs.getCant();
                        newNov=de.getNov()*rs.getCant();
                        newDic=de.getDic()*rs.getCant();
                         
                        
                     }
                 }
              
                 tablamedia tm= new tablamedia(rs.getMateriaPrima(),rs.getProd(),newEne,newFeb,newMar,newAbr,newMay,newJun,newJul,newAgo,newSep,newOct,newNov,newDic);                   
                 
                 tabla.add(tm);
              
             }
             
             for(tablamedia t:tabla){
                 
                 if(t.getMateriaP().equals("Sal-Resina")){
                 
                    mSalE=mSalE+t.getEne();
                    mSalF=mSalF+t.getFeb();
                    mSalM=mSalM+t.getMar();
                    mSalA=mSalA+t.getAbr();
                    mSalMy=mSalMy+t.getMay();
                    mSalJun=mSalJun+t.getJun();
                    mSalJul=mSalJul+t.getJul();
                    mSalAg=mSalAg+t.getAgo();
                    mSalOc=mSalOc+t.getOct();
                    mSalNo=mSalNo+t.getNov();
                    mSalSe=mSalSe+t.getSep();
                    mSalDic=mSalDic+t.getDic();
                    
                    
                    
                 }else if(t.getMateriaP().equals("Carbon")){
                     
                    mCarE=mCarE+t.getEne();
                    mCarF=mCarF+t.getFeb();
                    mCarM=mCarM+t.getMar();
                    mCarA=mCarA+t.getAbr();
                    mCarMy=mCarMy+t.getMay();
                    mCarJun=mCarJun+t.getJun();
                    mCarJul=mCarJul+t.getJul();
                    mCarAg=mCarAg+t.getAgo();
                    mCarOc=mCarOc+t.getOct();
                    mCarNo=mCarNo+t.getNov();
                    mCarSe=mCarSe+t.getSep();
                    mCarDic=mCarDic+t.getDic();
                    
                    MRPI mrp = new MRPI(t.getMateriaP(),mCarE,mCarF,mCarM,mCarA,mCarMy,mCarJun,mCarJul,mCarAg,mCarSe,mCarOc,mCarNo,mCarDic);
                     
                 }else{
                     
                    mVelE=mVelE+t.getEne();
                    mVelF=mVelF+t.getFeb();
                    mVelM=mVelM+t.getMar();
                    mVelA=mVelA+t.getAbr();
                    mVelMy=mVelMy+t.getMay();
                    mVelJun=mVelJun+t.getJun();
                    mVelJul=mVelJul+t.getJul();
                    mVelAg=mVelAg+t.getAgo();
                    mVelOc=mVelOc+t.getOct();
                    mVelNo=mVelNo+t.getNov();
                    mVelSe=mVelSe+t.getSep();
                    mVelDic=mVelDic+t.getDic();
                    
                    MRPI mrp = new MRPI(t.getMateriaP(),mVelE,mVelF,mVelM,mVelA,mVelMy,mVelJun,mVelJul,mVelAg,mVelSe,mVelOc,mVelNo,mVelDic);
                 }
                 
             }
             
             MRPI mrp = new MRPI("Sal-Resina",mSalE,mSalF,mSalM,mSalA,mSalMy,mSalJun,mSalJul,mSalAg,mSalSe,mSalOc,mSalNo,mSalDic);
             listaMRP.add(mrp);
             
             MRPI mr = new MRPI("Carbon",mCarE,mCarF,mCarM,mCarA,mCarMy,mCarJun,mCarJul,mCarAg,mCarSe,mCarOc,mCarNo,mCarDic);
             listaMRP.add(mr);
             
             MRPI mp = new MRPI("Velas",mVelE,mVelF,mVelM,mVelA,mVelMy,mVelJun,mVelJul,mVelAg,mVelSe,mVelOc,mVelNo,mVelDic);
             listaMRP.add(mp);
             
             this.llenarTabla();           
             
             
             
        }catch(Exception e){
            System.out.print(e);
        }
       
        
    }

    private void llenarTabla() {
        
        try{
            list = FXCollections.observableArrayList(this.listaMRP);
            
        }
        catch(Exception e) {
        System.out.println(e);
        
        }
        
        this.c_prod.setCellValueFactory(new PropertyValueFactory<MRPI, String>("mp"));
        this.c_ene.setCellValueFactory(new PropertyValueFactory<MRPI, String>("ene"));
        this.c_feb.setCellValueFactory(new PropertyValueFactory<MRPI, String>("feb"));
        this.c_abr.setCellValueFactory(new PropertyValueFactory<MRPI, String>("abr"));
        this.c_mar.setCellValueFactory(new PropertyValueFactory<MRPI, String>("mar"));
        this.c_may.setCellValueFactory(new PropertyValueFactory<MRPI, String>("may"));
        this.c_jun.setCellValueFactory(new PropertyValueFactory<MRPI, String>("jun"));
        this.c_jul.setCellValueFactory(new PropertyValueFactory<MRPI, String>("jul"));
        this.c_ag.setCellValueFactory(new PropertyValueFactory<MRPI, String>("ago"));
        this.c_sep.setCellValueFactory(new PropertyValueFactory<MRPI, String>("sep"));
        this.c_oct.setCellValueFactory(new PropertyValueFactory<MRPI, String>("oct"));
        this.c_nov.setCellValueFactory(new PropertyValueFactory<MRPI, String>("nov"));
        this.c_dic.setCellValueFactory(new PropertyValueFactory<MRPI, String>("dic"));
        this.tb_historico.setItems(list);
        
    }

    
    
    

}
