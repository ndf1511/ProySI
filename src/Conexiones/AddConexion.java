package Conexiones;

import java.sql.*;
import java.io.*;
import java.util.ArrayList;

import Conexiones.MySQLConection;
import Entities.Demanda;
import Entities.Lluvia;


public class AddConexion {

	static MySQLConection connMySQL = new MySQLConection();
	static Statement s = null;
	static PreparedStatement ps = null;  	
	static int contador = 0;
	
	     
	public static void InsertarLluvia(int id, String mes,int prob) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
	{
		// Hago la conexi�n
		Connection conn = connMySQL.setConeccion();
                // Insertar
		ps = conn.prepareStatement("INSERT INTO Lluvia (idlluvia,mes,probabilidad) " + 
		   "VALUES (?,?,?)");
                
                ps.setInt(1, id);
		ps.setString(2, mes);
		ps.setInt (3, prob);
                
		contador = ps.executeUpdate();
                
                System.out.println(contador + " LLuvia insertada\n");
                
                // Cierro el resulset, statement, pstatement
		ps.close();
                connMySQL.setCerrarConeccion();
	}

        public static void insertarLLuviasPlan(int idLluvia) {
            
              try{
                  
              Connection conn = connMySQL.setConeccion();
                // Insertar
                 
              ArrayList<Demanda> dd=ReturnEntitiesConexion.ReturnPlanDemanda();
              ArrayList<Integer> ids=ReturnEntitiesConexion.ConsultarIdLluvia(); 
              
             for(Integer lluvi: ids){
                 
                 System.out.println(lluvi);
             } 
              
             for(Demanda demandin: dd){
                  
                 
                  ps = conn.prepareStatement("INSERT INTO PlanLluvias (idLluvia,IdplanD) " + 
		   "VALUES (?,?)");                  
                  
                  ps.setInt(1, idLluvia);
                  ps.setInt(2, demandin.getId()); 
                  contador = ps.executeUpdate();
                  ps.close();
                  
                  System.out.println(contador + "planLluvia insertado\n");
                  
              }      
              
             
                  connMySQL.setCerrarConeccion();       
            }
            catch(Exception e) {
            System.out.println(e);

            }

        }
        
}
