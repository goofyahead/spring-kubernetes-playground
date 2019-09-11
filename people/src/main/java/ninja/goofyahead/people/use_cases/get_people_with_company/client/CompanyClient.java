package ninja.goofyahead.people.use_cases.get_people_with_company.client;

import ninja.goofyahead.people.use_cases.get_people_with_company.models.Company;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("company-service")
public interface CompanyClient {

    @GetMapping(value = "/company/3")
    Company getCompany();
}
