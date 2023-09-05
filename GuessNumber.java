import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Déterminez le juste prix: ");
        int justePrix = scanner.nextInt();
        int tentative = 0;
        System.out.println("Maintenant, veuillez tenter votre chance: ");

        while(true) {
            int proposition = scanner.nextInt();

            if (proposition < justePrix) {
                System.out.println("C'est plus !");
                tentative++;
                System.out.println("Tentative: " + tentative);
            } else if (proposition > justePrix) {
                System.out.println("C'est moins !");
                tentative++;
                System.out.println("Tentative: " + tentative);
            } else {
                System.out.println("C'est gagné !");
                tentative++;
                System.out.println("Tentative: " + tentative);
                break;
            }
        }
        
        scanner.close();
        }
    }
