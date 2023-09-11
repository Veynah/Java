import java.util.Arrays;
import java.util.Scanner;

public class Exo27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[10];
        int minValue;

        for (int i = 0; i < tab.length; i++){
            System.out.print("Veuillez introduire le " + (i+1) + "eme nombre:\n");
            tab[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Votre tableau est le");
        System.out.println(Arrays.toString(tab));

        // Trouver la valeur minimale
        minValue = tab[0];
        for (int i = 1; i < tab.length; i++){
            if (tab[i] < minValue){
                minValue = tab[i];
            }
        }
        System.out.println("La valeur minimale de votre tableau est: " + minValue);


    }
}
