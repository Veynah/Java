class Tableau {
    public static void main(String[] args){
        int tabEntier[][] = { {5, 45, 78, -8}, {-4, 85, 1, -85}, {47, 31, -85, 87} };
        double somme = 0;
        int nombreElement = 0;

        for(int i = 0; i<3;i++){
            for(int j = 0; j<4;j++){
                somme = somme + tabEntier[i][j];
                nombreElement++;
            }
        }
        System.out.print("La moyenne des nombres du tableau d'entier vaut " + somme/nombreElement);
    }
    
}
