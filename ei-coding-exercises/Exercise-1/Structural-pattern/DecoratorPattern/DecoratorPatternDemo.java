// Shape Interface
interface Shape {
    void draw();
}

// Concrete class implementing Shape interface
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}

// Concrete class implementing Shape interface
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}

// Abstract Decorator class implementing Shape interface
abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}

// Concrete Decorator class extending ShapeDecorator to add color functionality
class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}

// Usage
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border:");
        circle.draw();

        System.out.println("\nCircle with red border:");
        redCircle.draw();

        System.out.println("\nRectangle with red border:");
        redRectangle.draw();
    }
}
