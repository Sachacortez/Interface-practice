package ExerciseCinq.Classes;

import ExerciseCinq.Interface.Course;

public class Student {
    
    public void register(Course course) {
        course.begin();
    }

    public void complete(Course course) {
        course.complete();
    }

}
