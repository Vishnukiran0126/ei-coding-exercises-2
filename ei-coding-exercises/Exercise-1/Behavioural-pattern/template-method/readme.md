# Beverage Preparation Template Method Pattern Demo

This demonstrates the use of the Template Method Pattern in Java to manage the preparation of beverages like tea and coffee. The template method defines the skeleton of an algorithm, with steps that can be overridden by subclasses.

## Features

- **Prepare Tea:** Boil water, steep tea, pour into cup, and add lemon.
- **Prepare Coffee:** Boil water, drip coffee through filter, pour into cup, and add sugar and milk.

## Design Pattern Used

**Template Method Pattern:** Defines the skeleton of an algorithm in an operation, deferring some steps to subclasses. This pattern lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## Classes

### Abstract Class

- **Beverage:** Defines the template method `prepareRecipe()` and abstract methods for brewing and adding condiments.

### Concrete Classes

- **Tea:** Implements the brewing and adding condiments steps for tea.
- **Coffee:** Implements the brewing and adding condiments steps for coffee.

## Files

1. **Beverage.java:** Abstract class defining the template method.
2. **Tea.java:** Concrete class for tea preparation.
3. **Coffee.java:** Concrete class for coffee preparation.
4. **TemplateMethodPatternDemo.java:** The main class demonstrating the preparation of tea and coffee.

