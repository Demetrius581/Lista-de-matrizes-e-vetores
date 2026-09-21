import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] alunos = new int[5][4];

        for (int i = 0; i < 5; i++) {
            alunos[i][0] = sc.nextInt(); // matricula
            alunos[i][1] = sc.nextInt(); // media das provas
            alunos[i][2] = sc.nextInt(); // media dos trabalhos

            alunos[i][3] = alunos[i][1] + alunos[i][2];
        }

        int maiorNota = alunos[0][3];
        int matriculaMaior = alunos[0][0];
        double somaNotas = 0;

        for (int i = 0; i < 5; i++) {
            if (alunos[i][3] > maiorNota) {
                maiorNota = alunos[i][3];
                matriculaMaior = alunos[i][0];
            }

            somaNotas += alunos[i][3];
        }

        double mediaFinal = somaNotas / 5;

        System.out.println("Matricula da maior nota final: " + matriculaMaior);
        System.out.println("Media das notas finais: " + mediaFinal);

        sc.close();
    }
}
