import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeWriter {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John Doe", 50000);
        Employee emp2 = new Employee(2, "Jane Doe", 60000);

        try (FileOutputStream fos = new FileOutputStream("emp.doc");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(emp1);
            oos.writeObject(emp2);
            System.out.println("Employee objects written to emp.doc");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
