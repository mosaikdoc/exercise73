package be.abis.exercise.service;

import be.abis.exercise.model.Course;
import be.abis.exercise.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbisCourseService implements CourseService {

    @Autowired
    private CourseRepository cr;

    @Override
    public List<Course> findAllCourses() {
        return cr.findAllCourses();
    }

    @Override
    public Course findCourseById(int id) {
        return cr.findCourseById(id);
    }

    @Override
    public List<Course> findCourseByShortTitle(String shortTitle) {
        return cr.findCourseByShortTitle(shortTitle);
    }

    @Override
    public List<Course> findCourseByNumberOfDays(int numberOfDays) {
        return cr.findCourseByNumberOfDays(numberOfDays);
    }

    @Override
    public void addCourse(Course c) {
        cr.addCourse(c);
    }

    @Override
    public void updateCourse(Course c) {
         cr.updateCourse(c);
    }

    @Override
    public void deleteCourse(int id) {
         cr.deleteCourse(id);
    }

}
