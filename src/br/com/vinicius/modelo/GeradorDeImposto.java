package br.com.vinicius.modelo;

public class GeradorDeImposto {

    private double totalDosImpostos;

    public void registrar(Tributavel t){
        System.out.println("Processando: " + t.getDescricao());
        double imposto = t.calcularImposto();
        this.totalDosImpostos += imposto;
        System.out.printf("Imposto devido: R$%.2f%n" , imposto);
        System.out.println("-----------------------------");
    }

    public double getTotalDosImpostos() {
        return this.totalDosImpostos;
    }

    public void setTotalDosImpostos(double totalDosImpostos) {
        this.totalDosImpostos = totalDosImpostos;
    }
}
