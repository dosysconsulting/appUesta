/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ia
 */
public class conexionBD {
    
    public void abrirConexion() throws ClassNotFoundException{
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            String sURL = "jdbc:mysql://localhost:3306/apuesta";
            Connection conectar = DriverManager.getConnection(sURL, "richi", "richi");
            System.out.println("Conexión Exitosa");
        }catch(SQLException ex){
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }
    }

    public PreparedStatement prepareStatement(String SQL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
