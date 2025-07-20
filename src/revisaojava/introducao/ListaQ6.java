package revisaojava.introducao;
import java.util.Scanner;

public class ListaQ6 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double num = scanner.nextDouble();
        double reajuste = num * 0.05;
        double novoValor = num + reajuste;
        System.out.println("Novo valor reajustado em 5%: " + novoValor);
        scanner.close();
    }
}
