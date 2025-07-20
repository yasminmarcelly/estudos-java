package revisaojava.introducao;

import java.util.Scanner;

public class ListaQ1 {
    public static void main(String[] args) {
    /*
    Faça um algoritmo que leia os valores de A, B, C e em seguida
    imprima na tela a soma entre A e B e mostre se a soma é menor que C.
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor de A: ");
        double A = scanner.nextDouble();
        System.out.println("Valor de B: ");
        double B = scanner.nextDouble();
        System.out.println("Valor de C: ");
        double C = scanner.nextDouble();
        System.out.println(A + B);

        if (A + B < C) {
            System.out.println("A soma é menor que C.");
        }
        scanner.close();
    }
}
