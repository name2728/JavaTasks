import java.util.Scanner;

public class AgeCalculator {
        public static void main(String[] args) {

            System.out.println("Введити возраст");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();

            if (age < 10) {
                System.out.println("ребенок");
            } else if (age >= 10 && age < 18) {
                System.out.println("подросток");
            } else if (age >= 18 && age <= 60) {
                System.out.println("взрослый");
            } else {
                System.out.println("пенсионер");
            }

        }
}
