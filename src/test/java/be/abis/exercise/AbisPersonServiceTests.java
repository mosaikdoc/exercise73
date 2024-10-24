package be.abis.exercise;


import be.abis.exercise.service.AbisPersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AbisPersonServiceTests {

    @Autowired
    AbisPersonService ps;

    @Test
    public void findPersonByMailPwIs1(){
        assertEquals(1,ps.findPerson("jdoe@abis.be","def456").getPersonId(),"findPerson() incorrect" );
    }

    @Test
    public void findPersonByIdIsJohnDoe(){
        assertEquals("jdoe@abis.be",ps.findPerson(1).getEmailAddress(),"findPerson() incorrect" );
    }



}
