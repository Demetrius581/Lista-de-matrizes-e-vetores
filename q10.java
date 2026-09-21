import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];

        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            y[i] = sc.nextInt();
        }

        System.out.println("Soma:");
        for (int i = 0; i < 5; i++) {
            System.out.println(x[i] + y[i]);
        }

        System.out.println("Produto:");
        for (int i = 0; i < 5; i++) {
            System.out.println(x[i] * y[i]);
        }

        System.out.println("Diferenca (elementos de x que nao estao em y):");
        for (int i = 0; i < 5; i++) {
            boolean existe = false;
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                System.out.println(x[i]);
            }
        }

        System.out.println("Intersecao:");
        for (int i = 0; i < 5; i++) {
            boolean existe = false;
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    existe = true;
                    break;
                }
            }
            if (existe) {
                System.out.println(x[i]);
            }
        }

        System.out.println("Uniao:");
        for (int i = 0; i < 5; i++) {
            System.out.println(x[i]);
        }
        for (int i = 0; i < 5; i++) {
            boolean existe = false;
            for (int j = 0; j < 5; j++) {
                if (y[i] == x[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                System.out.println(y[i]);
            }
        }

        sc.close();
    }
}
