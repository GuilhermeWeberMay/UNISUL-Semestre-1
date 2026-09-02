
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distancia = Math.hypot(x1 - x2, y1 - y2);
        System.out.printf("%.4f",distancia);
        System.out.println();
    }
    
}
