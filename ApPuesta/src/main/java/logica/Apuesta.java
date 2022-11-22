/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import dto.Cliente;
/**
 *
 * @author ia
 */
public class Apuesta {
    boolean rta = true;
    
    public boolean RegistroCliente(Cliente c){
        if (c.getContrasena() == null) {
            rta = false;
        }
        if (c.getUsuario() == null) {
            rta = false;
        }
        if (c.getCuenta() == null) {
            rta = false;
        }
        else{
            if (c.getCuenta().length()  <  0){
                rta = false;
            }
        }
        if (c.getCelular() == null) {
            rta = false;
        }
        if (c.getCorreo() == null) {
            rta = false;
        }
        if (c.getTipoPerfil() == null) {
            rta = false;
        }
        else{
            if (c.getTipoPerfil()  != "C"){
                rta = false;
            }
        }
        return rta;
    }
}
