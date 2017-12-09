package udea.odontologia.ServicioFactura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicioFacturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioFacturaApplication.class, args);
	}
}
