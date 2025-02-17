package ExerciseDix.Classes;

import ExerciseDix.Interfaces.Calificable;
import ExerciseDix.Interfaces.Reservable;

public class Hotel implements Reservable, Calificable {

    @Override
    public void reservar(String fecha) {
        System.out.println("Reserva realizada para el " + fecha);
    }

    @Override
    public void cancelarReserva() {
        System.out.println("Reserva cancelada");
    }

    @Override
    public void calificar(int calificacion) {
        System.out.println("Calificación: " + calificacion);
    }
    
}
