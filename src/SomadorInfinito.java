import java.util.Scanner;

public class SomadorInfinito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        int soma = 0;
        int contador = 0;
        do {

            System.out.println("Digite um valor -(utilize 0 para encerrar): ");
            valor = sc.nextInt();
            if (valor != 0){
                soma += valor;
                contador++;
            }
        }while (valor != 0);
            if(contador > 0 ) {
                System.out.println("O valor total é de: " + soma);
                double media = (double) soma / contador;
                System.out.println("A media desse valor é: " + media);
            }else {
                System.out.println("Nenhum valor foi digitado");
            }

        sc.close();
    }
}
