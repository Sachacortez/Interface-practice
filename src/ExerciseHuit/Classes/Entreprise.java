package ExerciseHuit.Classes;

import java.util.ArrayList;
import java.util.List;

import ExerciseHuit.Interfaces.Employe; 

public class Entreprise {
    private List<Employe> employes;

    public Entreprise() {
        this.employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    public void montrerEmployes() {
        for (Employe employe : employes) {
            employe.obtenirPoste();
            employe.calculerSalaire();
        }
    }
    
}
