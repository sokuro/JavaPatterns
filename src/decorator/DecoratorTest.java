package decorator;

/**
 * Created by Kajo on 7/2/2016.
 */
public class DecoratorTest {

    public static void main(String[] args) {

        Shape circle =  new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Normal circle..");
        circle.draw();

        System.out.println("\nRed circle..");
        redCircle.draw();

        System.out.println("\nRed rectangle");
        redRectangle.draw();
    }
}
