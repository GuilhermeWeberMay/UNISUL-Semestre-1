
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double triangulo = a * c / 2;
        double circulo = pi * (c * c);
        double trapezio = (a + b) * c / 2;
        double quadrado = b * b;
        double retangulo = a * b;
        System.out.printf("TRIANGULO: %.3f", triangulo);
        System.out.println();
        System.out.printf("CIRCULO: %.3f", circulo);
        System.out.println();
        System.out.printf("TRAPEZIO: %.3f", trapezio);
        System.out.println();
        System.out.printf("QUADRADO: %.3f", quadrado);
        System.out.println();
        System.out.printf("RETANGULO: %.3f", retangulo);
        System.out.println();
    }

}
