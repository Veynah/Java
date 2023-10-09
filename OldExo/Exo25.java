import java.util.Arrays;
import java.util.Scanner;

public class Exo25 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez la taille du tableau: ");
        int tailleTab = scanner.nextInt();
        char[] tab = new char[tailleTab];
        char[] tabReverse = new char[tailleTab];

        for (int i = 0; i < tab.length; i++){
            System.out.println("Inserez un charactere: ");
            tab[i] = scanner.next().charAt(0);
        }
        scanner.close();
        System.out.println(Arrays.toString(tab));

        for (int i = 0; i < tab.length; i++){
            tabReverse[i] = tab[tab.length - 1 - i];
        }
        System.out.println(Arrays.toString(tabReverse));
    }
}
