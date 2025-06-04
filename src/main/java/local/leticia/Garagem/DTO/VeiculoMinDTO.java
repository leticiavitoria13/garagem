/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.leticia.Garagem.DTO;

import local.leticia.Garagem.entities.Veiculo;

/**
 *
 * @author ppjatb
 */
public class VeiculoMinDTO {
    private long id;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private double km;
    private String linkImagem;

    public VeiculoMinDTO() {
    }

    public VeiculoMinDTO( Veiculo veiculo ) {
        this.id = veiculo.getId();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.cor = veiculo.getCor();
        this.ano = veiculo.getAno();
        this.km = veiculo.getKm();
        this.linkImagem = veiculo.getLinkImagem();
    }

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public double getKm() {
        return km;
    }

    public String getLinkImagem() {
        return linkImagem;
    }
    
  

   
  
    
}
    

