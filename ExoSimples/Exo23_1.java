import java.util.Scanner;

public class Exo23_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter a number: ");
        
        int chiffre = scanner.nextInt();
        numbers[0] = chiffre; 
        
        for (int i = 1; i < numbers.length; i++){
            numbers[i] = numbers[i-1]*chiffre;

        }
        scanner.close();

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
    
        }
    }
}
