package beecrowd1009;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total, salario, vendas;
        String nome = input.nextLine();
        salario = input.nextDouble();
        vendas = input.nextDouble();
        total = (vendas * 0.15 + salario);
        System.out.printf("TOTAL = R$ %.2f", total);
        System.out.println();
    }

}
