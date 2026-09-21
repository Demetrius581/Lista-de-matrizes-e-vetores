import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[10];

        double soma = 0;

        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextDouble();
            soma += v[i];
        }

        double media = soma / v.length;
        double somaQuadrados = 0;

        for (double valor : v) {
            somaQuadrados += Math.pow(valor - media, 2);
        }

        double desvioPadrao = Math.sqrt(somaQuadrados / v.length);

        System.out.println("Media: " + media);
        System.out.println("Desvio padrao: " + desvioPadrao);

        sc.close();
    }
}
