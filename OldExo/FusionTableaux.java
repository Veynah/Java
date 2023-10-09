public class FusionTableaux {
    public static void main(String[] args){
        int[] tab1 = {1,2,3};
        int[] tab2 = {4,5,6};

        int[] tab3 = fusionner(tab1, tab2);

        for (int element : tab3){
            System.out.println(element + " ");
        }
    }

    public static int[] fusionner(int[] tab1, int[] tab2) {
        int tailleTab3 = tab1.length + tab2.length;

        int[] tab3 = new int[tailleTab3];

        for (int i = 0; i < tab1.length; i++){
            tab3[i] = tab1[i];
        }

        for (int i = 0; i < tab2.length ; i++){
            tab3[i + tab1.length] = tab2[i];
        }

        return tab3;
    }
}
