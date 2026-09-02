
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int peca1 = input.nextInt();
        int qtd1 = input.nextInt();
        double valor1 = input.nextDouble();
        int peca2 = input.nextInt();
        int qtd2 = input.nextInt();
        double valor2 = input.nextDouble();
        double total = qtd1 * valor1 + qtd2 * valor2;
        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        System.out.println();
    }

}

