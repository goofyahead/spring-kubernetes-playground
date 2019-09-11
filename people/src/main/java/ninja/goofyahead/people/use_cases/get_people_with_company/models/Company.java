package ninja.goofyahead.people.use_cases.get_people_with_company.models;

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

}
