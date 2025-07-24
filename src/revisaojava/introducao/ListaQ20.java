package revisaojava.introducao;

import java.util.Scanner;

public class ListaQ20 {
    // Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero que deseja ver a tabuada: ");
        int num = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + num * i);

        }

        scanner.close();
    }
}
