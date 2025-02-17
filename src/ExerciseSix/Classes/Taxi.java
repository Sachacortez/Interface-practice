package ExerciseSix.Classes;

import ExerciseSix.Interfaces.Chaffeur;
import ExerciseSix.Interfaces.TransportCommun;

public class Taxi implements TransportCommun, Chaffeur {

    @Override
    public void accepterPassager() {
        System.out.println("Accepter un passager");
    }

    @Override
    public void arreterVoyage() {
        System.out.println("Arrêter le voyage");
    }

    @Override
    public void commencerVoyage(String origine, String destination) {
        System.out.println("Départ de " + origine + " vers " + destination);
    }

    @Override
    public void calculerTarif() {
        System.out.println("Calcul du tarif du taxi");
    }    
    
}
