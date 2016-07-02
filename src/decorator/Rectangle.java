package decorator;

/**
 * Created by Kajo on 7/2/2016.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: rectangle");
    }
}
