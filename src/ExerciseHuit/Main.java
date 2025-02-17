package ExerciseHuit;

import ExerciseHuit.Classes.Administratif;
import ExerciseHuit.Classes.Directeur;
import ExerciseHuit.Classes.Entreprise;
import ExerciseHuit.Classes.Technique;
import ExerciseHuit.Interfaces.Employe;

public class Main {
    public static void main(String[] args) {
        Entreprise e = new Entreprise();
        Employe employe = new Administratif("administratif", 1500);
        Employe employe2 = new Technique("technique", 2000);
        Employe employe3 = new Directeur("Directeur", 3000);

        e.ajouterEmploye(employe);
        e.ajouterEmploye(employe2);
        e.ajouterEmploye(employe3);

        e.montrerEmployes();
    }
}
