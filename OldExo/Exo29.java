import java.util.Scanner;
import java.util.Arrays;

public class Exo29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] tab = {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*'};
        int positionPion = 4;
        tab[positionPion] = 'P';

        boolean gameRunning = false;

        System.out.println("Voulez vous commencer le jeu ? start/stop");
        String input = scanner.nextLine();

        if("start".equalsIgnoreCase(input)){
            gameRunning = true;

        } else if ("stop".equalsIgnoreCase(input)){
            System.out.println("Au revoir");
            scanner.close();
            return;
        }
        while(gameRunning) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println(Arrays.toString(tab));
            System.out.println("\n\nDeplacez le pion à droite avec 'd', a gauche avec 'q'\nOu arretez le jeu avec 'stop' ");

            input = scanner.nextLine();

            if ("stop".equalsIgnoreCase(input)) {
                System.out.println("Au revoir");
                gameRunning = false;
            } else if ("d".equalsIgnoreCase(input)) {
                if (positionPion < tab.length - 1) {
                    tab[positionPion] = '*';
                    positionPion++;
                    tab[positionPion] = 'P';
                }
            
            } else if ("q".equalsIgnoreCase(input)) {
                if (positionPion > 0) {
                    tab[positionPion] = '*';
                    positionPion--;
                    tab[positionPion] = 'P';
                }
            } else {
                System.out.println("Commande non reconnue");
            }

        }
        scanner.close();
    }
}
