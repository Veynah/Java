class Main {
    public static void main(String[] args){
        System.out.println("Veuillez entrer un premier entier.");
        int premierNombre;
        premierNombre = Integer.parseInt(System.console().readLine());
        System.out.println("Veuillez entrer un second entier.");
        int secondNombre;
        secondNombre = Integer.parseInt(System.console().readLine());

        if(premierNombre < secondNombre){
            System.out.println("La première valeur est plus petite que la seconde.");
        }
        else{
            if(premierNombre > secondNombre){
                System.out.println("La premiere valeur est plus grande que la seconde.");
            }
            else{
                System.out.println("Les deux valeurs sont identiques.")
            }
        }
    }
}
