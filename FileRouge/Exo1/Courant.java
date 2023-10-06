package FileRouge.Exo1;

public class Courant {
  public String numero;
  public double solde;
  public double ligneDeCredit;
  public String personne;
  
  public void depot(double montant){
    if (montant > 0){
      solde += montant;
      return solde;
    } else System.out.println("Erreur, met de l'argent sale radin");
  }

  public void retrait(double montant) {
    double soldeInit;
    soldeInit = solde;
    solde -= montant;
    if(solde <= ligneDeCredit){
      return (soldeInit - ligneDeCredit);
      solde=ligneDeCredit;
    } else return montant;
  }
}
