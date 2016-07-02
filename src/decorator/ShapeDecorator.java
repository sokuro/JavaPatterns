package decorator;

/**
 * Created by Kajo on 7/2/2016.
 */
public abstract class ShapeDecorator implements Shape {

    public Shape shapeDecorator;

    public ShapeDecorator(Shape shapeDecorator) {
        this.shapeDecorator = shapeDecorator;
    }

    public void draw() {
        shapeDecorator.draw();
    }
}
