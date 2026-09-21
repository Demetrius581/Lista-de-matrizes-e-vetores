import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] primeira = new double[2][2];
        double[][] segunda = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                primeira[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                segunda[i][j] = sc.nextDouble();
            }
        }

        int opcao;

        do {
            System.out.println("1 - Somar as duas matrizes");
            System.out.println("2 - Subtrair a primeira matriz da segunda");
            System.out.println("3 - Adicionar uma constante as duas matrizes");
            System.out.println("4 - Imprimir as matrizes");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    double[][] soma = somar(primeira, segunda);
                    imprimir(soma);
                    break;

                case 2:
                    double[][] subtracao = subtrair(primeira, segunda);
                    imprimir(subtracao);
                    break;

                case 3:
                    System.out.print("Digite a constante: ");
                    double constante = sc.nextDouble();

                    adicionarConstante(primeira, constante);
                    adicionarConstante(segunda, constante);
                    break;

                case 4:
                    System.out.println("Primeira matriz:");
                    imprimir(primeira);

                    System.out.println("Segunda matriz:");
                    imprimir(segunda);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);

        sc.close();
    }

    public static double[][] somar(double[][] a, double[][] b) {
        double[][] resultado = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }

        return resultado;
    }

    public static double[][] subtrair(double[][] a, double[][] b) {
        double[][] resultado = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = b[i][j] - a[i][j];
            }
        }

        return resultado;
    }

    public static void adicionarConstante(double[][] matriz, double constante) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] += constante;
            }
        }
    }

    public static void imprimir(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
