package ninja.goofyahead.companies.use_cases.get_companies.models;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    private String name;
    private String direction;
    private int numberOfEmployees;

    public static Company generateRandom(){
        Faker faker = new Faker();
        return new Company(faker.company().name(), faker.address().streetAddress(), faker.number().numberBetween(10, 100));
    }

}
