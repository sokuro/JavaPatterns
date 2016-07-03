package state;

/**
 * Created by Kajo on 7/3/2016.
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Stop State");
        context.setState(this);
    }

    public String toString() {
        return "Stop!\n";
    }
}
