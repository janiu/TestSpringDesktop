package com.test.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Rafi on 13/09/2016.
 */

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void fun(){
        personRepository.fun();
    }

    public PersonRepository getPersonRepository() {
        return personRepository;
    }

    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


}
