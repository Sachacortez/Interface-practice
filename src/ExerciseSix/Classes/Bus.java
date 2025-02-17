package ExerciseSix.Classes;

import ExerciseSix.Interfaces.TransportCommun;

public class Bus implements TransportCommun {

    @Override
    public void commencerVoyage(String origine, String destination) {
        System.out.println("Départ de " + origine + " vers " + destination);
    }

    @Override
    public void calculerTarif() {
        System.out.println("Calcul du tarif du bus");
    }
    
}
