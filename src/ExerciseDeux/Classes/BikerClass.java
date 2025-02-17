package ExerciseDeux.Classes;

import ExerciseDeux.Interfaces.DealerInterface;

public class BikerClass implements DealerInterface {

    @Override
    public void deliver() {
        System.out.println("Delivering order by motorcycle!");
    }

}
