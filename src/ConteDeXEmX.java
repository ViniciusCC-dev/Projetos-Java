//estutura de repetição while
import java.util.Scanner;
public class ConteDeXEmX {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int valor;
        int contador = 0;
        int qnt;
        System.out.println("Quer contar até quanto? ");
        valor = sc.nextInt();
        System.out.println("De quanto em quanto você quer contar? ");
        qnt = sc.nextInt();
        if (qnt == 0) {
            System.out.println("ERROR: O valor 0 nao pode fazer essa função");
            System.exit(0);
        }
        while(contador <= valor) {
            System.out.println(contador);
            contador = contador + qnt;
            Thread.sleep(500);
        }
        System.out.println("Terminei de contar");
    }
}
