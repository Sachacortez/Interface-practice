package ExerciseTrois;

import ExerciseTrois.Classes.Article;
import ExerciseTrois.Classes.Photo;
import ExerciseTrois.Classes.User;
import ExerciseTrois.Classes.Video;

public class Main {
    public static void main(String[] args) {
        
        User u = new User();
        Video video = new Video();
        Article article = new Article();
        Photo photo = new Photo();

        u.interact(video, "comment", "Nice video!");
        u.interact(article, "react", "Like");
        u.interact(photo, "share", "");
    }
}
