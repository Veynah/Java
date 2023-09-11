import java.util.Scanner;

public class Exo24 {
    public static void main(String[] args) {
        System.out.println("Choisissez le nombre de joueurs\nEntre 1 et 10: ");
        Scanner scanner = new Scanner(System.in);
        int nbrJoueurs = scanner.nextInt();
        int[] score = null;

        if (nbrJoueurs <= 10 && nbrJoueurs >= 1) {
            score = new int[nbrJoueurs];
            for (int i = 0; i < score.length; i++){
                System.out.println("Entrez le score du joueur :" + (i+1));
                score[i] = scanner.nextInt();
            }
        } else {
            System.out.println("Erreur: apprend à lire");
        }

        scanner.close();
        if (score != null){
            double moyenne = 0;
            for (int i = 0; i < score.length; i++) {
                System.out.println("Score du joueur " + (i+1) + " est " + score[i]);
                moyenne += score[i];
            }
            moyenne = moyenne / nbrJoueurs;
            System.out.println("La moyenne vaut: " + moyenne);
        }
    }
}
