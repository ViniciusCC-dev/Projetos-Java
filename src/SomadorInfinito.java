import java.util.Scanner;

public class SomadorInfinito {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        int soma = 0;
        int contador = 0;
        int media;
        do {
            System.out.println("Digite um valor -(utilize 0 para encerrar): ");
            valor = sc.nextInt();
            soma += valor;
            contador++;
        }while (valor != 0);{
            System.out.print("O valor total é de: ");
            System.out.println(soma);
            media = soma / contador;
            System.out.println("A media desse valor é: " + media);
        }

        sc.close();
    }
}
