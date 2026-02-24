package br.com.vinicius.modelo;

public class Carro {
    public String marca;
    public String modelo;
    public int anoDeFabricacao;
    public String cor;
    public Pessoa dono;

    public void exibirDados() {
        System.out.println("---------Dados-Do-Carro---------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoDeFabricacao);
        System.out.println("Cor: " + cor);
        if (dono != null) {
            System.out.println("O dono do carro é: ");
            dono.exibirInfo();
        }else {
            System.out.println("Este carro ainda nao possui dono");
        }
    }
}
