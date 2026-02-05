import java.util.Scanner;
import java.util.Locale;

public class MelhorAluno_corrigir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("------------------------------");
        System.out.println("  Escola Santa Belorizontina  ");
        System.out.println("------------------------------");
        System.out.print(" Quantos alunos tem na turma? ");
        int total = sc.nextInt();
        int cont = 1;
        double maiorNota = 0;
        String melhorAluno = "";
        System.out.println("---------------------");
        while (cont <= total) {
            System.out.println("Aluno " + cont);
            System.out.print("Nome do aluno: ");
            String aluno = sc.nextLine();
            System.out.print("Nota de " + aluno + ": ");
            double nota = sc.nextDouble();
            System.out.println("---------------------");
            cont++;
            if (nota > maiorNota) {
                maiorNota = nota;
                melhorAluno = aluno;
            }
        }
        System.out.println("O melhor desempenho foi de " + melhorAluno + " com a nota " + maiorNota);

    }
}
