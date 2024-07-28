# Person Builder Pattern Demo

This  demonstrates the use of the Builder Pattern in Java to create `Person` objects with optional fields. The Builder Pattern helps in creating complex objects by providing a clear and readable way to set various properties step by step.

## Features

- **Create Person with Optional Fields:** Create a `Person` object with required fields (first name, last name) and optional fields (middle name, phone number).
- **Fluent Interface:** Use a fluent interface for setting optional fields.

## Design Pattern Used

**Builder Pattern:** Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

## Classes

### Person Class

- **Person:** Represents a person with first name, last name, middle name, and phone number.
- **PersonBuilder:** Nested static builder class for constructing `Person` objects.

## Files

1. **Person.java:** Class representing the `Person` and the nested `PersonBuilder` class.
2. **BuilderPatternDemo.java:** The main class demonstrating the usage of the `PersonBuilder`.
