import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int menor = Math.min(x, y);
        int maior = Math.max(x, y);

        int soma = 0;

        for (int i = menor; i <= maior; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);

        scanner.close();
    }
}