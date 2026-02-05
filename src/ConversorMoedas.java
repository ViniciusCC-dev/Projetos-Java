import  java.util.Scanner;
import  java.util.Locale;
public class ConversorMoedas {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
            System.out.println("Bem-vindo ao Conversor de Moedas!");
            double RS;
            double dolar;
            double cotacao;
            int quantidade;
            int conversor;
                conversor = 1;
        System.out.println("Qual a cotação do Dólar hoje? ");
        cotacao = sc.nextDouble();
        System.out.println("Quantos valores você deseja converter? ");
        quantidade = sc.nextInt();
        while (conversor <= quantidade) {
            System.out.println("Qual o valor em R$? ");
            RS = sc.nextDouble();
            dolar = RS / cotacao;
            System.out.printf("O valor convertido em U$ é: %.2f%n", dolar);
            conversor++;
        }
        if (quantidade == 0 || cotacao == 0) {
            System.out.println("Sistema encerrado");
            System.exit(0);
        }
    }
}
