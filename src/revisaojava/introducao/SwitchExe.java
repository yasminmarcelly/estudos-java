package revisaojava.introducao;

public class SwitchExe {
    public static void main(String[] args) {
        //Utilizando switch e dados os valores de 1 a 7, imprima se é dia util ou final de semana
        // Considerando 1 como domingo

        byte dia = 5;
        switch (dia){
            case 1,7 -> System.out.println("Fim de semana");
            case 2,3,4,5,6 -> System.out.println("Dia Util");
            default -> System.out.println("Opcao Invalida");

        }
    }
}
