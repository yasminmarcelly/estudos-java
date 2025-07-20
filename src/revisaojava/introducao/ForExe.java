package revisaojava.introducao;

public class ForExe {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas parcelas ele pode ser parcelado
        //Condicao valorParcela >= 1000

        double valorCarro = 40000;
        double parcela = valorCarro;

        for (int i = 1; parcela > 1000; i++) {
            parcela = valorCarro / i;
            System.out.println( i + "x de " + parcela);
        }
    }
}
