package RMB.Extensio;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("RMB.Extensio")
@EnableJpaRepositories(basePackages = "RMB.Extensio")
public class ExtensioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExtensioApplication.class, args);
	}

}
