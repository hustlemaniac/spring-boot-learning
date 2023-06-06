package info.ejava.springboot.examples.app.build.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Arrays;
@Component
// Classes directly annotated with a @Component (or other annotation) indicates that
//Spring can instantiate instances of this class with no additional assistance from a @Bean factory.
//Components implementing CommandLineRunner interface get called after application
//initialization
public class AppCommand implements CommandLineRunner {
    //    Program arguments are passed to the run() method
    public void run(String... args) throws Exception {
        System.out.println("Component code says Hello " + Arrays.asList(args));
    }
}
