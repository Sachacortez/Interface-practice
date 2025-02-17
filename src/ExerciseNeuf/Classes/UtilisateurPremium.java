package ExerciseNeuf.Classes;

import ExerciseNeuf.Interfaces.Conseille;

public class UtilisateurPremium implements Conseille {

    @Override
    public void obtenirRecommandations() {
        System.out.println("Obtenir des recommandations pour les utilisateurs premium");    
    }
    
}
