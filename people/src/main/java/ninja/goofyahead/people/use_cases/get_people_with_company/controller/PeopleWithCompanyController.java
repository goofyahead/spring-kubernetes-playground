package ninja.goofyahead.people.use_cases.get_people_with_company.controller;

import ninja.goofyahead.people.use_cases.get_people_with_company.client.CompanyClient;
import ninja.goofyahead.people.use_cases.get_people_with_company.models.Company;
import ninja.goofyahead.people.use_cases.get_people_with_company.models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleWithCompanyController {

    private final CompanyClient companyService;

    public PeopleWithCompanyController(CompanyClient companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/peopleWithCompany/{id}")
    public Person getPerson(@PathVariable int id){
        Company company = companyService.getCompany("Alex");
        Person human = Person.getRandomPerson();
        human.setCompany(company);
        return human;
    }
}
