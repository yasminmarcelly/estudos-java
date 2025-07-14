package revisaojava.introducao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = 70000;
        double imposto;

        if(salario <=34712){
            imposto = salario * 0.097;
        } else if (salario >= 34713 && salario <=68507) {
            imposto = salario * 0.3735;
        } else {
            imposto = salario * 0.495;
        }
        System.out.println(imposto);
    }
}
