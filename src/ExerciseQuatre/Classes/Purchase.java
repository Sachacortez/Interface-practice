package ExerciseQuatre.Classes;

import ExerciseQuatre.Interfaces.Billable;
import ExerciseQuatre.Interfaces.PaymentMethod;

public class Purchase {

    private PaymentMethod paymentMethod;
    private Billable bill;
    private double amount;

    public Purchase(PaymentMethod paymentMethod, Billable bill, double amount) {
        this.paymentMethod = paymentMethod;
        this.bill = bill;
        this.amount = amount;
    }   

    public void makePurchase() {
        paymentMethod.pay(amount);
        bill.generateBill();
    }

}
