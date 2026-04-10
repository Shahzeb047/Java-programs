// Parent Class
class Member {

    // Data Members
    String First_Name;
    String Last_Name;
    String CNIC;
    int Age;
    String Phone_Number;
    String Address;
    double Salary;

    // Method to print salary
    void printSalary() {
        System.out.println("Salary: " + Salary);
    }
}

// Child Class 1
class Employee extends Member {
    // No extra code needed (inherits everything from Member)
}

// Child Class 2
class Manager extends Member {
    // No extra code needed (inherits everything from Member)
}

// Main Class
public class Lab7Second {
    public static void main(String[] args) {

        // Creating Employee Object
        Employee emp = new Employee();
        emp.First_Name = "Ali";
        emp.Last_Name = "Khan";
        emp.CNIC = "12345-1234567-1";
        emp.Age = 25;
        emp.Phone_Number = "03001234567";
        emp.Address = "Karachi";
        emp.Salary = 50000;

        // Creating Manager Object
        Manager mgr = new Manager();
        mgr.First_Name = "Ahmed";
        mgr.Last_Name = "Raza";
        mgr.CNIC = "98765-7654321-2";
        mgr.Age = 35;
        mgr.Phone_Number = "03111234567";
        mgr.Address = "Lahore";
        mgr.Salary = 80000;

        // Display Employee Salary
        System.out.println("Employee Details:");
        emp.printSalary();

        System.out.println();

        // Display Manager Salary
        System.out.println("Manager Details:");
        mgr.printSalary();
    }
}