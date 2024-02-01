package fletch.designpatterns.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {

        SpringApplication.run(DesignPatternsApplication.class, args);
        if(args.length > 1) {
            System.out.println("Only one argument allowed.");
        } else if(args.length < 1) {
            System.out.println("Please provide an argument.");
        } else {
            Executor executor = new Executor();
            executor.execute(args[0]);
        }
    }

}
