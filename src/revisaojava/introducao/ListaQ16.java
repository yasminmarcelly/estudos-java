package revisaojava.introducao;

import java.util.Scanner;

public class ListaQ16 {
    //Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
    //equilátero, isósceles ou escaleno.
    //equilátero=3 lados iguais, isósceles=2 lados iguais, escaleno=3 lados diferentess
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeiro valor: ");
        int lado1 = scanner.nextInt();
        System.out.println("Segundo valor: ");
        int lado2 = scanner.nextInt();
        System.out.println("Terceiro valor:");
        int lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("É um triângulo equilátero.");
        } else if (lado1 == lado2 || lado3 == lado1 || lado2 == lado3) {
            System.out.println("É um triângulo isósceles.");
        } else {
            System.out.println("É um triângulo escaleno.");
        }
        scanner.close();
    }
}
