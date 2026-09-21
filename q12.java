import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];

        for (int i = 0; i < valores.length; i++) {
            int numero;

            while (true) {
                numero = sc.nextInt();

                boolean repetido = false;

                for (int j = 0; j < i; j++) {
                    if (valores[j] == numero) {
                        repetido = true;
                        break;
                    }
                }

                if (!repetido) {
                    break;
                }

                System.out.println("Numero ja digitado. Digite outro numero:");
            }

            valores[i] = numero;
        }

        System.out.println("Vetor final:");
        for (int valor : valores) {
            System.out.println(valor);
        }

        sc.close();
    }
}
