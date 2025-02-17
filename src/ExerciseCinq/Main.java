package ExerciseCinq;

import ExerciseCinq.Classes.ExamCourse;
import ExerciseCinq.Classes.PDFCourse;
import ExerciseCinq.Classes.Student;
import ExerciseCinq.Classes.VideoCourse;
import ExerciseCinq.Interface.Course;

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        Course p = new PDFCourse();
        Course v = new VideoCourse();
        Course e = new ExamCourse();

        s.register(p);
        s.register(v);
        s.register(e);

        s.complete(e);
    }
}
