import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A lista informa 200 lugares, mas especifica uma matriz de 10 x 10,
        // que possui 100 posições. A implementação segue a matriz 10 x 10.
        int[][] poltronas = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                poltronas[i][j] = -1;
            }
        }

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int fila = sc.nextInt();
            int poltrona = sc.nextInt();

            // Entrada considera fila e poltrona numeradas a partir de 1.
            fila--;
            poltrona--;

            if (poltronas[fila][poltrona] == -1) {
                poltronas[fila][poltrona] = 1;
            } else {
                System.out.println("Poltrona ja foi vendida");
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(poltronas[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
