
public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            double I = i * 0.2;
            double J = 1 + I;

            for (int j = 0; j < 3; j++) {

                if (I == 0 || I == 1 || I == 2) {
                    System.out.println("I=" + (int) I + " J=" + (int) J);
                } else {
                    System.out.printf("I=%.1f J=%.1f%n", I, J);
                }

                J++;
            }
        }
    }
}
