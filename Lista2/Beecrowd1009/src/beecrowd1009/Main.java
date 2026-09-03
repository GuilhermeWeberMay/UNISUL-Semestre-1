import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();

        double bonus = vendas * 0.15;
        double total = salario + bonus;

        System.out.printf("TOTAL = R$ %.2f%n", total);
    }
}