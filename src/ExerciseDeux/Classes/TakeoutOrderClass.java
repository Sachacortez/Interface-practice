package ExerciseDeux.Classes;

import ExerciseDeux.Interfaces.OrderInterface;

public class TakeoutOrderClass implements OrderInterface {

    @Override
    public void prepare() {
        System.out.println("Preparing takout order!");
    }

    @Override
    public void serve() {
        System.out.println("Serving takout order!");
    }
    
}
