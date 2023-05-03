import java.util.Scanner;

public class ExercicioOito {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite o preço de custo do produto: ");
            double precoDeCusto = input.nextDouble();

            System.out.print("Digite o percentual de acréscimo: ");
            double percentualDeAcrescimo = input.nextDouble();

            double valorDoAcrescimo = precoDeCusto * percentualDeAcrescimo / 100;
            double precoDeVenda = precoDeCusto + valorDoAcrescimo;

            System.out.printf("O preço de venda é R$%.2f", precoDeVenda);
        }
    }
