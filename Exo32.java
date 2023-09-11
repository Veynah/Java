import java.util.Arrays;
import java.util.Random;

public class Exo32 {
    public static void main(String[] args) {
        Random rand = new Random();

        int tailleTab1 = rand.nextInt(5) + 15;
        int tailleTab2 = rand.nextInt(5) + 25;
        int tailleTab3 = (tailleTab1 + tailleTab2);

        int[] tab1 = new int[tailleTab1];
        int[] tab2 = new int[tailleTab2];
        int[] tab3 = new int[tailleTab3];

        for (int i = 0; i < tab1.length; i++){
            tab1[i] = rand.nextInt(200) + 1;
        }

        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = rand.nextInt(200) + 1;
        }

        System.out.println("Voici le premier tableau de taille: " + tailleTab1);
        System.out.println(Arrays.toString(tab1));
        System.out.println("\nVoici le second tableau de taille: " + tailleTab2);
        System.out.println(Arrays.toString(tab2));
        
        int k = 0;

        // Insérer chaque élément de tab1 dans tab3 tout en triant
        for (int num : tab1) {
            int i = 0;
            while (i < k && tab3[i] <= num) {
                i++;
            }
            for (int j = k; j > i; j--) {
                tab3[j] = tab3[j-1];
            }
            tab3[i] = num;
            k++;
        }

        // Insérer chaque élément de tab2 dans tab3 tout en triant
        for (int num : tab2) {
            int i = 0;
            while (i < k && tab3[i] <= num) {
                i++;
            }
            for (int j = k; j > i; j--) {
                tab3[j] = tab3[j-1];
            }
            tab3[i] = num;
            k++;
        }

        System.out.println("\nVoici le troisième tableau combiné et trié: ");
        System.out.println(Arrays.toString(tab3));


    }
}
