package ninja.goofyahead.people.use_cases.get_people_with_company.client;

import ninja.goofyahead.people.use_cases.get_people_with_company.models.Company;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("company-service")
public interface CompanyClient {
    @GetMapping(value = "/company?employee={employee}")
    Company getCompany(@PathVariable String employee);
}
