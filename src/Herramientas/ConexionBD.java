/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Antonio
 */
public class ConexionBD {
    
    Connection cn;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/typingTrainer", "root", "");
            System.out.println("se hizo la conexion exitosa");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Hola bola error");
            System.out.println(e.getMessage());
        }return cn;        
    }
    Statement createStatement(){
        throw new UnsupportedOperationException("no soportado");
    }
}