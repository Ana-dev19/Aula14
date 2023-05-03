import java.util.Scanner;

public class ExercicioUm {
       public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int num = input.nextInt();
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println("A soma de todos os números no intervalo de 1 até " + num + " é " + sum);
        }
    }

