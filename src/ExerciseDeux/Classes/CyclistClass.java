package ExerciseDeux.Classes;

import ExerciseDeux.Interfaces.DealerInterface;

public class CyclistClass implements DealerInterface{

    @Override
    public void deliver() {
        System.out.println("Cyclist delivering!");
    }
    
}
