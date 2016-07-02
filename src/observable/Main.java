package observable;

/**
 * Created by Kajo on 7/2/2016.
 *
 * A program notifies an observable object that an observer wishes to be
 * notified about changes in it's state by calling the <<addObserver()>>
 * method. This method adds the observer to the internal list of observers
 * that should be notified if the state of the observable changes.
 */
public class Main {

    public Main() {
        ObservableValue ov = new ObservableValue(0);
        TextObserver to = new TextObserver(ov);
        ov.addObserver(to);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
