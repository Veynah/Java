import java.util.Scanner;
import java.util.Random;

public class Exo31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean trouve = false;
        System.out.println("Veuillez choisir la taille de votre tableau: ");

        int tailleTab = scanner.nextInt();
        int[] tab = new int[tailleTab];

        for (int i = 0; i < tab.length; i++){
            tab[i] = rand.nextInt(50) + 1;
        }
        while(!trouve){
            System.out.println("Cherchez un nombre parmis votre tableau de " + tailleTab);
            int recherche = scanner.nextInt();
            for (int i = 0; i < tab.length; i++){
                if (tab[i] == recherche) {
                    System.out.println("Bravo vous avez trouvé " + recherche + " se trouvant en " + i);
                    trouve = true;
                    break;
                } 
            }
        }
        if (trouve){
            System.out.println("Au revoir");

        }
        scanner.close();

    }
}
