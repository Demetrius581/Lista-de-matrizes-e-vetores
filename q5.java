import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[20];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
        }

        // Primeiro, os elementos com conteúdo ímpar.
        for (int valor : valores) {
            if (valor % 2 != 0) {
                System.out.println(valor);
            }
        }

        // Depois, os elementos que estão nas posições pares.
        // As posições do vetor são consideradas 0, 2, 4, ...
        for (int i = 0; i < valores.length; i += 2) {
            System.out.println(valores[i]);
        }

        sc.close();
    }
}
