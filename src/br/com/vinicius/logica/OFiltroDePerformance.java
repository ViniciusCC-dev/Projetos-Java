package br.com.vinicius.logica;

public class OFiltroDePerformance {
    public static void main(String[] args){
        double[] notas = {6.31, 1.80, 7.26, 2.65, 7.94, 9.91, 8.54, 6.13, 4.92, 8.01};

        double soma = 0.0;
        double maior = notas[0];
        double menor = notas[0];

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];

            if (maior < notas[i]) {
                maior = notas[i];
            }
            if (menor > notas[i]) {
                menor = notas[i];
            }
        }
        double media =  soma / notas.length;

        System.out.println("A média da turma é " + media);

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println(notas[i]);
            }
        }

        System.out.println("A maior nota da turma foi: " + maior);
        System.out.println("A menor nota da turma foi: " + menor);
    }
}
