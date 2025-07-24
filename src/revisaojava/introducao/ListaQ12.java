package revisaojava.introducao;

import java.util.Scanner;

public class ListaQ12 {
    //Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
    //pelo comprador e imprima na tela o valor final do produto a ser pago.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        System.out.println("Valor: $ " + valor);
        System.out.println("Selecione sua opção de pagamento");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes, preço normal do produto mais juros de 10%");
        int option = scanner.nextInt();
        double valorFinal;

        if (option==1){
            valorFinal = valor * 0.85;
            System.out.println("Total: $ " + valorFinal);
        } else if (option==2) {
            valorFinal = valor * 0.90;
            System.out.println("Total: $" + valorFinal);
        } else if (option==3) {
            valorFinal = valor/2;
            System.out.println("Total: 2x de $"+valorFinal);
        } else if (option==4){
            valorFinal = (valor*1.10)/3;
            System.out.println("Total: 3x de $" +valorFinal);
        }

        scanner.close();
    }
}
