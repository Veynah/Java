package ExceptExo;

enum Devise {
    EURO, DOLLAR, YEN, POUND
}

class Compte {
    private double solde;
    private Devise devise;

    public Compte(double solde, Devise devise) {
        this.solde = solde;
        this.devise = devise;
    }

    public void retirer(double montant) throws CustomException {
        if (montant < 0) {
            throw new CustomException("Montant inférieur à zéro.");
        }
        if (montant > solde) {
            throw new CustomException("Montant dépasse la limite de retrait.");
        }
        solde -= montant;
    }

    public void changerDevise(Devise newDevise) throws CustomException {
        if (newDevise == this.devise) {
            throw new CustomException("La devise souhaitée est la même que celle déjà utilisée.");
        }
        if (!EnumUtils.isValidEnum(Devise.class, newDevise.name())) {
            throw new CustomException("La devise entrée ne fait pas partie de l'énumération.");
        }
        // Code pour changer la devise, par exemple en modifiant le solde.
    }
}

class Banque {
    private List<Compte> comptes = new ArrayList<>();

    public void supprimerCompte(Compte compte) throws CustomException {
        if (!comptes.contains(compte)) {
            throw new CustomException("Le compte à supprimer n'existe pas.");
        }
        comptes.remove(compte);
    }
}

