package ninja.goofyahead.companies;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CompaniesApplication {

    private static Logger log = LoggerFactory.getLogger(CompaniesApplication.class);

    public static void main (String args []){
        log.info("Running version: " + System.getenv("DEPLOYMENT_VERSION"));
        SpringApplication.run(CompaniesApplication.class, args);
    }
}
