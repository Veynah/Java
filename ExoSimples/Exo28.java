import java.util.Scanner;
import java.util.Arrays;

public class Exo28 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez choisir la taille du tableau :");
        int tailleTab = scanner.nextInt();
        int[] tab = new int[tailleTab];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i+1;
        }
        System.out.println("Voici votre tableau: ");
        System.out.println(Arrays.toString(tab));

        System.out.println("Quelle est la valeur que vous cherchez ?");
        int valeurCherchee = scanner.nextInt();
        boolean trouve = false;

        for (int i = 0; i < tab.length; i++){
            if (tab[i] == valeurCherchee){
                System.out.println("Trouve à l'index: " + i);
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            System.out.println("Nombre pas trouvé");
        }

        scanner.close();

    }
}
