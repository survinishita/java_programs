class Student{
    String name;
    int rollNo;
    String branch;
    Student(String name, int rollNo, String branch){
        this.name=name;
        this.rollNo=rollNo;
        this.branch=branch;
    }
    void display() {
        System.out.println("Student Name: " +name);
        System.out.println("Roll Number: " +rollNo);
        System.out.println("Branch: " +branch);
    }
}
public class Main{
    public static void main(String[] args) {
        Student s1 = new Student(
            "Rahul",
            101,
            "CSE"

        );
            
        
        Student s2 = new Student(
            "Anjali",
            102,
            "ECE"

        );

        s1.display();
        System.out.println();
        s2.display();

    } 
}