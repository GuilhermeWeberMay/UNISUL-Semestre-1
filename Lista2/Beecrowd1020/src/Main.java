
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        double anos = idade / 365.0;
        double meses=  (anos % 1) * 365 / 30;
        double dias =  (meses % 1) * 30;
        System.out.printf("%.0f",anos);
        System.out.println(" ano(s)");
        System.out.printf("%.0f",meses);
        System.out.println(" mes(es)");
        System.out.printf("%.0f",dias);
        System.out.println(" dia(s)");
    }
    
}
