package revisaojava.introducao;

import java.util.Scanner;

public class ListaQ3 {
    public static void main(String[] args) {
        /*
      Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
      caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma
      variável C e imprimir seu valor na tela.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double A = scanner.nextDouble();
        System.out.println("Digite o valor de B: ");
        double B = scanner.nextDouble();
        double C;
        if (A == B) {
            C = A + B;
            System.out.println(C);
        } else if (A != B) {
            C = A * B;
            System.out.println(C);
        }

        scanner.close();
    }
}
