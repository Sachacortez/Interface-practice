package ExerciseNeuf.Classes;

import ExerciseNeuf.Interfaces.Conseille;

public class UtilisateurRegulier implements Conseille {

    @Override
    public void obtenirRecommandations() {
        System.out.println("Obtenir des recommandations pour les utilisateurs réguliers");    
    }
    
}
