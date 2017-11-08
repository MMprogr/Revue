package pl.mmprogr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ContextConfiguration;

@SpringBootApplication
@SpringBootConfiguration
@ContextConfiguration
public class Revue2Application {

	public static void main(String[] args) {
		SpringApplication.run(Revue2Application.class, args);
	}
}
