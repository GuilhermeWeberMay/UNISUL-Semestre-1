import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pares = 0;

        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            }
        }

        System.out.println(pares + " valores pares");

        scanner.close();
    }
}