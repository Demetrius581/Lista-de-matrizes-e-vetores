import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] primeiro = new int[10];
        int[] segundo = new int[10];
        int[] resultado = new int[20];

        for (int i = 0; i < 10; i++) {
            primeiro[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            segundo[i] = sc.nextInt();
        }

        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < resultado.length; i++) {
            if (i % 2 == 0) {
                resultado[i] = primeiro[p1++];
            } else {
                resultado[i] = segundo[p2++];
            }
        }

        for (int valor : resultado) {
            System.out.println(valor);
        }

        sc.close();
    }
}
