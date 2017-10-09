
package Conexiones;

import static Conexiones.AddConexion.contador;
import java.sql.*;
import java.io.*;
import java.util.ArrayList;

import Conexiones.MySQLConection;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


public class UpdateConexion {
    
    static MySQLConection connMySQL = new MySQLConection();
    static Statement s = null;
    static PreparedStatement ps = null;  	
    static int contador = 0;
    
    
    public static void ActualizarDemanda(int idP,int cuenta,String mes) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn = connMySQL.setConeccion();

		ps = conn.prepareStatement("UPDATE PlanDemanda Set "+mes+"="+cuenta+" Where IdPlanD="+idP+"");
		contador = ps.executeUpdate();
                System.out.println("demanda update");
// Cierro el resulset, statement, pstatement
		ps.close();
                connMySQL.setCerrarConeccion();
	}
    
    public static void InsertarPlanProduccion(String mes,String maquina,String proc,int ttotal, int tmo, int tma) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
	{
		// Hago la conexi�n
		Connection conn = connMySQL.setConeccion();
// Insertar
		ps = conn.prepareStatement("INSERT INTO PlanProduccion(mes,NombreMaquina,Proceso,TiempoTotal,TiempoMo,TimepoMaquina)" + 
		   "VALUES (?, ?, ?, ?, ?, ?)");
                
		ps.setString (1, mes);
                ps.setString(2, maquina);
		ps.setString (3, proc);
		ps.setInt(4, ttotal);
		ps.setInt(5, tmo);
		ps.setInt (6, tma);
               
                contador = ps.executeUpdate();
		
// Cierro el resulset, statement, pstatement
		ps.close();
                connMySQL.setCerrarConeccion();
	}

    
}
