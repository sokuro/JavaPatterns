package state;

/**
 * Created by Kajo on 7/3/2016.
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Start State");
        context.setState(this);
    }

    public String toString() {
        return "Start!\n";
    }
}
