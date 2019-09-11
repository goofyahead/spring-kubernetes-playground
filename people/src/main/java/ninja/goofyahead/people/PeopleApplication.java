package ninja.goofyahead.people;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PeopleApplication {

    public static void main (String [] args){
        SpringApplication.run(PeopleApplication.class, args);
    }

}
