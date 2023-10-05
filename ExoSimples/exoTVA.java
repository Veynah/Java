public class exoTVA {
    public static void main(String[] args){
        final int TAUX_TVA = 21;
        double prixHTVA, prixTVAC;
        
        System.out.println("Veuillez indiquer le prix hors tva: ");
        String prixHTVAString = System.console().readLine();
        prixHTVA = Double.parseDouble(prixHTVAString);
        prixTVAC = prixHTVA*(1+TAUX_TVA/100);
        
        System.out.println(prixHTVA);
        System.out.println(prixTVAC);
        System.out.println(TAUX_TVA);
    }
}
