import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int dentro = 0;
        int fora = 0;

        for (int i = 0; i < n; i++) {
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println(dentro + " in");
        System.out.println(fora + " out");

        scanner.close();
    }
}