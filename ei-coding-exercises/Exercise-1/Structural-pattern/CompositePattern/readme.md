# Employee Composite Pattern Demo

This project demonstrates the use of the Composite Pattern in Java to represent a hierarchy of employees in an organization. The Composite Pattern allows you to treat individual objects and compositions of objects uniformly.

## Features

- **Add Employees:** Add individual contributors (developers and designers) and managers.
- **Remove Employees:** Remove individual contributors and managers.
- **Show Employee Details:** Display details of individual employees and hierarchical structures of employees.

## Design Pattern Used

**Composite Pattern:** Composes objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

## Classes

### Employee Interface

- **Employee:** Defines the interface for all employees, providing a method to show employee details.

### Leaf Classes

- **Developer:** Represents an individual contributor who is a developer.
- **Designer:** Represents an individual contributor who is a designer.

### Composite Class

- **Manager:** Represents a manager who can have other employees (developers, designers, and other managers) reporting to them.

## Files

1. **Employee.java:** Interface defining the `showEmployeeDetails()` method.
2. **Developer.java:** Concrete class for developers.
3. **Designer.java:** Concrete class for designers.
4. **Manager.java:** Composite class for managers.
5. **CompositePatternDemo.java:** The main class demonstrating the usage of the composite pattern to manage employee hierarchies.

