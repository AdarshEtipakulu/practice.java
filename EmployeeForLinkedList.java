 import java.util.LinkedList;

class Employee {
    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Dept: " + department;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> list = new LinkedList<>();

        list.add(new Employee(101, "Alice", "Engineering"));
        list.add(new Employee(102, "Bob", "Design"));
        list.add(new Employee(103, "Charlie", "Marketing"));
        System.out.println("Employee List:");
        for (Employee emp : list) {
            System.out.println(emp);
        }
         
    }
}
