
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        int nota = sc.nextInt();

        if (nota >= 90) {
            System.out.println("A");
        } else if (nota >= 75) {
            System.out.println("B");
        } else if (nota >= 60) {
            System.out.println("C");
        } else if (nota >= 36) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

        sc.close();
    }

}
