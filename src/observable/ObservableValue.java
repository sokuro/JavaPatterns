package observable;

import java.util.Observable;

/**
 * Created by Kajo on 7/2/2016.
 *
 * Observer/Observable pattern is used when there are many
 * one-to-many relationships between objects.
 */
public class ObservableValue extends Observable {

    private int n = 0;

    // the internal state of the model is captured by n
    public ObservableValue(int n) {
        this.n = n;
    }

    // if n changes, notify Observers
    public void setValue(int n) {
        this.n = n;
        setChanged();
        notifyObservers();
    }

    public int getValue() {
        return n;
    }
}
