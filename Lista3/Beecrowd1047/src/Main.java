
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int inicio = horaInicial * 60 + minutoInicial;
        int fim = horaFinal * 60 + minutoFinal;

        int duracao;

        if (fim > inicio) {
            duracao = fim - inicio;
        } else {
            duracao = (24 * 60) - inicio + fim;
        }

        int horas = duracao / 60;
        int minutos = duracao % 60;

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

        sc.close();
    }
    
}
