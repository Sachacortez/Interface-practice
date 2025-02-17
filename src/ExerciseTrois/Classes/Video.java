package ExerciseTrois.Classes;

import ExerciseTrois.Interfaces.Interactable;

public class Video implements Interactable{

    @Override
    public void comment(String comment) {
        System.out.println("commented: " + comment);
    }

    @Override
    public void react(String reaction) {
        System.out.println("reacted: " + reaction);
    }

    @Override
    public void share() {
        System.out.println("shared");
    }
    
}
