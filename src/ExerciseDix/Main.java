package ExerciseDix;

import ExerciseDix.Classes.CasaVacacional;
import ExerciseDix.Classes.Departamento;
import ExerciseDix.Classes.Hotel;
import ExerciseDix.Classes.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Hotel hotel = new Hotel();
        Departamento departamento = new Departamento();
        CasaVacacional casa = new CasaVacacional();
        
        usuario.reservar(departamento, "10/10/2021");
        
        usuario.cancelarReserva(departamento);

        usuario.reservar(casa, "10/10/2021");
        
        usuario.calificar(hotel, 5);    
    }
}
