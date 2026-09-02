
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroFuncionario, horas;
        double salario, valorHora;
        numeroFuncionario = input.nextInt();
        horas = input.nextInt();
        valorHora = input.nextDouble();
        salario = (horas * valorHora);
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f",salario);
        System.out.println();
    }

}
