// Notification Interface
interface Notification {
    void notifyUser();
}

// Concrete classes implementing Notification
class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an email notification");
    }
}

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}

// Factory Class
class NotificationFactory {
    public Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        switch (type) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            default:
                return null;
        }
    }
}

// Usage
public class FactoryMethodPatternDemo {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification notification1 = factory.createNotification("EMAIL");
        notification1.notifyUser();  // Sending an email notification

        Notification notification2 = factory.createNotification("SMS");
        notification2.notifyUser();  // Sending an SMS notification
    }
}
