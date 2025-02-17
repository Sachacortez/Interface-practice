package ExerciseNeuf;

import java.util.ArrayList;
import java.util.List;

import ExerciseNeuf.Classes.Produit;
import ExerciseNeuf.Classes.SystemeDeRecommandations;
import ExerciseNeuf.Classes.UtilisateurPremium;
import ExerciseNeuf.Classes.UtilisateurRegulier;
import ExerciseNeuf.Interfaces.Conseille;

public class Main {
    public static void main(String[] args) {
    List<Produit> produits = new ArrayList<>();
    produits.add(new Produit("Livre", 10.0, "Lecture"));
    produits.add(new Produit("Livre", 10.0, "Lecture"));
    produits.add(new Produit("Ordinateur", 1000.0, "Technologie"));
    produits.add(new Produit("Téléphone", 500.0, "Technologie"));
    produits.add(new Produit("Télévision", 1500.0, "Technologie"));
    
    SystemeDeRecommandations systeme = new SystemeDeRecommandations(produits);    

    Conseille utilisateurRegulier = new UtilisateurRegulier();
    Conseille utilisateurPremium = new UtilisateurPremium();

    systeme.montrerRecommandations(utilisateurRegulier);
    systeme.montrerRecommandations(utilisateurPremium);

    }
}
