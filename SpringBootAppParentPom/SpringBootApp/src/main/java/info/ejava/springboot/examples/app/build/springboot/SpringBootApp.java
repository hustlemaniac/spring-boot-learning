package info.ejava.springboot.examples.app.build.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// annotate as spring boot app
@SpringBootApplication

public class SpringBootApp {
    public static final void main(String...args) {
        System.out.println("Running SpringApplication");
        // Initiate Spring applicaton bootstrap by invoking SpringApplication.run() and passing a) application class and b) args passed into main()
        SpringApplication.run(SpringBootApp.class, args);
        System.out.println("Done SpringApplication");
    }
}
