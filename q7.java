import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[20];
        int[] b = new int[20];
        int[] c = new int[40];

        for (int i = 0; i < 20; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            c[2 * i] = a[i];
            c[2 * i + 1] = b[i];
        }

        for (int valor : c) {
            System.out.println(valor);
        }

        sc.close();
    }
}
