package be.abis.exercise.controller;

import be.abis.exercise.model.Course;
import be.abis.exercise.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("courses")
public class CourseApiController {

    @Autowired
    CourseService courseService;

    @GetMapping("")
    public List<Course> findAllCourses(){
        return courseService.findAllCourses();
    }

    @GetMapping("{id}")
    public Course findCourseById(@PathVariable("id") int myId){
        Course c = courseService.findCourseById(myId);
        return c;
    }

    @GetMapping("/query")
    public List<Course> findCourseByTitle(@RequestParam(value="title",defaultValue="§§§§") String shortTitle,
                                          @RequestParam(value="nrdays",defaultValue="-99999")int numberOfDays){
        if ("§§§§".equals(shortTitle)) {
            if (-99999==numberOfDays){
                return null;
            } else {
                return courseService.findCourseByNumberOfDays(numberOfDays);
            }
        }else{
            if (-99999==numberOfDays){
                return courseService.findCourseByShortTitle(shortTitle);
            }  else {
                return null;
            }
        }

    }



    @GetMapping("/query1")
    public List<Course>findCourseByTitle(@RequestParam("title") String shortTitle){
        return courseService.findCourseByShortTitle(shortTitle);
    }
    @GetMapping("/query2")
    public List<Course> findCourseByNumberOfDays(@RequestParam("nrdays")int numberOfDays) {
        return courseService.findCourseByNumberOfDays(numberOfDays);
    }

    @PostMapping("")
    public void addCourse(@RequestBody Course course){
      courseService.addCourse(course);
    }

    @PutMapping("{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable("id") int id){
        courseService.updateCourse(course);
    }

    @DeleteMapping("{id}")
    public void deleteCourse(@PathVariable("id") int id){
        courseService.deleteCourse(id);
    }

}
