package fr.lecroc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by Croc on 27/10/2015.
 */
@SpringBootApplication
public class ApplicationEndpoints extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(ApplicationEndpoints.class, args);
    }
}
