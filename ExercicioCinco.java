import java.util.Scanner;

public class ExercicioCinco {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            double salary = sc.nextDouble();
            double sales = sc.nextDouble();
            double totalSalary = salary + (sales * 0.15);
            System.out.printf("Nome do vendedor: %s\n", name);
            System.out.printf("Salário fixo: %.2f\n", salary);
            System.out.printf("Salário no final do mês: %.2f\n", totalSalary);
        }
    }