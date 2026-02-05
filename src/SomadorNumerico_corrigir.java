//estutura de repetição while

import java.util.Scanner;

public class SomadorNumerico_corrigir {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
         int s = 0;
         String resp = "S";
         int maior = Integer.MIN_VALUE;
         int menor = Integer.MAX_VALUE;
         while (Boolean.parseBoolean(resp =("S"))) {
             System.out.println("Digite o "+ "o. valor: ");
                int N = sc.nextInt();
                if (N > maior){
                    maior = N;
                }
                if (N < menor){
                    menor = N;
                }
                s = s + N;
                System.out.println(resp);
                sc.nextLine();
         }
        System.out.println("A soma de todos os valores foi: " +s);
        System.out.println("O maior valor digitado foi: " +maior);
        System.out.println("O menor valor digitado foi: " +menor);

    }
}
