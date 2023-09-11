import java.util.Scanner;
import java.util.Arrays;
// Cette fois-ci on fait tout avec une seule boucle for

public class Exo28_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez choisir la taille du tableau: ");
        int tailleTab = scanner.nextInt();
        int[] tab = new int[tailleTab];

        System.out.println("Quelle est la valeur que vous cherchez ?");
        int valeurCherchee = scanner.nextInt();
        boolean trouve = false;

        for (int i = 0; i < tab.length; i++){
            tab[i] = i+1;
            if (tab[i]==valeurCherchee){
                System.out.println("Trouvé à l'index: " + i);
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Nombre pas trouvé");
        }
        System.out.println("Voici votre tableau:");
        System.out.println(Arrays.toString(tab));
        scanner.close();

    }
}
