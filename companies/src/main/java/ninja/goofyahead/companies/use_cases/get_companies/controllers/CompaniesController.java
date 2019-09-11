package ninja.goofyahead.companies.use_cases.get_companies.controllers;

import ninja.goofyahead.companies.use_cases.get_companies.client.PeopleClient;
import ninja.goofyahead.companies.use_cases.get_companies.models.Company;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompaniesController {

    PeopleClient peopleClient;

    public CompaniesController(PeopleClient peopleClient) {
        this.peopleClient = peopleClient;
    }

    @GetMapping("/company/{id}")
    public Company getCompanyById(@PathVariable int id){
        return Company.generateRandom();
    }

    @GetMapping("/company")
    public Company getCompanyId(@RequestParam("employee") String employee){
        return Company.generateRandom();
    }
}
