import java.util.Scanner;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        int firstSalary = sc.nextInt();
        sc.nextLine();

        String secondName = sc.nextLine();
        int secondSalary = sc.nextInt();

        Employee employee = new Employee(firstName, firstSalary );

        System.out.println("Employee: " + employee.name + ", Salary: " + employee.salary);

        employee = new Employee(secondName,secondSalary);

        System.out.println("Employee: " + employee.name + ", Salary: " + employee.salary);

        System.gc();

        System.out.println("Garbage Collection requested");

        sc.close();
    }
}