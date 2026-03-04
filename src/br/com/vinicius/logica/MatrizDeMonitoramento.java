package br.com.vinicius.logica;

public class MatrizDeMonitoramento {
    public static void main(String[] args) {
        int[][] agenda = {{1,1,1,0,1},{1,1,0,1,0},{1,1,0,0,1}};
        for (int i = 0; i < agenda.length; i++) {
            int diasPresentes = 0;
            for (int j = 0; j < agenda[i].length; j++) {
                if (agenda[i][j] == 1){
                    diasPresentes++;
                    System.out.print("Presente ");
                }else{
                    System.out.print("Faltou ");
                }
            }
            System.out.println("| A quantidade de dias presentes do aluno foi: "+diasPresentes);
        }

    }
}
