package udea.odontologia.ServicioCentroCostos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicioCentroCostosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioCentroCostosApplication.class, args);
	}
}
