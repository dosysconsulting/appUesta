package dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ia
 */
public class ApuestaCliente {
 
   private String idApuestaCliente;
   private String idApuesta;
   private String idCliente;
   private String fechaCreacion;
   private String ValorApostado;

    public String getIdApuestaCliente() {
        return idApuestaCliente;
    }

    public String getIdApuesta() {
        return idApuesta;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getValorApostado() {
        return ValorApostado;
    }

    public void setIdApuestaCliente(String idApuestaCliente) {
        this.idApuestaCliente = idApuestaCliente;
    }

    public void setIdApuesta(String idApuesta) {
        this.idApuesta = idApuesta;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setValorApostado(String ValorApostado) {
        this.ValorApostado = ValorApostado;
    }
    
   
}
