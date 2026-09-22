
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Insira seu salario: ");
        double salario = sc.nextDouble();
        System.out.print("Insira a sua prestacao: ");
        double prestacao = sc.nextDouble();
        double valor = salario * 0.3;
        if (prestacao > valor){
            System.out.println("Nao tem acesso a linha de credito");
        }else{
            System.out.print("Tem acesso a linha de credito");
        }
        
    }
    
}
