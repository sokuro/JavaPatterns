package singleton;

/**
 * Created by Kajo on 7/2/2016.
 *
 * Singleton Pattern involves a single class which creates only 1 single object.
 * This object is accessible directly without it's instantiation.
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    // make the constructor private so it can't be instantiated
    private SingleObject() {}

    // get the only one object available
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Show the message!");
    }
}
