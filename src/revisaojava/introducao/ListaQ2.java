package revisaojava.introducao;

import java.util.Scanner;

public class ListaQ2 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double num = scanner.nextDouble();
        if (num >= 0) {
            if (num % 2 == 0) {
                System.out.println("Este numero é par e positivo.");
            } else {
                System.out.println("Este numero é impar e positivo.");
            }
        } else {
            if (num % 2 != 0) {
                System.out.println("Este numero é impar e negativo.");
            } else {
                System.out.println("Este numero é par e negativo.");
            }
        }
        scanner.close();
    }
}
