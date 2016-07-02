package singleton;

/**
 * Created by Kajo on 7/2/2016.
 *
 * Testing Main method for the singleton pattern
 */
public class SingleObjectTest {

    public static void main(String[] args) {

        // trying to access the private constructor -> failed
        // SingleObject object = new SingleObject();
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
