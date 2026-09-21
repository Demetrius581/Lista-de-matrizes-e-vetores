import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[6];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
        }

        for (int valor : valores) {
            System.out.println(valor);
        }

        sc.close();
    }
}
