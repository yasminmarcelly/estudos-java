package revisaojava.introducao;
import java.util.Scanner;

public class ListaQ7 {
    //Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor booleano de x: ");
        boolean x = scanner.nextBoolean();
        System.out.println("Valor booleano de y: ");
        boolean y = scanner.nextBoolean();
        if (x&&y){
            System.out.println("Ambos os valores sao verdadeiros.");
        } else if (!x&&!y){
            System.out.println("Ambos os valores sao falsos.");
        } else {
            System.out.println("Os valores sao diferentes.");
        }

        scanner.close();
    }
}
