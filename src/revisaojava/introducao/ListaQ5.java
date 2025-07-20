package revisaojava.introducao;
import java.util.Scanner;

public class ListaQ5 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
        //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        double salario = scanner.nextDouble();
        double salarioMinimo = 1293.20;
        double salarios = salario / salarioMinimo;
        System.out.printf("Voce recebe %.0f salario(s) minimo(s).", salarios);

        scanner.close();
    }
}
