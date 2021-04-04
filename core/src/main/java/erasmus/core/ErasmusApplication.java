package erasmus.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "erasmus.persistence")
@EntityScan(basePackages = "erasmus.domain")
@ComponentScan(basePackages = "erasmus.persistence")
public class ErasmusApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErasmusApplication.class, args);
    }

}