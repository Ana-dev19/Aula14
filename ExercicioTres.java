import java.util.Scanner;

public class ExercicioTres {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite o seu peso em kg: ");
            double peso = input.nextDouble();
            System.out.print("Digite a sua altura em metros: ");
            double altura = input.nextDouble();
            double imc = peso / (altura * altura);
            System.out.printf("Seu IMC é %.2f e sua classificação é %s.", imc, getClassificacao(imc));
        }

        public static String getClassificacao(double imc) {
            if (imc < 18.5) {
                return "Magreza";
            } else if (imc < 24.9) {
                return "Normal";
            } else if (imc < 29.9) {
                return "Sobrepeso";
            } else if (imc < 39.9) {
                return "Obesidade";
            } else {
                return "Obesidade Grave";
            }
        }
    }
