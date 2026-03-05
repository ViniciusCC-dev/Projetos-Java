    package br.com.vinicius.modelo;

    public class Carro extends Veiculo{
        private int numeroDePortas;

    public Carro(String marca, String modelo, int anoDeFabricacao, String cor, Pessoa dono) {
        super(marca, modelo, anoDeFabricacao, cor, dono);
        this.numeroDePortas = numeroDePortas;
    }
    public Carro(String marca, String modelo, int anoDeFabricacao, String cor) {
        super(marca, modelo, anoDeFabricacao, cor);
        this.numeroDePortas = numeroDePortas;
    }


    public void exibirDados() {
        System.out.println("---------Dados-Do-Carro---------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricação: " + getAnoDeFabricacao());
        System.out.println("Cor: " + getCor());
        if (getDono() != null) {
            System.out.println("O dono do carro é: ");
            getDono().exibirInfo();
        }else {
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
            if (anoDeFabricacao > 1886 && anoDeFabricacao < 2026) {
                this.anoDeFabricacao = anoDeFabricacao;
            }else {
                System.out.println("ERRO: Data do veiculo invalida");
            }
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
            this.dono = dono;
        }

        public int getNumeroDePortas() {
            return numeroDePortas;
        }

        public void setNumeroDePortas(int numeroDePortas) {
            this.numeroDePortas = numeroDePortas;
        }
    }
