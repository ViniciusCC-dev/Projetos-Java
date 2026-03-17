package br.com.vinicius.modelo;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int anoDeFabricacao;
    private String placa;
    private String cor;
    private double valor;
    private Pessoa dono;


    public Veiculo(String marca, String modelo, int anoDeFabricacao,String placa, String cor,double valor, Pessoa dono) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAnoDeFabricacao(anoDeFabricacao);
        this.setPlaca(placa);
        this.setCor(cor);
        this.setValor(valor);
        this.setDono(dono);
    }

    public Veiculo(String marca, String modelo, int anoDeFabricacao,String placa, String cor, double valor) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAnoDeFabricacao(anoDeFabricacao);
        this.setPlaca(placa);
        this.setCor(cor);
        this.setValor(valor);
    }

    public abstract double calcularSeguro();

    public String getArtigo(){
        return "o";
    };

    public void exibirDados() {
        System.out.println("---------Dados-Do-Veiculo---------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricação: " + getAnoDeFabricacao());
        if (this.placa != null) {
            System.out.println("Placa: " + this.placa);
        }else {
            System.out.println("ERRO: Placa não cadastrada ou inválida!");
        }
        System.out.println("Cor do Veiculo: " + getCor());
        System.out.println("Valor do Veiculo: " + getValor());
        if (getDono() != null) {
            System.out.println("O dono d" + getArtigo() + " " + this.getClass().getSimpleName() + " é: ");
            getDono().exibirInfo();
        } else {
            System.out.println("Este carro ainda nao possui dono");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {

        if(dono == null){
            System.out.println("ERRO: nao é possível atribuir um dono inexistente");
        }
        this.dono = dono;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null) {
            System.out.println("ERRO: nao é possível atribuir um valor de placa invalido");
        } else if (placa.length() != 8) {
            System.out.println("ERRO: nao é possível atribuir um valor de placa invalido");
        }else {
            this.placa = placa.toUpperCase();
        }

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
