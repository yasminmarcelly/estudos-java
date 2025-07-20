package revisaojava.introducao;

import java.util.Scanner;

public class ListaQ4 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();
        System.out.println("Numero: " + num);
        int antes;
        int depois;
        if (num >= 0) {
            antes = num - 1;
            depois = num + 1;
            System.out.println("Antecessor = " + antes);
            System.out.println("Sucessor = " + depois);
        } else {
            depois = num - 1;
            antes = num + 1;
            System.out.println("Antecessor = " + antes);
            System.out.println("Sucessor = " + depois);
        }

        scanner.close();
    }
}
