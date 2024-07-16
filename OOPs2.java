//https://www.javatpoint.com/java-constructor

public class OOPs2 {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "BG";
        s1.RollNo = 123;
        s1.password = "abcd";

        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.RollNo);
        System.out.println(s2.password);

    }
}

class Student {

    String name;
    int RollNo;
    String password;

    // Constructor
    Student() {

        System.out.println("Constructor is called at Object Creation");

    }

    //copy Constructor
    Student(Student s1) {

        this.name = s1.name;
        this.RollNo = s1.RollNo;
        this.password = "xyz";
        // or
        // this.password= s1.password;

    }
}
