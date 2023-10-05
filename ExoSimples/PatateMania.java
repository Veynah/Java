public class PatateMania {
    public static int[] remplirSeau(int[] seau, int numeroPomme) {
        for (int i = 0; i < seau.length; i++) {
            seau[i] = numeroPomme;
            numeroPomme++;
        }
        System.out.println("Le seau est rempli.");
        return seau;
    }

    public static int pelerEtMettreDansMarmite(int[] seau, int[] marmite, int marmiteIndex, int seauIndex) {
        System.out.println("Pelage de la pomme de terre numéro " + seau[seauIndex] + "...");
        marmite[marmiteIndex] = seau[seauIndex];
        seau[seauIndex] = 0;  
        System.out.println("Pomme de terre numéro " + marmite[marmiteIndex] + " ajoutée à la marmite.");
        return marmiteIndex + 1;
    }

    public static void main(String[] args) {
        int[] seau = new int[17];
        int[] marmite = new int[50];
        int marmiteIndex = 0;  
        int numeroPomme = 1;  

        seau = remplirSeau(seau, numeroPomme);
        numeroPomme += seau.length;

        while (marmiteIndex < 50) {
            for (int seauIndex = 0; seauIndex < seau.length; seauIndex++) {
                if (marmiteIndex >= 50) {
                    break;
                }
                marmiteIndex = pelerEtMettreDansMarmite(seau, marmite, marmiteIndex, seauIndex);
            }

            if (marmiteIndex < 50) {
                seau = remplirSeau(seau, numeroPomme);
                numeroPomme += seau.length;
            }
        }

        System.out.println("La marmite est pleine !");
    }
}
