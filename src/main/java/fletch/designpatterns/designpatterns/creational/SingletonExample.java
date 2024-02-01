package fletch.designpatterns.designpatterns.creational;

public class SingletonExample {

    private static final SingletonExample INSTANCE = new SingletonExample();

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        return INSTANCE;
    }
}
