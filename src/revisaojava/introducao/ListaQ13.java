package revisaojava.introducao;
import java.util.Scanner;

public class ListaQ13 {
    //FAça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Digite sua idade:");
        int age = scanner.nextInt();
        if (age < 17){
            System.out.println("Voce é menor de idade.");
        } else {
            System.out.println("Voce é maior de idade.");
        }
        scanner.close();
    }
}
