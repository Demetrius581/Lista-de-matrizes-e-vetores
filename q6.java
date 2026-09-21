import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[20];
        int[] idades = new int[20];

        int soma = 0;

        for (int i = 0; i < 20; i++) {
            nomes[i] = sc.nextLine();
            idades[i] = sc.nextInt();
            sc.nextLine();
            soma += idades[i];
        }

        double media = (double) soma / 20;
        System.out.println("Idade media: " + media);

        for (int i = 0; i < 20; i++) {
            if (idades[i] > media) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
