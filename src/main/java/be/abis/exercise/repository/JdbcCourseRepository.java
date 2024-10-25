package be.abis.exercise.repository;

import be.abis.exercise.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//@Repository
public class JdbcCourseRepository implements CourseRepository{
 //   @Autowired
   // private JdbcTemplate jdbcTemplate;

    public JdbcCourseRepository() {
    }

    @Override
    public List<Course> findAllCourses() {
        //return jdbcTemplate.query("select * from courses", );
        return null;
    }

    @Override
    public Course findCourseById(int id) {
        return null;
    }

    @Override
    public List<Course> findCourseByShortTitle(String shortTitle) {
        return null;
    }

    @Override
    public List<Course> findCourseByNumberOfDays(int numberOfDays) {
        return null;
    }

    @Override
    public void addCourse(Course c) {

    }

    @Override
    public void updateCourse(Course c) {

    }

    @Override
    public void deleteCourse(int id) {

    }

    private static final class  CourseMapper implements RowMapper<Course>{
        public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
            Course course = new Course();
            course.setCourseId(rs.getString("cid"));
            course.setShortTitle(rs.getString("cstitle"));
            return course;
        }
    }
}
