package ExerciseDeux.Classes;

import ExerciseDeux.Interfaces.DealerInterface;
import ExerciseDeux.Interfaces.OrderInterface;

public class DeliveryOrderClass implements OrderInterface {

    private DealerInterface dealer;

    public DeliveryOrderClass(DealerInterface dealer) {
        this.dealer = dealer;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing delivery order!");
    }

    @Override
    public void serve() {
        System.out.println("Delivering order!");
        dealer.deliver();
    }
    
}
