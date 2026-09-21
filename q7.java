import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int acima = 0;
        int abaixo = 0;
        int principal = 0;
        int secundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < j) {
                    acima += matriz[i][j];
                }

                if (i > j) {
                    abaixo += matriz[i][j];
                }

                if (i == j) {
                    principal += matriz[i][j];
                }

                if (i + j == 2) {
                    secundaria += matriz[i][j];
                }
            }
        }

        System.out.println("Acima da diagonal principal: " + acima);
        System.out.println("Abaixo da diagonal principal: " + abaixo);
        System.out.println("Diagonal principal: " + principal);
        System.out.println("Diagonal secundaria: " + secundaria);

        sc.close();
    }
}
