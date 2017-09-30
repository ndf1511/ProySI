package Conexiones;

import java.sql.*;
/*
Nombre del JavaBean: MySQLConection.java
Escrito por: Nairo Granados Mart�nez

Descripci�n: 
Este JavaBean sirve para Crear, Abrir y Cerrar una conecci�n

Variables:
Connection conn = Utilizada para establecer la conceccion con la base de datos.
String strHost = N�mero IP del servidor de Firebird.
String strPuerto = N�mero del Puerto de la base de datos.
String strNombreDB = Nombre de la Base de Datos.
String strUsuario = Usuario de la Base de Datos.
String strPassword = Password del Usuario.
*/

public class MySQLConection {
	// -----------------------------------------------------------------
	// DECLARACI�N DE VARIABLES
	// -----------------------------------------------------------------
	protected Connection conn = null;
	String strHost = "127.0.0.1";
	String strPuerto = "3306";
	String strNombreDB = "ProyectoSI";
	String strUsuario = "root";
	String strPassword = "millos";

	// -----------------------------------------------------------------
	// METODOS
	// -----------------------------------------------------------------

	// -----------------------------------------------------------------
	// Metodo setConneccion:
	// Procedimiento que establece conecci�n con la base de datos.
	//
	// -----------------------------------------------------------------
	public Connection setConeccion() throws ClassNotFoundException,
			SQLException, InstantiationException, IllegalAccessException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		conn = DriverManager.getConnection("jdbc:mysql://" + strHost + ":"
				+ strPuerto + "/" + strNombreDB, strUsuario, strPassword);
		return conn;
	}

        public void Test(){
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://" + strHost + ":"
				+ strPuerto + "/" + strNombreDB, strUsuario, strPassword)) {
                    System.out.println("Database connected!");
            }catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
            }
        }
        
	// -----------------------------------------------------------------
	// Metodo setCerrarConeccion:
	// Procedimiento que cierra la conecci�n con la base de datos.
	//
	// -----------------------------------------------------------------
	public void setCerrarConeccion() throws SQLException {
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) { /* ignore close errors */
			}
		}
	}
}
