/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Projeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d, soma, contador = 1;
        System.out.println("Digite "+contador+":");
        contador++;
        a = sc.nextInt();
        System.out.println("Digite "+contador+":");
        contador++;
        b = sc.nextInt();
        System.out.println("Digite "+contador+":");
        contador++;
        c = sc.nextInt();
        System.out.println("Digite "+contador+":");
        contador++;
        d = sc.nextInt();
        soma = a+b+c+d;
        System.out.println("Soma:"+soma);
        
    }
    
}
