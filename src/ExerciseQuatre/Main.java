package ExerciseQuatre;

import ExerciseQuatre.Classes.CreditCard;
import ExerciseQuatre.Classes.DigitalBill;
import ExerciseQuatre.Classes.Purchase;
import ExerciseQuatre.Interfaces.Billable;
import ExerciseQuatre.Interfaces.PaymentMethod;

public class Main {
    public static void main(String[] args) {
        PaymentMethod pay = new CreditCard();
        Billable bill = new DigitalBill();
        Purchase purchase = new Purchase(pay, bill, 100.0);

        purchase.makePurchase();
    }

}
