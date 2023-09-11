import java.util.Arrays;

public class Exo26 {
    public static void main(String[] args) {
        int[] tableau = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
        System.out.println(Arrays.toString(tableau));

        // Parcourir chaque élément du tableau
        for (int i = 0; i < tableau.length - 1; i++) {

            // Trouver l'élément minimum dans le tableau non trié
            int indiceMinimum = i;
            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[j] < tableau[indiceMinimum]) {
                    indiceMinimum = j;
                }
            }

            // Échanger l'élément minimum trouvé avec le premier élément
            int temp = tableau[indiceMinimum];
            tableau[indiceMinimum] = tableau[i];
            tableau[i] = temp;
        }

        System.out.println(Arrays.toString(tableau));
    }
}
