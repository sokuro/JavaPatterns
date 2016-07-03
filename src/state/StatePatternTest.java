package state;

/**
 * Created by Kajo on 7/3/2016.
 */
public class StatePatternTest {

    public static void main(String[] args) {

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
