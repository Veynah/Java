import java.util.Arrays;
import java.util.Scanner;

public class Exo22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Please enter number");
            numbers[i] = scanner.nextInt();

        }
        scanner.close();
        System.out.println(Arrays.toString(numbers));
    }
}
