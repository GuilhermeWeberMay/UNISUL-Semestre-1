
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        double litros = velocidade * tempo / 12.0;
        System.out.printf("%.3f",litros);
        System.out.println();
    }

}
