    package br.com.vinicius.modelo;

    public class Carro extends Veiculo{
        private int numeroDePortas;

    public Carro(String marca, String modelo, int anoDeFabricacao, String cor, Pessoa dono, int numeroDePortas) {
        super(marca, modelo, anoDeFabricacao, cor, dono);
        this.numeroDePortas = numeroDePortas;
    }
    public Carro(String marca, String modelo, int anoDeFabricacao, String cor, int i) {
        super(marca, modelo, anoDeFabricacao, cor);
        this.numeroDePortas = numeroDePortas;
    }

        public double calcularSeguro(){
            return this.getAnoDeFabricacao() * 1.5;
        }



        public void exibirDados() {
            super.exibirDados(); // Faz o que o veículo já faz (Marca, Modelo...)
            System.out.println("Numero de portas: " + this.numeroDePortas);
            System.out.println("--------------------------------");
        }

        public int getNumeroDePortas() {
            return numeroDePortas;
        }

        public void setNumeroDePortas(int numeroDePortas) {
            if (numeroDePortas > 0 &&  numeroDePortas <= 8) {
                this.numeroDePortas = numeroDePortas;
            }else {
                System.out.println("O numero de portas do seu carro é invalido");
                this.numeroDePortas = 0;
            }
        }
    }
