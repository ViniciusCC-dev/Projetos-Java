package br.com.vinicius.modelo;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto (String marca, String modelo, int anoDeFabricacao, String cor, Pessoa dono, int cilindradas){
        super(marca, modelo, anoDeFabricacao, cor, dono);
        this.cilindradas = cilindradas;
    }
    public Moto (String marca, String modelo, int anoDeFabricacao, String cor, int cilindradas){
        super(marca, modelo, anoDeFabricacao, cor);
        this.cilindradas = cilindradas;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cilindradas: " + this.cilindradas);
        System.out.println("--------------------------------");
    }

    public int getCilindradas() {
        return cilindradas = cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        if (cilindradas > 49 && cilindradas < 2500) {
            this.cilindradas = cilindradas;
        }else{
            System.out.println("Valor de cilindradas Invalido");
        }
    }
}
