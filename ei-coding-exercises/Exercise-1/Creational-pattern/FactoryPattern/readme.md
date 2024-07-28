# Notification Factory Method Pattern Demo

This project demonstrates the use of the Factory Method Pattern in Java to create different types of notifications (Email and SMS). The Factory Method Pattern allows the creation of objects without specifying the exact class of object that will be created.

## Features

- **Email Notification:** Create and send an email notification.
- **SMS Notification:** Create and send an SMS notification.

## Design Pattern Used

**Factory Method Pattern:** Defines an interface for creating an object but lets subclasses alter the type of objects that will be created.

## Classes

### Notification Interface

- **Notification:** Interface with the method `notifyUser()` that needs to be implemented by concrete notification classes.

### Concrete Notification Classes

- **EmailNotification:** Implements `Notification` to send email notifications.
- **SMSNotification:** Implements `Notification` to send SMS notifications.

### Factory Class

- **NotificationFactory:** Factory class to create instances of `Notification` based on the specified type.

## Files

1. **Notification.java:** Interface defining the `notifyUser()` method.
2. **EmailNotification.java:** Concrete class for email notifications.
3. **SMSNotification.java:** Concrete class for SMS notifications.
4. **NotificationFactory.java:** Factory class for creating notification objects.
5. **FactoryMethodPatternDemo.java:** The main class demonstrating the usage of the factory to create and send notifications.



