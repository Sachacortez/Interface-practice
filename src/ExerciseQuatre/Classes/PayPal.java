package ExerciseQuatre.Classes;

import ExerciseQuatre.Interfaces.PaymentMethod;

public class PayPal implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using PayPal");
    }
    
}
