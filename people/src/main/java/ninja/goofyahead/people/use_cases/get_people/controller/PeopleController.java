package ninja.goofyahead.people.use_cases.get_people.controller;

import ninja.goofyahead.people.use_cases.get_people.models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

    @GetMapping("/people/{id}")
    public Person getPerson(@PathVariable int id){
        return new Person("Alex", "Vidal");
    }
}
