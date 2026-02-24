package br.com.vinicius.logica;

import java.util.Scanner;

public class PositivoNegativoZero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;

        do {
            System.out.println("Digite um numero(utilize 0 para sair): ");
            valor = sc.nextInt();
            if (valor < 0) {
                System.out.println("Seu valor é negativo");
            }else if (valor > 0) {
                System.out.println("Seu valor é Positivo");
            }

        }while (valor != 0);
        System.out.println("Sistema encerrado");
        System.exit(0);
        sc.close();
    }
}
