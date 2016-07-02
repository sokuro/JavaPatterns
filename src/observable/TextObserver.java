package observable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Kajo on 7/2/2016.
 */
public class TextObserver implements Observer {

    private ObservableValue ov = null;

    public TextObserver(ObservableValue ov) {
        this.ov = ov;
    }

    // condition: is it the right observable that is the observer
    // observing. If so show it's new value.
    public void update(Observable obs, Object obj) {
        if (obs == ov) {
            System.out.println(ov.getValue());
        }
    }
}
