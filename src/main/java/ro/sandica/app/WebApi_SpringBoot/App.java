package ro.sandica.app.WebApi_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"ro.sandica.app.Helpers"})
public class App 
{
	 public static void main(String[] args) {
		 SpringApplication app = new SpringApplication(App.class);
		 app.run(args);
	        
	    }
}
