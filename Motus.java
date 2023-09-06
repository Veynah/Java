import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Motus {
    public static void main(String[] args) {
        String[] words = {"PYTHON", "JAVASC", "COFFEE", "GAMING", "LAPTOP", "MOBILE", "GITHUB", "MOTUSG", "APPLES", "BANANA", "FABIAN", "BRAHIM", "MELISS", "ANTOIN", "ADAMJC", "JEREMY"};
        Random rand = new Random();
        String secretWord = words[rand.nextInt(words.length)];

        HashMap<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < secretWord.length(); i++) {
            map.put(i, secretWord.charAt(i));
        }

        StringBuilder displayWord = new StringBuilder("******");
        Scanner scanner = new Scanner(System.in);
        int attempts = 15;
        boolean gameWon = false;

        while (attempts > 0 && !gameWon) {
            int correctAndWellPlaced = 0;
            int correctButMisplaced = 0;

            System.out.println("Devinez le mot: " + displayWord);
            System.out.println("Entrez un mot de 6 lettres: ");
            String guessedWord = scanner.nextLine().toUpperCase();

            if (guessedWord.length() != 6) {
                System.out.println("Le mot doit être de 6 lettres. Essayez encore.");
                continue;
            }

            for (int i = 0; i < guessedWord.length(); i++) {
                if (map.get(i) == guessedWord.charAt(i)) {
                    displayWord.setCharAt(i, guessedWord.charAt(i));
                    correctAndWellPlaced++;
                } else if (secretWord.contains(String.valueOf(guessedWord.charAt(i)))) {
                    correctButMisplaced++;
                }
            }

            if (displayWord.toString().equals(secretWord)) {
                System.out.println("Félicitations, vous avez trouvé le mot secret : " + secretWord);
                gameWon = true;
            } else {
                attempts--;
                System.out.println("Il vous reste " + attempts + " tentatives.");
                System.out.println(correctAndWellPlaced + " lettres sont correctes et bien placées.");
                System.out.println(correctButMisplaced + " lettres sont correctes mais mal placées.");
            }
        }

        if (!gameWon) {
            System.out.println("Vous avez épuisé toutes vos tentatives ! Le mot secret était " + secretWord);
        }

        scanner.close();
    }
}
