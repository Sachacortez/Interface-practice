package ExerciseUn.Classes;

import java.util.LinkedList;

import ExerciseUn.Interfaces.PlayableInterface;
;

public class UserClass {

    LinkedList<String> favourites = new LinkedList<>();

    public void add(PlayableInterface playable) {
        favourites.add(playable.getName());
        System.out.println(playable.getName() + " added");
        System.out.println(favourites);
    }
    
}
