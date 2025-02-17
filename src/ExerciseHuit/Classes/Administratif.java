package ExerciseHuit.Classes;

import ExerciseHuit.Interfaces.Employe;

public class Administratif implements Employe {
    private String poste;
    private double salaire;

    public Administratif(String _poste, double _salaire) {
        poste = _poste;
        salaire = _salaire;
    }

    @Override
    public void calculerSalaire() {
        System.out.println("Le salaire de l'employé administratif est de " + salaire + " euros.");
    }

    @Override
    public void obtenirPoste() {
        System.out.println("Le poste de l'employé administratif est " + poste + ".");
    }
    
}
