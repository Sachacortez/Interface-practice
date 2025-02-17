package ExerciseSix.Classes;

import ExerciseSix.Interfaces.TransportCommun;

public class Utilisateur {
    
    public void utiliserTransport(TransportCommun transport, String origine, String destination) {
        
        if(transport instanceof Taxi) {
            ((Taxi)transport).accepterPassager();
        }

        transport.commencerVoyage(origine, destination);

        if (transport instanceof Taxi) {
            ((Taxi)transport).arreterVoyage();
            
        }

        transport.calculerTarif();
        
    }

}
