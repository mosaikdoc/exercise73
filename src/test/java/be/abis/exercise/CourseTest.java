package be.abis.exercise;

import be.abis.exercise.model.Course;
import be.abis.exercise.utility.MyUtility;

public class CourseTest {

    public static void main(String[] args) {
        Course c = new Course("1000","SPRINGREST","Building REST APIs with spring boot and gradle",5,550.);
        MyUtility.printCourse(c);
    }
}
