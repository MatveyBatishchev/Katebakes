package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.example.katebakes.*"})
@EntityScan("com.example.katebakes.models.domain")
@EnableJpaRepositories("com.example.katebakes.repos")
public class KatebakesApplication {

    public static void main(String[] args) {
        SpringApplication.run(KatebakesApplication.class, args);
    }

}
