import java.util.Scanner;
public class ExercicioSeis {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = input.nextDouble();

            double fahrenheit = (9 * celsius + 160) / 5;

            System.out.printf("%.2f graus Celsius é igual a %.2f graus Fahrenheit.", celsius, fahrenheit);

            input.close();
        }
    }