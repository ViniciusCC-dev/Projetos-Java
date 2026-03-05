package br.com.vinicius.modelo;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto (String marca, String modelo, int anoDeFabricacao, String cor, Pessoa dono){
        super(marca, modelo, anoDeFabricacao, cor, dono);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas = cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
