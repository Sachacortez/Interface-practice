package ExerciseTrois.Classes;

import ExerciseTrois.Interfaces.Interactable;

public class Article implements Interactable {

    @Override
    public void comment(String comment) {
        System.out.println(comment);
    }

    @Override
    public void react(String reaction) {
        System.out.println(reaction);
    }

    @Override
    public void share() {
        System.out.println("shared");
    }
    
}
