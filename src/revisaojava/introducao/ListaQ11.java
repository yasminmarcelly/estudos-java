package revisaojava.introducao;
import java.util.Scanner;


public class ListaQ11 {
    //11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
    //se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua Primeira Nota:");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite sua Segunda Nota:");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite sua Terceira Nota:");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite sua Quarta Nota:");
        double nota4 = scanner.nextDouble();
        double media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Agora digite seu nome:");
        String nome = scanner.next();

       if (media < 7){
           System.out.println(nome + " voce foi REPROVADO.");
       } else if(media >=7) {
           System.out.println(nome + " voce foi APROVADO.");
       }
        scanner.close();
    }
}
