
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int T = sc.nextInt();
        int F = sc.nextInt();

        int horarioFinal = S + T + F;

        if (horarioFinal >= 24) {
            horarioFinal -= 24;
        }

        if (horarioFinal < 0) {
            horarioFinal += 24;
        }

        System.out.println(horarioFinal);

        sc.close();
    }

}
