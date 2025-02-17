package ExerciseQuatre.Classes;

import ExerciseQuatre.Interfaces.PaymentMethod;

public class Transfer implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Transfer");
    }
    
}
