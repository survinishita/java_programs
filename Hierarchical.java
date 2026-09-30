class Employee{
    void work() {System.out.println("Emoloyee works");}
}

class Developer extends Employee{
    void code() {System.out.println("Developer writes code");}
}

class Tester extends Employee{
    void test() {System.out.println("Tester finds bugs");}
}

public class Hierarchical {
    public static void main(String[] args) {
        Developer d=new Developer();
        d.work();
        d.code();
        Tester t=new Tester();
        t.work();
        t.test();
        
    }
}