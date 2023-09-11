import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Exo30 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Veuillez choisir la taille de votre tableau: ");

        int tailleTab = scanner.nextInt();
        int[] tab = new int[tailleTab];

        for (int i = 0; i < tab.length; i++){
            tab[i] = rand.nextInt(200) + 1;
        }

        System.out.println("Voici le tablea non trié: ");
        System.out.println(Arrays.toString(tab));

        //Trions le tableau
        for (int i = 0; i < tab.length; i++){
            int indiceMinimum = i;
            for (int j = i + 1; j < tab.length; j++){
                if (tab[j] < tab[indiceMinimum]) {
                    indiceMinimum = j;
                }
            }
            int temp = tab[indiceMinimum];
            tab[indiceMinimum] = tab[i];
            tab[i] = temp;
        }

        System.out.println("\n\nVoici le tableau trié: ");
        System.out.println(Arrays.toString(tab));

        System.out.println("Quel nombre voulez vous ajouter ?");
        int newNumber = scanner.nextInt();
        scanner.close();

        int[] newTab = new int[tab.length + 1];
        for(int i = 0; i<tab.length; i++){
            newTab[i] = tab[i];
        }
        newTab[newTab.length - 1] = newNumber;

        for (int i = 0; i < newTab.length; i++){
            int indiceMinimum = i;
            for (int j = i + 1; j < newTab.length; j++){
                if (newTab[j] < newTab[indiceMinimum]) {
                    indiceMinimum = j;
                }
            }
            int temp = newTab[indiceMinimum];
            newTab[indiceMinimum] = newTab[i];
            newTab[i] = temp;
            
        }

        System.out.println("Voici le nouveau tableau trié: ");
        System.out.println(Arrays.toString(newTab));

    }
}
