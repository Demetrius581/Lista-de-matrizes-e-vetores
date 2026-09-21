import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        char[][] presencas = new char[n][30];

        for (int i = 0; i < n; i++) {
            nomes[i] = sc.nextLine();

            for (int dia = 0; dia < 30; dia++) {
                presencas[i][dia] = sc.nextLine().charAt(0);
            }
        }

        for (int i = 0; i < n; i++) {
            int faltas = 0;

            for (int dia = 0; dia < 30; dia++) {
                if (presencas[i][dia] == 'F') {
                    faltas++;
                }
            }

            if (faltas > 10) {
                System.out.print(nomes[i] + " - dias: ");

                for (int dia = 0; dia < 30; dia++) {
                    if (presencas[i][dia] == 'F') {
                        System.out.print((dia + 1) + " ");
                    }
                }

                System.out.println();
            }
        }

        sc.close();
    }
}
