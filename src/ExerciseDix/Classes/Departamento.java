package ExerciseDix.Classes;

import ExerciseDix.Interfaces.Reservable;

public class Departamento implements Reservable {
    
        @Override
        public void reservar(String fecha) {
            System.out.println("Reserva realizada para el " + fecha);
        }
    
        @Override
        public void cancelarReserva() {
            System.out.println("Reserva cancelada");
        }
}
