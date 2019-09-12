package ninja.goofyahead.companies.use_cases.get_companies.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "greetings")
public class ClientConfig {

    private String message = "Message from backend is: Hello";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}