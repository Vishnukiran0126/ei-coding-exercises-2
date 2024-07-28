import java.util.ArrayList;
import java.util.List;

// Component Interface
interface Employee {
    void showEmployeeDetails();
}

// Leaf class representing individual contributors
class Developer implements Employee {
    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " (" + position + ")");
    }
}

// Leaf class representing individual contributors
class Designer implements Employee {
    private String name;
    private long empId;
    private String position;

    public Designer(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " (" + position + ")");
    }
}

// Composite class representing managers
class Manager implements Employee {
    private List<Employee> employeeList = new ArrayList<Employee>();

    private String name;
    private long empId;
    private String position;

    public Manager(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " (" + position + ")");
        for (Employee emp : employeeList) {
            emp.showEmployeeDetails();
        }
    }
}

// Usage
// Usage
public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee dev1 = new Developer(100, "John Doe", "Pro Developer");
        Employee dev2 = new Developer(101, "Jane Doe", "Entry Developer");
        Employee des1 = new Designer(102, "Emily", "Senior Designer");

        Manager engManager = new Manager(200, "Mike", "Engineering Manager");
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

        Manager genManager = new Manager(300, "Robert", "General Manager");
        genManager.addEmployee(engManager);
        genManager.addEmployee(des1);

        System.out.println("Manager Details:");
        genManager.showEmployeeDetails();
    }
}