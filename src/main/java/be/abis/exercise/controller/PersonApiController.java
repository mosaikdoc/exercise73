package be.abis.exercise.controller;


import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;
import be.abis.exercise.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PersonApiController {

    @Autowired
    PersonService personService;

    @GetMapping("")
    public List<Person> findAllPersons(){
        return personService.getAllPersons();
    }

    @GetMapping("persons")
    public Person findPersonByMailAndPwd(@RequestParam("mail") String emailAddress, @RequestParam("pwd") String passWord) {
        return personService.findPerson(emailAddress, passWord);
    }



}
