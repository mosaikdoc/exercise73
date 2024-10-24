package be.abis.exercise;

import be.abis.exercise.repository.CourseRepository;
import be.abis.exercise.service.AbisCourseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AbisCourseServiceTests {
    @Autowired
    AbisCourseService cs;

    @Test
    void findCourseByIdIsXXX(){
        assertEquals("Workshop SQL2",cs.findCourseById(7900).getShortTitle(),"findCourseById() incorrect");
    }
}
