public class PrintEvenElements {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 5, 3, 6, 4, 7, 65};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}




