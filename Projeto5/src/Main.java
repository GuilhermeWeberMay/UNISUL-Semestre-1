
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();
        if (numero > 10){
            System.err.println(numero / 2);
        }else{
            System.err.println(numero * 2);
        }
    }
    
}
