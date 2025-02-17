package ExerciseDeux;

import ExerciseDeux.Classes.BikerClass;
import ExerciseDeux.Classes.CyclistClass;
import ExerciseDeux.Classes.DeliveryOrderClass;
import ExerciseDeux.Classes.RestaurantClass;
import ExerciseDeux.Classes.TableOrderClass;
import ExerciseDeux.Classes.TakeoutOrderClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Krusty Crab!");
        System.out.println("-------------------------");

        RestaurantClass restaurant = new RestaurantClass();

        BikerClass biker = new BikerClass();
        CyclistClass cyclist = new CyclistClass();
        
        TakeoutOrderClass order1 = new TakeoutOrderClass();
        TableOrderClass order2 = new TableOrderClass();
        DeliveryOrderClass order3 = new DeliveryOrderClass(biker);
        DeliveryOrderClass order4 = new DeliveryOrderClass(cyclist);

        restaurant.takeOrder(order1);
        restaurant.takeOrder(order2);
        restaurant.takeOrder(order3);
        restaurant.takeOrder(order4);

        restaurant.manageOrders();
    }
}
