import java.util.Random;

public class q8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(20) + 1;
            }
        }

        System.out.println("Matriz original:");
        imprimir(matriz);

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                matriz[i][j] = 0;
            }
        }

        System.out.println("Matriz triangular inferior:");
        imprimir(matriz);
    }

    public static void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
