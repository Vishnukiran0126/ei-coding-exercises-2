// Person class with a nested Builder class
class Person {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String phoneNumber;

    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Nested static builder class
    public static class PersonBuilder {
        private final String firstName;
        private final String lastName;
        private String middleName;
        private String phoneNumber;

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

// Usage
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Person person1 = new Person.PersonBuilder("John", "Doe")
            .middleName("Michael")
            .phoneNumber("123-456-7890")
            .build();

        Person person2 = new Person.PersonBuilder("Jane", "Doe")
            .build();

        System.out.println("Person 1: " + person1.getFirstName() + " " + person1.getMiddleName() + " " + person1.getLastName() + ", Phone: " + person1.getPhoneNumber());
        System.out.println("Person 2: " + person2.getFirstName() + " " + person2.getLastName());
    }
}
