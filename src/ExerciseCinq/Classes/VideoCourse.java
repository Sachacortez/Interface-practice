package ExerciseCinq.Classes;

import ExerciseCinq.Interface.Course;

public class VideoCourse implements Course {

    @Override
    public void begin() {
        System.out.println("Video class has begun.");
    }

    @Override
    public void complete() {
        System.out.println("Video class has been completed.");
    }
    
}
