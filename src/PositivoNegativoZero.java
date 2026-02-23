import java.util.Scanner;

public class PositivoNegativoZero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int valor = sc.nextInt();

        if (valor == 0){
            System.out.println("seu valor é 0");
        } else if (valor > 0) {
            System.out.println("Seu valor é positivo");
        }else{
            System.out.println("Seu valor é negativo");
        }
    sc.close();
    }
}
