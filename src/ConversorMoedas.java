import  java.util.Scanner;
import  java.util.Locale;
public class ConversorMoedas {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
            System.out.println("Bem-vindo ao Conversor de Moedas!");
            double R$;
            double Dolar;
            double Cotacao;
            int Quantidade;
            int conversor;
                conversor = 1;
        System.out.println("Qual a cotação do Dólar hoje? ");
        Cotacao = sc.nextDouble();
        System.out.println("Quantos valores você deseja converter? ");
        Quantidade = sc.nextInt();
                while (conversor <= Quantidade) {
                    System.out.println("Qual o valor em R$? ");
                    R$ = sc.nextDouble();
                    Dolar = R$ / Cotacao;
                    System.out.printf("O valor convertido em U$ é: %.2f%n", Dolar);
                    conversor++;
                }
    }
}
