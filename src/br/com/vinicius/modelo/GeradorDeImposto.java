package br.com.vinicius.modelo;

public class GeradorDeImposto {
    private double totalDosImpostos;
    public void registrar(Tributavel t){
        double valor = t.calcularImposto();
        this.setTotalDosImpostos(this.getTotalDosImpostos() + valor);
        System.out.printf("Imposto registrado! Valor: R$%.2f%n" , valor);
    }

    public double getTotalDosImpostos() {
        return this.totalDosImpostos;
    }

    public void setTotalDosImpostos(double totalDosImpostos) {
        this.totalDosImpostos = totalDosImpostos;
    }
}
