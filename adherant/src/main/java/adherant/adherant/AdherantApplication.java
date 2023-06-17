package adherant.adherant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan({"com.badjo.services", "com.badjo.controller"})
@EntityScan("com.badjo.model")
@EnableJpaRepositories("com.badjo.dao")
@SpringBootApplication
public class AdherantApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdherantApplication.class, args);
	}

}
