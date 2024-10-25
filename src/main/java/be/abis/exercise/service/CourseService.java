package be.abis.exercise.service;

import be.abis.exercise.model.Course;

import java.util.List;
import java.util.stream.Collectors;

public interface CourseService {

    List<Course> findAllCourses();
    Course findCourseById(int id);
    List<Course> findCourseByShortTitle(String shortTitle);
   List<Course> findCourseByNumberOfDays(int numberOfDays) ;
    void addCourse(Course c);
    void updateCourse(Course c);
    void deleteCourse(int id);

}
