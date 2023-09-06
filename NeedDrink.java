import java.util.Scanner;

public class NeedDrink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] stock = {5, 7, 3};  // Stock pour Coca, Eau, et Jus
        String[] noms = {"Coca", "Eau", "Jus"};
        
        boolean soif = true; // Booléen pour vérifier si l'utilisateur veut continuer à boire

        do {
            System.out.println("Bienvenue au distributeur de boissons!");
            System.out.println("1. Coca");
            System.out.println("2. Eau");
            System.out.println("3. Jus");
            System.out.println("Choisissez une boisson en entrant le numéro correspondant:");

            int choixUtilisateur = scanner.nextInt() - 1;  // -1 pour convertir en index de tableau

            if (stock[choixUtilisateur] == 0) {
                System.out.println("Désolé, cette boisson est en rupture de stock.");
            } else {
                stock[choixUtilisateur]--;
                System.out.println("Voici votre " + noms[choixUtilisateur]);
            }

            System.out.println("Voulez-vous acheter une autre boisson ? (Oui/Non)");
            scanner.nextLine();  // Consomme la nouvelle ligne
            String continuer = scanner.nextLine();
            
            // Met à jour le booléen 'soif' en fonction de la réponse de l'utilisateur
            soif = continuer.equalsIgnoreCase("Oui");

        } while (soif);

        scanner.close();
    }
}
