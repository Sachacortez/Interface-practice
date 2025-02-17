package ExerciseCinq.Classes;

import ExerciseCinq.Interface.Course;

public class PDFCourse implements Course {

    @Override
    public void begin() {
        System.out.println("PDF class has begun.");
    }

    @Override
    public void complete() {
        System.out.println("PDF class has been completed.");
    }
    
}
