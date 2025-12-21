import java.util.*;

class Student {
    private String name;
    private String rollNo;
    private String email;

    public Student(String name, String rollNo, String email) {
        super();
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
    }

    public String getname() {
        return name;
    }

    public String getrollNo() {
        return rollNo;
    }

    public String getemail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", RollNo: " + rollNo + ", Email: " + email;
    }
}

public class ExampleForLinkedHashSet1 {
    public static void main(String[] args) {
        Student s1 = new Student("balu", "a502", "balu@gmail.com");
        Student s2 = new Student("akhil", "a501", "akhil@gmail.com");

        LinkedHashSet<Student> lhs = new LinkedHashSet<Student>();
        lhs.add(s1);
        lhs.add(s2);

        for (Object obj : lhs) {
            System.out.println(obj);
        }
    }
}
