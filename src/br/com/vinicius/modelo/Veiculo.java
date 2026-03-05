package br.com.vinicius.modelo;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int anoDeFabricacao;
    protected String cor;
    protected Pessoa dono;

    public Veiculo(String marca, String modelo, int anoDeFabricacao, String cor, Pessoa dono) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.cor = cor;
        this.dono = dono;
    }
    public Veiculo(String marca, String modelo, int anoDeFabricacao, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.cor = cor;
    }

}
