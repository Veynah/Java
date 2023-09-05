class YearBiss {
    public static void main(String[] args){
        System.out.println("Entrez une année: ");
        int annee = Integer.parseInt(System.console().readLine());

        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            System.out.println(annee + " est une année bissextile.");
        } else {
            System.out.println(annee + " n'est pas une année bissextile.");
        }
    }
}