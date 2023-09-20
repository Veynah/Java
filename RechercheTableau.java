public class RechercheTableau {
    public static void main(String[] args){
        int[] tableau = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int taille = tableau.length;
        int valeurRecherchee = 8;

        int indice = recherche(tableau, taille, valeurRecherchee);

        if (indice == -1) {
            System.out.println("La valeur " + valeurRecherchee + " n'est pas dans le tableau");
        } else {
            System.out.println("La valeur " + valeurRecherchee + " est dans tableau à l'indice " + indice);
        }
    }

    public static int recherche(int[] tableau, int taille, int valeurRecherchee) {
        for (int i = 0; i < taille; i++){
            if (tableau[i] == valeurRecherchee) {
                return i;
            }
        }
        return -1;
    }
}
