import java.util.Scanner;
import java.util.Random;

public class PPC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choix = {"pierre", "papier", "ciseaux"};
        System.out.println("Bienvenue dans le jeu de la mort");

        while(true){
            System.out.println("Veuillez choisir entre (pierre, papier, ciseaux) ou tapez 'quit' pour quitter le jeu");
            String utilisateur = scanner.nextLine().toLowerCase();

            if (utilisateur.equals("quit")) {
                System.out.println("Merci, aurevoir");
                break;
            }

            int indexOrdinateur = random.nextInt(3);
            String ordinateur = choix[indexOrdinateur];

            System.out.println("L'ordinateur a choisi: " + ordinateur);
            
            if (utilisateur.equals(ordinateur)) {
                System.out.println("Égalité!");
            } else if (
                (utilisateur.equals("pierre") && ordinateur.equals("ciseaux")) ||
                (utilisateur.equals("papier") && ordinateur.equals("pierre")) ||
                (utilisateur.equals("ciseaux") && ordinateur.equals("papier"))
            ) {
                System.out.println("Vous avez gagné!");
            } else {
                System.out.println("Vous avez perdu!");
            }
        }
        scanner.close();
    }
}