public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i += 2) {

            int j = i + 6;

            for (int contador = 0; contador < 3; contador++) {
                System.out.println("I=" + i + " J=" + j);
                j--;
            }
        }
    }
}