package ExerciseCinq.Classes;

import ExerciseCinq.Interface.Course;

public class ExamCourse implements Course {

    @Override
    public void begin() {
        System.out.println("Exam class has begun.");
    }

    @Override
    public void complete() {
        System.out.println("Exam class has been completed.");
    }
    
}
