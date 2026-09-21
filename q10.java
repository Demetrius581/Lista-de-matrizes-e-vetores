import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] vetor = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int coluna = 0; coluna < 3; coluna++) {
            for (int linha = 0; linha < 3; linha++) {
                vetor[coluna] += matriz[linha][coluna];
            }
        }

        for (int valor : vetor) {
            System.out.println(valor);
        }

        sc.close();
    }
}
