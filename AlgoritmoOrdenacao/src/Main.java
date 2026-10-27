
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 5;
        int[] lista = new int[r];
        //int menor = Integer.MIN_VALUE;

        lista[0] = 40;
        lista[1] = 30;
        lista[2] = 20;
        lista[3] = 30;
        lista[4] = 50;

        for (int i = 0; i < r - 1; i++) {
            for (int j = i + 1; j < r; j++) {
                System.out.println(i + " - " + j);
                if (lista[i] > lista[j]) {
                    int aux = lista[j];
                    lista[j] = lista[i];
                    lista[i] = aux;
                }
            }

            for (int numero : lista) {
                System.out.println(numero);
            }

        }
    }

}
