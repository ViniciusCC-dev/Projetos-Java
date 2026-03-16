package br.com.vinicius.modelo;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int anoDeFabricacao;
    private String cor;
    private Pessoa dono;

    public Veiculo(String marca, String modelo, int anoDeFabricacao, String cor, Pessoa dono) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAnoDeFabricacao(anoDeFabricacao);
        this.setCor(cor);
        this.setDono(dono);
    }

    public Veiculo(String marca, String modelo, int anoDeFabricacao, String cor) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAnoDeFabricacao(anoDeFabricacao);
        this.setCor(cor);
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
        System.out.println("Cor do Veiculo: " + getCor());
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
}
