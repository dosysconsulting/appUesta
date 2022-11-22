/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;
import bd.conexionBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author ia
 */
public class Cliente {
    private String usuario;
    private String contrasena;
    private String correo;
    private String celular;
    private String cuenta;
    private String tipoPerfil;

   // public Cliente(String usuario, String contrasena, String correo, String celular, String cuenta, String tipoPerfil){
   //     this.usuario = usuario;
   //     this.contrasena = contrasena;
   //     this.correo = correo;
   //     this.celular = celular;
   //     this.cuenta = cuenta;
   //     this.tipoPerfil = tipoPerfil;
   // }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCelular() {
        return celular;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getTipoPerfil() {
        return tipoPerfil;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setTipoPerfil(String tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }

    public void insertCliente(Cliente c) throws SQLException{
        String sql = "INSERT INTO clientes(usuario, contrasena, correo, celular, cuenta, tipoperfil) "
                + "VALUES(?,?,?,?,?,?)";
        conexionBD con = new conexionBD();
        //con.abrirConexion();   
        PreparedStatement list = con.prepareStatement(sql,
                              Statement.RETURN_GENERATED_KEYS);
        
        list.setString(1, c.usuario);
        list.setString(2, c.contrasena);
        list.setString(3, c.correo);
        list.setString(4, c.celular);
        list.setString(5, c.cuenta);
        list.setString(6, "C");
    }
}
