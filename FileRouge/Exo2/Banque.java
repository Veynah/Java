package FileRouge.Exo2;

import java.util.Hashmap;
import java.util.Map;

public class Banque {
  private String nom;
  private Map<String, Compte> comptes;

  public Banque(String nom) {
    this.nom = nom;
    this.comptes = new Hashmap<>();
  }
  
  public Compte get(String numero) {
    return comptes.get(numero);
  }

  public void ajouter(Courant compte) {
    comptes.put(compete.getNumero(), compte);

  }

  public void supprimer(String nemuro) (
    comptes.remove(numero);
  )
}
