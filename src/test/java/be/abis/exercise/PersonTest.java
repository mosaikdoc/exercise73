package be.abis.exercise;

import be.abis.exercise.model.Address;
import be.abis.exercise.model.Company;
import be.abis.exercise.model.Person;

public class PersonTest {

    public static void main(String[] args) {
        Address a = new Address("Diestsevest",32,"3000","Leuven");
        Company c = new Company("Abis","016/455610","BE12345678",a);
        Person p = new Person(1,"John","Doe",35,"jdoe@abis.be","def456","nl",c);

        System.out.println(p);
    }
}
