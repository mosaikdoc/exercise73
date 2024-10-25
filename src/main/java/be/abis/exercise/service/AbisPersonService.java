package be.abis.exercise.service;

import be.abis.exercise.model.Person;
import be.abis.exercise.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class AbisPersonService implements PersonService {
    private PersonRepository personRepository;

    //@Autowired
    public AbisPersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.getAllPersons();
    }

    @Override
    public Person findPerson(int id) {
        return personRepository.findPerson(id);
    }

    @Override
    public Person findPerson(String emailAddress, String passWord) {
        return personRepository.findPerson(emailAddress, passWord);
    }

    @Override
    public void addPerson(Person p) throws IOException {
        personRepository.addPerson(p);
    }

    @Override
    public void deletePerson(int id) {
        personRepository.deletePerson(id);
    }

    @Override
    public void changePassword(Person p, String newPswd) throws IOException {
        personRepository.changePassword(p,newPswd);
    }
}
