package fletch.designpatterns.designpatterns;

import fletch.designpatterns.designpatterns.creational.SingletonExample;
import org.springframework.stereotype.Component;


@Component
public class Executor {

    public void execute(final String designPattern) {

        try {
            final String lcName = designPattern.toLowerCase();
            switch(lcName) {
                case "singleton" -> startSingletonExample();
                default -> System.out.println("Design Pattern not found.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    private void startSingletonExample() {
        SingletonExample singletonExample1 = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();
        System.out.println("first object:  " + singletonExample1);
        System.out.println("second object: " + singletonExample2);
    }
}
