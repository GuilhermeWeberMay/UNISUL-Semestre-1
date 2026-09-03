
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo = sc.nextInt();
        int segundos = tempo % 60;
        int minutos= (tempo % 3600) / 60;
        int horas = tempo / 3600;
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }

}
