package br.com.vinicius.modelo;

import java.io.Serializable;

public class Caminhao extends Veiculo implements Tributavel {
    private double capacidadeDeCarga;

    public Caminhao (String marca, String modelo, int anoDeFabricacao,String placa, String cor,double valor, Pessoa dono, int capacidadeDeCarga){
        super(marca, modelo, anoDeFabricacao,placa, cor, valor, dono);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
    public Caminhao (String marca, String modelo, int anoDeFabricacao,String placa, String cor, double valor, int capacidadeDeCarga){
        super(marca, modelo, anoDeFabricacao, placa, cor, valor);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public double calcularSeguro(){
        return this.getCapacidadeDeCarga() * 0.23;
    }

    public double calcularImposto(){
        return getValor();
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Capacidade de Carga: " + this.capacidadeDeCarga + "kg");
        System.out.println("--------------------------------");
    }

    public double getCapacidadeDeCarga() {
        return  capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(double capacidadeDeCarga) {
        if (capacidadeDeCarga > 0){
            this.capacidadeDeCarga = capacidadeDeCarga;
        }else {
            System.out.println("ERRO: Capacidade de carga deve ser positiva!");
            this.capacidadeDeCarga = 0;
        }
    }
}
