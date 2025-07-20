package revisaojava.introducao;
import java.util.Scanner;
import java.util.Arrays;

public class ListaQ8 {
    // Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor de A: ");
        int A = scanner.nextInt();
        System.out.println("Valor de B: ");
        int B = scanner.nextInt();
        System.out.println("Valor de C: ");
        int C = scanner.nextInt();
        int[] abc = {A,B,C};
        Arrays.sort(abc);

        System.out.println("Ordem decrescente:");
        for (int i = abc.length -1; i >= 0 ; i--) {
            System.out.println(abc[i]);
        }

        scanner.close();
    }
}
