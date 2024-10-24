package be.abis.exercise;

import be.abis.exercise.repository.CourseRepository;
import be.abis.exercise.repository.MemoryCourseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseRepositoryTest {
	
	CourseRepository cr;
	
	@BeforeEach
	public void setUp() {
		cr = new MemoryCourseRepository();
	}
	
	@Test
	public void numberOfCoursesInMemoryIs5() {
		int size = cr.findAllCourses().size();
		assertEquals(5,size);
	}

	@Test
	public void courseWithId8050isGradle() {
		String title = cr.findCourseById(8050).getShortTitle();
		assertEquals("Gradle",title);
	}

	@Test
	public void courseWithTitleSpringTakes3Days() {
		int days = cr.findCourseByShortTitle("Spring").getNumberOfDays();
		assertEquals(3,days);
	}
	
	

}
