
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double consumo = x / y;
        System.out.printf("%.3f",consumo);
        System.out.print(" km/l");
        System.out.println();
    }

}
