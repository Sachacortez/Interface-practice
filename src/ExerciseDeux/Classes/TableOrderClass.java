package ExerciseDeux.Classes;

import ExerciseDeux.Interfaces.OrderInterface;

public class TableOrderClass implements OrderInterface {

    @Override
    public void prepare() {
        System.out.println("Preparing order for table!");
    }

    @Override
    public void serve() {
        System.out.println("Serving order!");
    }
    
}
