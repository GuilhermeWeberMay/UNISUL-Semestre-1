
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            double soma = 0;
            int notasValidas = 0;

            while (notasValidas < 2) {

                double nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    soma += nota;
                    notasValidas++;
                } else {
                    System.out.println("nota invalida");
                }
            }

            double media = soma / 2;

            System.out.printf("media = %.2f%n", media);

            System.out.println("novo calculo (1-sim 2-nao)");

            int opcao = scanner.nextInt();

            while (opcao != 1 && opcao != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = scanner.nextInt();
            }

            if (opcao == 2) {
                break;
            }
        }

        scanner.close();
    }
}
