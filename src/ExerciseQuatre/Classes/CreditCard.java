package ExerciseQuatre.Classes;

import ExerciseQuatre.Interfaces.PaymentMethod;

public class CreditCard implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Credit Card");
    }
    
}
