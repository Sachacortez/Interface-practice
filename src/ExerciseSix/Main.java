package ExerciseSix;

import ExerciseSix.Classes.Bus;
import ExerciseSix.Classes.CommunVelo;
import ExerciseSix.Classes.Taxi;
import ExerciseSix.Classes.Utilisateur;
import ExerciseSix.Interfaces.TransportCommun;

public class Main {
        public static void main(String[] args) {
            TransportCommun velo = new CommunVelo();
            TransportCommun bus = new Bus();
            TransportCommun taxi = new Taxi();
            Utilisateur u = new Utilisateur();

            u.utiliserTransport(velo, "Maison", "Travail");
            System.out.println("-------------------------------------------------");
            u.utiliserTransport(bus, "Maison", "Travail");
            System.out.println("-------------------------------------------------");
            u.utiliserTransport(taxi, "Maison", "Travail");
            
        }
}
