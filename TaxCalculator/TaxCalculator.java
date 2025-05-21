import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
    System.out.println("Введи сумму в $");
    Scanner scanner = new Scanner(System.in);
  int sum = scanner.nextInt();

    if (sum <=10000) {
        System.out.println("Налог 10%");
    }

    else if (sum >= 10001 && sum<= 50000) {
        System.out.println("Налог 20%");
    }
else {
        System.out.println("Сумма вне допустимого диапазона");
    }

    }
}
