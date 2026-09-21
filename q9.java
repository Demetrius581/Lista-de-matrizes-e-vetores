import java.util.Random;

public class q9 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] cartela = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int numero;

                do {
                    numero = random.nextInt(100);
                } while (existe(cartela, i, j, numero));

                cartela[i][j] = numero;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", cartela[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean existe(int[][] matriz, int linhasUsadas, int colunasUsadas, int numero) {
        for (int i = 0; i < linhasUsadas; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == numero) {
                    return true;
                }
            }
        }

        for (int j = 0; j < colunasUsadas; j++) {
            if (matriz[linhasUsadas][j] == numero) {
                return true;
            }
        }

        return false;
    }
}
