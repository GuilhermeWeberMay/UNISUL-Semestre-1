
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diaInicial = sc.nextInt();
        int horaInicial = sc.nextInt();
        sc.next();
        int minutoInicial = sc.nextInt();
        sc.next();
        int segundoInicial = sc.nextInt();

        int diaFinal = sc.nextInt();
        int horaFinal = sc.nextInt();
        sc.next();
        int minutoFinal = sc.nextInt();
        sc.next();
        int segundoFinal = sc.nextInt();

        int inicio = diaInicial * 24 * 60 * 60
                + horaInicial * 60 * 60
                + minutoInicial * 60
                + segundoInicial;

        int fim = diaFinal * 24 * 60 * 60
                + horaFinal * 60 * 60
                + minutoFinal * 60
                + segundoFinal;

        int duracao = fim - inicio;

        int dias = duracao / (24 * 60 * 60);
        duracao = duracao % (24 * 60 * 60);

        int horas = duracao / (60 * 60);
        duracao = duracao % (60 * 60);

        int minutos = duracao / 60;
        int segundos = duracao % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        sc.close();
    }

}
