package ninja.goofyahead.companies.use_cases.get_companies.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("people-service")
public interface PeopleClient {

    @GetMapping("/people/3")
    String getPerson();
}
