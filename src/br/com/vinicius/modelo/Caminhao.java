package br.com.vinicius.modelo;

public class Caminhao extends Veiculo{
    private int capacidadeDeCarga;

    public Caminhao (String marca, String modelo, int anoDeFabricacao, String cor, Pessoa dono){
        super(marca, modelo, anoDeFabricacao, cor, dono);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
}
