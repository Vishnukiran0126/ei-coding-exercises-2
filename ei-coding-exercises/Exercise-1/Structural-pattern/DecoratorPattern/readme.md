# Shape Decorator Pattern Demo

This demonstrates the use of the Decorator Pattern in Java to dynamically add functionality to objects. The example focuses on adding a red border to different shapes (Circle and Rectangle).

## Features

- **Draw Shapes:** Draw basic shapes like Circle and Rectangle.
- **Add Red Border:** Use the decorator pattern to add a red border to shapes.

## Design Pattern Used

**Decorator Pattern:** Allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class.

## Classes

### Shape Interface

- **Shape:** Interface with the method `draw()` that needs to be implemented by concrete shape classes.

### Concrete Shape Classes

- **Circle:** Implements the `Shape` interface to draw a circle.
- **Rectangle:** Implements the `Shape` interface to draw a rectangle.

### Decorator Classes

- **ShapeDecorator:** Abstract class implementing the `Shape` interface and containing a reference to a `Shape` object.
- **RedShapeDecorator:** Concrete decorator class extending `ShapeDecorator` to add a red border to shapes.

## Files

1. **Shape.java:** Interface defining the `draw()` method.
2. **Circle.java:** Concrete class for drawing a circle.
3. **Rectangle.java:** Concrete class for drawing a rectangle.
4. **ShapeDecorator.java:** Abstract decorator class for shapes.
5. **RedShapeDecorator.java:** Concrete decorator class for adding a red border.
6. **DecoratorPatternDemo.java:** The main class demonstrating the usage of the decorator pattern.
