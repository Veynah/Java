import java.util.Scanner;

public class Exo23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}