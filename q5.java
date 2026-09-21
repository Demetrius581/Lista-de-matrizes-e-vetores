import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Linha: " + i + ", Coluna: " + j);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Nao encontrado");
        }

        sc.close();
    }
}
