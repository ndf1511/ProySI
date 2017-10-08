/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Entities.*;

/**
 *
 * @author User
 */
public class ReturnEntitiesConexion {
    
	static MySQLConection connMySQL = new MySQLConection();
	static Statement s = null;
	static PreparedStatement ps = null;
	static int contador = 0;

	
              
        public static ArrayList<Historico> ReturnHistorico()
                        throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
            
            Connection conn = connMySQL.setConeccion(); 
            ArrayList<Historico> array= new ArrayList(); 
            ps = conn.prepareStatement("select IdRegistroHistorico,IdProducto,Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre from RegistroHistorico");
		ResultSet rs = ps.executeQuery();
                Historico H;
                
            while (rs.next()) {
                    
                    String nombreProd=ReturnEntitiesConexion.ReturnNombreProd(rs.getInt(2));
                                  
                    H = new Historico(nombreProd,rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(12),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14));
                    //H.setPrecio(rs.getString(4));
                    //H.setDescripcion(rs.getString(5));
                    array.add(H);
		}
            return array; 
        }
        
        public static ArrayList<Historico> ReturnHistoricoID()
                        throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
            
            Connection conn = connMySQL.setConeccion(); 
            ArrayList<Historico> array= new ArrayList(); 
            ps = conn.prepareStatement("select IdRegistroHistorico,IdProducto,Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre from RegistroHistorico");
		ResultSet rs = ps.executeQuery();
                Historico H;
                
            while (rs.next()) {
                    
                    String nombreProd=ReturnEntitiesConexion.ReturnNombreProd(rs.getInt(2));
                                  
                    H = new Historico(rs.getInt(1),nombreProd,rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(12),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14));
                    //H.setPrecio(rs.getString(4));
                    //H.setDescripcion(rs.getString(5));
                    array.add(H);
		}
            return array; 
        }
        
        
        public static String ReturnNombreProd(int id)
                        throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
            
            String nombre=null; 
            Connection conn = connMySQL.setConeccion(); 
            
            ArrayList<String> tt= new ArrayList(); 
            ps = conn.prepareStatement("select IdProducto,NombreProducto from Producto where idProducto="+id );
		ResultSet rs = ps.executeQuery();
                Producto p;
                
            while (rs.next()) {
                    
                        nombre=rs.getString(2);
                  }
            
            //for(String n:tt){
              //System.out.println(n);
            //}
            
            return nombre; 
        }
        
        public static ArrayList<String> ReturnProd()
                        throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
            
            String nombre=null; 
            Connection conn = connMySQL.setConeccion(); 
            
            ArrayList<String> tt= new ArrayList(); 
            
            ps = conn.prepareStatement("select NombreProducto from Producto");
		ResultSet rs = ps.executeQuery();
                Producto p;
                
            while (rs.next()) {
                    
                        tt.add(rs.getString(1));
                  }
                   
            return tt; 
        }
        
           public static ArrayList<Demanda> ReturnPlanDemanda()
                        throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
            
            Connection conn = connMySQL.setConeccion(); 
            ArrayList<Demanda> array= new ArrayList(); 
            ps = conn.prepareStatement("Select IdPlanD,IdProducto,Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre from PlanDemanda" );
		ResultSet rs = ps.executeQuery();
                Demanda D;
                
            while (rs.next()) {
                    
                    String nombreProd=ReturnEntitiesConexion.ReturnNombreProd(rs.getInt(1));
                   
                    D = new Demanda(rs.getInt(1),nombreProd);
                    //H.setPrecio(rs.getString(4));
                    //H.setDescripcion(rs.getString(5));
                    array.add(D);
                        
                  }
           
            return array; 
        }
           
           
       public static ArrayList<Integer> ConsultarIdLluvia()
			throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		// Hago la conexi�n
		Connection conn = connMySQL.setConeccion();
		ArrayList<Integer> Ids = new ArrayList();

		ps = conn.prepareStatement("select IdLluvia from Lluvia");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Ids.add(rs.getInt(1));
		}
		// Cierro el resulset, statement, pstatement
		ps.close();
		rs.close();
		connMySQL.setCerrarConeccion();
		return Ids;

	}
       
        public static ArrayList<Lluvia> ConsultarLluvias(String mes)
			throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		// Hago la conexi�n
		Connection conn = connMySQL.setConeccion();
		ArrayList<Lluvia> lluv= new ArrayList();

		ps = conn.prepareStatement("select * from Lluvia where mes=?");
                ps.setString(1,mes);
		ResultSet rs = ps.executeQuery();
                Lluvia L; 
		while (rs.next()) {
                        L=new Lluvia(rs.getInt(1),rs.getInt(3),rs.getString(2)); 
			lluv.add(L);
		}
		// Cierro el resulset, statement, pstatement
		ps.close();
		rs.close();
		connMySQL.setCerrarConeccion();
		return lluv;
	}

     public static ArrayList<Demanda> ReturnDemanda()
                        throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
            
            Connection conn = connMySQL.setConeccion(); 
            ArrayList<Demanda> array= new ArrayList(); 
            ps = conn.prepareStatement("Select IdPlanD,IdProducto,Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre from PlanDemanda" );
		ResultSet rs = ps.executeQuery();
                Demanda D;
                
            while (rs.next()) {
                    
                    String nombreProd=ReturnEntitiesConexion.ReturnNombreProd(rs.getInt(1));
                   
                    D = new Demanda(rs.getInt(1),nombreProd,rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getInt(10),rs.getInt(11),rs.getInt(12),rs.getInt(13),rs.getInt(14));
                    array.add(D);
                  }
           
            return array; 
        }
       
     
       public static ArrayList<Receta> ReturnReceta()
                        throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
            
            Connection conn = connMySQL.setConeccion(); 
            ArrayList<Receta> array= new ArrayList(); 
            ps = conn.prepareStatement("SELECT NombreMateriaP,Re.IdProducto,R.cantidad FROM\n" +
                                       "RectaMateriaP R INNER JOIN MateriaP M On R.IdMateriaP=M.IdMateriaP\n" +
                                       "INNER JOIN Receta Re ON R.IdReceta=Re.IdReceta\n" +
                                       "Order By Re.IdProducto;");
		ResultSet rs = ps.executeQuery();
                Receta R;
                
            while (rs.next()) {
                    
                    String nombreProd=ReturnEntitiesConexion.ReturnNombreProd(rs.getInt(2));
                                  
                    R= new Receta(rs.getString(1),rs.getFloat(3),nombreProd);
                    array.add(R);
                    
		
                }

               return array; 
        }

        public static ArrayList<Proveedor> ReturnProv()
                        throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
            
            Connection conn = connMySQL.setConeccion(); 
            
            ArrayList<Proveedor> tt= new ArrayList(); 
            
            ps = conn.prepareStatement("select NombreProv, TelefonoProv from Proveedor");
            ResultSet rs = ps.executeQuery();
            Proveedor P;
                
            while (rs.next()) {
                    
                        P= new Proveedor(rs.getString(1),rs.getString(2));
                        tt.add(P);
                  }
                   
            return tt; 
        }
        
         public static ArrayList<Inventario> ReturnInv()
                        throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
            
            Connection conn = connMySQL.setConeccion(); 
            
            ArrayList<Inventario> tt= new ArrayList(); 
            
            ps = conn.prepareStatement("Select NombreMateriaP,stock from InventarioMateriaP I Inner Join MateriaP M On I.idMateriaP= M.IdMateriaP");
            ResultSet rs = ps.executeQuery();
            Inventario I;
                
            while (rs.next()) {
                    
                        I= new Inventario(rs.getString(1),rs.getInt(2));
                        tt.add(I);
                  }
                   
            return tt; 
        }
         
         public static ArrayList<Maquinaria> ReturnMaqu()
                        throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
            
            Connection conn = connMySQL.setConeccion(); 
            
            ArrayList<Maquinaria> tt= new ArrayList(); 
            
            ps = conn.prepareStatement("Select Maquina,TimepoVida,CostoTotal,CostoHora from Maquinaria");
            ResultSet rs = ps.executeQuery();
            Maquinaria M;
                
            while (rs.next()) {
                    
                        M= new Maquinaria(rs.getString(1),rs.getInt(2),rs.getFloat(3),rs.getFloat(4));
                        tt.add(M);
                  }
                   
            return tt; 
        }
         
         public static ArrayList<Proceso> ReturnProceso()
                        throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
            
            Connection conn = connMySQL.setConeccion(); 
            ArrayList<Proceso> arrayP= new ArrayList(); 
            ps = conn.prepareStatement("SELECT P.IdProceso, P.Nombre,  P.Detalle, P.TiempoTotal, P.TiempoManoObra, M.Maquina, MP.TiempoMaquinaProc, P.CantidadProcesada \n" +
                                        "FROM Proceso P LEFT OUTER JOIN MaquinaProceso MP ON P.IdProceso = MP.IdProceso LEFT OUTER Join Maquinaria M on \n"+
                                        " M.IdMaquinaria = MP.IdMaquinaria;");
                ResultSet rs = ps.executeQuery();
                Proceso P;                
            while (rs.next()) {
                    
           
                    P= new Proceso(rs.getString(2),rs.getString(3),rs.getString(6),rs.getInt(8),rs.getInt(4),rs.getInt(5),rs.getInt(1),rs.getInt(7));
                    arrayP.add(P);
                    
                }

               return arrayP; 
        }
        
         public static ArrayList<Suministro> ReturnSum()
                        throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
            
            Connection conn = connMySQL.setConeccion(); 
            
            ArrayList<Suministro> tt= new ArrayList(); 
            
            ps = conn.prepareStatement("Select Nombre,PrecioHora from Suministro");
            ResultSet rs = ps.executeQuery();
            Suministro S;
                
            while (rs.next()) {
                    
                        S= new Suministro(rs.getString(1),rs.getFloat(2));
                        tt.add(S);
                  }
                   
            return tt; 
        }
        
}
