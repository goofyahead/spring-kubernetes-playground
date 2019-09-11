package ninja.goofyahead.people.use_cases.get_people_with_company.models;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private String surname;
    private Company company;

    public Person (String name, String surname){
        this.setName(name);
        this.setSurname(surname);
    }

    public static Person getRandomPerson(){
        Faker faker = new Faker();
        return new Person(faker.name().firstName(), faker.name().lastName());
    }
}
