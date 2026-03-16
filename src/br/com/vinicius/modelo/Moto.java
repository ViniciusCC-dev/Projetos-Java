package br.com.vinicius.modelo;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto (String marca, String modelo, int anoDeFabricacao,String placa, String cor, Pessoa dono, int cilindradas){
        super(marca, modelo, anoDeFabricacao,placa, cor, dono);
        this.cilindradas = cilindradas;
    }
    public Moto (String marca, String modelo, int anoDeFabricacao,String placa, String cor, int cilindradas){
        super(marca, modelo, anoDeFabricacao,placa, cor);
        this.cilindradas = cilindradas;
    }

    public double calcularSeguro(){
        return (this.cilindradas * 1.005) + (this.getAnoDeFabricacao() * 1.1);
    }

    public String getArtigo() {
        return "a"; // Especialização para feminino
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
