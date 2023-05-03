import java.util.Scanner;

public class ExercicioSete {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite a cotação do dólar: ");
            double cotacao = input.nextDouble();

            System.out.print("Digite a quantidade de dólares: ");
            double dolares = input.nextDouble();

            double reais = dolares * cotacao;

            System.out.printf("O valor em reais é R$ %.2f", reais);

            input.close();
        }
    }
