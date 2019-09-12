package ninja.goofyahead.companies.use_cases.get_companies.controllers;

import ninja.goofyahead.companies.use_cases.get_companies.client.PeopleClient;
import ninja.goofyahead.companies.use_cases.get_companies.models.Company;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompaniesController {

    private Logger log = LoggerFactory.getLogger(CompaniesController.class);

    @Value("${greetings.message}")
    private String greetings;

    private PeopleClient peopleClient;

    public CompaniesController(PeopleClient peopleClient) {
        this.peopleClient = peopleClient;
    }

    @GetMapping("/company/{id}")
    public Company getCompanyById(@PathVariable int id){
        log.info("message from config " + greetings);
        return Company.generateRandom();
    }

    @GetMapping("/company")
    public Company getCompanyId(@RequestParam("employee") String employee){
        return Company.generateRandom();
    }
}
