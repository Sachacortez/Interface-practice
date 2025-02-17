package ExerciseQuatre.Classes;

import ExerciseQuatre.Interfaces.Billable;

public class DigitalBill implements Billable {

    @Override
    public void generateBill() {
        System.out.println("Generating Digital Bill");
    }
    
}
