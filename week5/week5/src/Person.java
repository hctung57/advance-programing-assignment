/*
UML
  +--------------+
     |    Person    |
     +--------------+
     | - name       |
     | - address    |
     | - phoneNumber|
     | - email      |
     +--------------+
             ^
             |
     +--------------+
     |    Student   |
     +--------------+
     | - status     |
     +--------------+
             ^
             |
     +--------------+
     |   Employee   |
     +--------------+
     | - office     |
     | - salary     |
     | - startDate  |
     +--------------+
             ^
             |
     +--------------+
     |   Lecturer   |
     +--------------+
     | - officeHours|
     | - title      |
     +--------------+
             ^
             |
     +--------------+
     |    Staff     |
     +--------------+
     | - rank       |
     +--------------+
 */
public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person() {}

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Phone Number: " + phoneNumber + ", Email: " + email;
    }

    public static void main(String[] args) {
        // create a Person object
        Person person = new Person("John Smith", "123 Main St.", "555-555-1234", "john.smith@email.com");
        System.out.println(person.toString());

        // create a Student object
        Student student = new Student("Jane Doe", "456 Oak St.", "555-555-5678", "jane.doe@email.com", 3);
        System.out.println(student.toString());

        // create an Employee object
        Employee employee = new Employee("Bob Johnson", "789 Elm St.", "555-555-9012", "bob.johnson@email.com",
                "ABC123", 50000.00, "01/01/2022");
        System.out.println(employee.toString());

        // create a Lecturer object
        Lecturer lecturer = new Lecturer("Mary Brown", "101 Maple St.", "555-555-3456", "mary.brown@email.com",
                "DEF456", 75000.00, "01/01/2020", 40, "Professor");
        System.out.println(lecturer.toString());

        // create a Staff object
        Staff staff = new Staff("Tom Green", "222 Pine St.", "555-555-7890", "tom.green@email.com",
                "GHI789", 40000.00, "01/01/2023", "Manager");
        System.out.println(staff.toString());

    }
}