package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

public class Main {
    public Main() {

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        /*
            TODO: Create instances of each role and pass them (as Employee) to printWage(...) to verify polymorphism.
            TIP: Upcast to Employee and keep fields private/protected as appropriate.
        */
        Employee e1 = new Employee(20, 8);
        Employee e2 = new Programmer(25, 8, 10, 3);
        printWage("Regular Employee", e1);
        printWage("Programmer", e2);
    }

    public void printWage(String name, Employee e) {
        /*
            TODO: Once Employee.calculateDailySalary exists, print the salary for each employee.
            TIP: Use: System.out.println(\"Employee \" + name + \": salary = \" + e.calculateDailySalary());
        */
        System.out.println("Employee " + name + ": salary = " + e.calculateDailySalary());
    }
}
