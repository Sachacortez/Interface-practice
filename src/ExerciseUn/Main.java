package ExerciseUn;

import ExerciseUn.Classes.DocumentalClass;
import ExerciseUn.Classes.MovieClass;
import ExerciseUn.Classes.SeriesClass;
import ExerciseUn.Classes.UserClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Streaming type shyt");
        System.out.println("------------------------------------");

        UserClass u = new UserClass();
        MovieClass movie = new MovieClass("Bee Movie", 120);
        DocumentalClass doc = new DocumentalClass("Arabs");
        SeriesClass show = new SeriesClass(13, "Daredevil");

        u.add(show);
        u.add(movie);
        u.add(doc);

        show.play();
        movie.play();

        show.stop();
        movie.pause();
        doc.play();
    }
}
