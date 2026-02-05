import java.util.Scanner;
import java.util.Locale;
public class CalculadoraIMC {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    System.out.println("=================================");
    System.out.println("| C A L C U L A D O R A   I M C |");
    System.out.println("=================================");
    System.out.print("Diga seu nome: ");
    String nome = sc.nextLine();
    System.out.print("Em metros, me dia sua altura "+nome+": ");
    double altura = sc.nextDouble();
    System.out.print("Em KG, me diga sua peso "+nome+": ");
    double peso = sc.nextDouble();
    double IMC;
    IMC = peso / (altura * altura);
    System.out.printf("Seu IMC é: %.2f%n",IMC);
    if (IMC < 17) {
        System.out.println("Você está muito abaixo do peso ideal, procure um médico");
    }else if (IMC <= 18.49) {
        System.out.println("Você está abaixo do peso ideal, tome cuidado!");
    }else if (IMC <= 24.99) {
        System.out.println("Seu peso esta ideal, parabens!");
    }else if (IMC <= 29.99) {
        System.out.println("Você esta acima do peso");
    }else if (IMC <= 34.99) {
        System.out.println("Você esta no estado da obesidade grau 1, muito cuidado! ");
    }else if (IMC <= 39.99) {
        System.out.println("Você esta no grau 2 da obesidade, Procure um médico");
    }else
        System.out.println("Você tem obesidade morbida, cuide-se urgentemente");
}
}
