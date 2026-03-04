package br.com.vinicius.logica;

public class TransposicaoDeDados {
    static void main() {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                B[j][i] = A[i][j];
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz Transposta: ");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }
}



