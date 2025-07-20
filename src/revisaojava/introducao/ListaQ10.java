package revisaojava.introducao;

import java.util.Scanner;

public class ListaQ10 {
    //Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua Primeira Nota:");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite sua Segunda Nota:");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite sua Terceira Nota:");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Sua media é: %.2f" , media);

        scanner.close();

    }
}
