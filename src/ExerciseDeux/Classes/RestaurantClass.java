package ExerciseDeux.Classes;
import java.util.ArrayList;
import java.util.List;

import ExerciseDeux.Interfaces.OrderInterface;

public class RestaurantClass {

    List<OrderInterface> orders;
    
    public RestaurantClass() {
        this.orders = new ArrayList<>();
    }

    public void takeOrder(OrderInterface order) {
        orders.add(order);
        System.out.println("We got one new order!");
    }
    
    public void manageOrders() {
        for(OrderInterface order : orders) {
            System.out.println("-------------------------");
            order.prepare();
            order.serve();
        }
    }

}
