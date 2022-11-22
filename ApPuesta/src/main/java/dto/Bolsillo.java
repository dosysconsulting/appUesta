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
public class Bolsillo {
   private String idBolsillo;
   private String idCliente;
   private String valor;

    public String getIdBolsillo() {
        return idBolsillo;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getValor() {
        return valor;
    }

    public void setIdBolsillo(String idBolsillo) {
        this.idBolsillo = idBolsillo;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
   
   
}
