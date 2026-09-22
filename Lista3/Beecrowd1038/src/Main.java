import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int qtd = sc.nextInt();

        double[] preco = {0, 4.00, 4.50, 5.00, 2.00, 1.50};
        double total = preco[codigo] * qtd;

        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}