package decorator;

/**
 * Created by Kajo on 7/2/2016.
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
        setRedBorder(shapeDecorator);
    }

    private void setRedBorder(Shape shapeDecorator) {
        System.out.println("Border Color: Red!");
    }
}
