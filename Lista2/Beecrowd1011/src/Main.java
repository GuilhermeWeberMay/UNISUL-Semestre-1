
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        double raio = input.nextDouble();
        double volume = 4 * pi * (raio*raio*raio) / 3;
        System.out.printf("VOLUME = %.3f", volume);
        System.out.println();
    }

}
