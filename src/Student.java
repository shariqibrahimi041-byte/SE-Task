public class Student {

    // Fields
    String name;
    int age;
    int rollNo;
    double marks;


    public Student(String name, int age, int rollNo, double marks) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.marks = marks;
    }


    public Student() {
        this.name = "Maidha";
        this.age = 19;
        this.rollNo = 40;
        this.marks = 60;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + getGrade());
        System.out.println("====================");
    }

    // Grade method
    public String getGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "Fail";
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }


    public static void main(String[] args) {
        System.out.println("=== STUDENT MANAGEMENT SYSTEM ===");


        System.out.println("\n4. Default Student:");
        Student s4 = new Student();
        s4.setName("Maidha");
        s4.setMarks(95.0);
        s4.displayInfo();

        System.out.println("\n=== Program Complete ===");
    }
}