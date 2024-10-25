package be.abis.exercise.repository;

import be.abis.exercise.model.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MemoryCourseRepository implements CourseRepository {
	
	private ArrayList<Course> courses = new ArrayList<Course>();

	public MemoryCourseRepository(){
		courses.add(new Course("7850","DB2, an overview","DB2, an overview",5,550.0));
		courses.add(new Course("7900","Workshop SQL","Workshop SQL",3,475.0));
		courses.add(new Course("8000","JavaProg","Java Programming",5,500.0));
		courses.add(new Course("8050","Gradle","Gradle",1,450.0));
		courses.add(new Course("8100","Spring","Programming with Spring",3,525.0));
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	@Override
	public List<Course> findAllCourses() {
		return courses;
	}

	@Override
	public Course findCourseById(int id) {
		return courses.stream().filter(c->c.getCourseId().equals(id+"")).findFirst().orElse(null);
	}

	@Override
	public List<Course> findCourseByShortTitle(String shortTitle) {
//		return courses.stream().filter(c->c.getShortTitle().equalsIgnoreCase(shortTitle)).findFirst().orElse(null);
		return courses.stream().filter(c->c.getShortTitle().equalsIgnoreCase(shortTitle)).collect(Collectors.toList());
	}

	@Override
	public List<Course> findCourseByNumberOfDays(int numberOfDays) {
		return courses.stream().filter(c-> c.getNumberOfDays() == numberOfDays).collect(Collectors.toList());
	}

	@Override
	public void addCourse(Course c) {
		courses.add(c);
	}

	@Override
	public void updateCourse(Course c) {
		Course courseToUpdate = this.findCourseById(Integer.parseInt(c.getCourseId()));
		courseToUpdate.setShortTitle(c.getShortTitle());
		courseToUpdate.setLongTitle(c.getLongTitle());
		courseToUpdate.setNumberOfDays(c.getNumberOfDays());
		courseToUpdate.setPricePerDay(c.getPricePerDay());

	}

	@Override
	public void deleteCourse(int id) {
		Course courseToDelete = this.findCourseById(id);
		courses.remove(courseToDelete);
	}


}
