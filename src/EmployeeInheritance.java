import java.util.Scanner;

class Employee {
    int age;
    String phoneNumber;
    float salary;
    String name;
    String address;

    void printSalary() {
        System.out.println("Salary : " + salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class EmployeeInheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Officer o1 = new Officer();
        o1.name = sc.nextLine();
        o1.age = sc.nextInt();
        sc.nextLine();
        o1.phoneNumber = sc.nextLine();
        o1.address = sc.nextLine();
        o1.salary = sc.nextFloat();
        sc.nextLine();
        o1.specialization = sc.nextLine();

        Manager m1 = new Manager();
        m1.name = sc.nextLine();
        m1.age = sc.nextInt();
        sc.nextLine();
        m1.phoneNumber = sc.nextLine();
        m1.address = sc.nextLine();
        m1.salary = sc.nextFloat();
        sc.nextLine();
        m1.department = sc.nextLine();

        System.out.println("Officer:");
        System.out.println(o1.name);
        System.out.println(o1.age);
        System.out.println(o1.phoneNumber);
        System.out.println(o1.address);
        System.out.println(o1.salary);
        System.out.println(o1.specialization);

        System.out.println("Manager:");
        System.out.println(m1.name);
        System.out.println(m1.age);
        System.out.println(m1.phoneNumber);
        System.out.println(m1.address);
        System.out.println(m1.salary);
        System.out.println(m1.department);

        sc.close();
    }
}
