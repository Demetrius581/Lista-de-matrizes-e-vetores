import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int linha = 0; linha < n; linha++) {
            long valor = 1;

            for (int coluna = 0; coluna <= linha; coluna++) {
                System.out.print(valor + " ");

                valor = valor * (linha - coluna) / (coluna + 1);
            }

            System.out.println();
        }

        sc.close();
    }
}
