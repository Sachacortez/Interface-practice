package ExerciseDix.Classes;

import ExerciseDix.Interfaces.Reservable;

public class Usuario {

    public void reservar(Reservable reservable, String fecha) {
        reservable.reservar(fecha);
    }

    public void cancelarReserva(Reservable reservable) {
        reservable.cancelarReserva();
    }

    public void calificar(Hotel hotel, int calificacion) {
        hotel.calificar(calificacion);
    }
    
}
