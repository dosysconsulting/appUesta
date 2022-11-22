/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import bd.conexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ia
 */
public class principal {

    public static void main (String [ ] args) throws ClassNotFoundException, SQLException {

        conexionBD con = new conexionBD();
        con.abrirConexion();   

        
//Statement s = con.createStatement();
//ResultSet rs = s.executeQuery ("select * from clientes");
//while (rs.next())
//{
//    System.out.println ("aqui");
//}

    } //Cierre del main

}

