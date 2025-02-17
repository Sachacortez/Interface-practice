package ExerciseHuit.Classes;

import ExerciseHuit.Interfaces.Bonifiable;
import ExerciseHuit.Interfaces.Employe;

public class Directeur implements Employe, Bonifiable {
    private String poste;
    private double salaire;

    public Directeur(String _poste, double _salaire) {
        poste = _poste;
        salaire = _salaire;
    }

    @Override
    public void calculerSalaire() {
        System.out.println("Le salaire de l'employé directeur est de " + salaire + " euros.");
    }

    @Override
    public void obtenirPoste() {
        System.out.println("Le poste de l'employé directeur est " + poste + ".");
    }

    @Override
    public void calculerPrime() {
        System.out.println("La prime de l'employé directeur est de " + salaire * 0.2 + " euros.");
    }
}
