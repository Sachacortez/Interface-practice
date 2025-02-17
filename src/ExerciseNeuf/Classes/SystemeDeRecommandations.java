package ExerciseNeuf.Classes;

import java.util.List;

import ExerciseNeuf.Interfaces.Conseille;

public class SystemeDeRecommandations {
    private List<Produit> produits;

    public SystemeDeRecommandations(List<Produit> produits) {
        this.produits = produits;
    }

    public void montrerRecommandations(Conseille utilisateur) {
        System.out.println(produits);
    }
}
