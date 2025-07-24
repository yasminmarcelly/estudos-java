package revisaojava.introducao;

import java.util.Scanner;

public class ListaQ15 {
    //Faça um algoritmo que leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
    //considere o ano com 365 dias e o mês com 30 dias.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade em dias: ");
        int age = scanner.nextInt();
        int year = age / 365;
        int month = (age % 365) / 30;
        int days = (age % 365) % 30;
        System.out.printf("Voce tem %d ano(s), %d mes(es) e %d dia(s) de vida.", year, month, days);

        scanner.close();
    }
}
