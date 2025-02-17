package ExerciseTrois.Classes;

import ExerciseTrois.Interfaces.Interactable;

public class User {

    public void interact(Interactable interactable, String action, String value) {
        switch (action) {
            case "comment":
                interactable.comment(value);
                break;
            case "react":
                interactable.react(value);
                break;
            case "share":
                interactable.share();
                break;
            default:
                System.out.println("Invalid action");
                break;
        }
    }
    
}
