import java.util.Scanner;

public class CalculatriceBasique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuerCalcul = true;

        do {
            System.out.println("Bienvenue dans la calculatrice basique !");
            System.out.println("Veuillez saisir le premier nombre:");
            double premierNombre = scanner.nextDouble();

            System.out.println("Veuillez saisir un opérateur (+, -, *, /):");
            String operateur = scanner.next();

            System.out.println("Veuillez saisir le deuxième nombre:");
            double deuxiemeNombre = scanner.nextDouble();

            double resultat = 0;

            if (operateur.equals("/") && deuxiemeNombre == 0) {
                System.out.println("Erreur: Division par zéro n'est pas permis.");
            } else {
                if (operateur.equals("+")) {
                    resultat = premierNombre + deuxiemeNombre;
                } else if (operateur.equals("-")) {
                    resultat = premierNombre - deuxiemeNombre;
                } else if (operateur.equals("*")) {
                    resultat = premierNombre * deuxiemeNombre;
                } else if (operateur.equals("/")) {
                    resultat = premierNombre / deuxiemeNombre;
                }
                System.out.println("Le résultat est: " + resultat);
            }

            System.out.println("Voulez-vous faire un autre calcul ? (Oui/Non)");
            scanner.nextLine();
            String reponse = scanner.nextLine();

            continuerCalcul = reponse.equalsIgnoreCase("Oui");

        } while (continuerCalcul);

        scanner.close();
    }
}
