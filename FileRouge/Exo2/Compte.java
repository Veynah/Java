package FileRouge.Exo2;

public class Compte {

  private String numero;
  private double solde;

  public Compte(String numero, double solde) {
    this.numero = numero;
    this.solde = solde;
  }

  public String GetNumero() {
    return numero;
  }
}
