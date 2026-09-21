import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        int maior = Integer.MIN_VALUE;
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Linha: " + linhaMaior);
        System.out.println("Coluna: " + colunaMaior);

        sc.close();
    }
}
