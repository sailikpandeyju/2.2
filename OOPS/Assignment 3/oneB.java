// 1. Each department s described by dept code (unique), dept name, location. Each employee is described
// by emp code (unique), emp name , basic and dept code. Maintain list of departments and list of
// employees such that one can:
// i) add employee (emp code unique and dept code must exist), add department (dept code unique)
// ii) display the details for a given emp code along with corresponding department details.
// iii) display details of all employees
// iv) find total basic pay for a department
// v) remove an employee (given an emp code)
// vi) modify basic of an employee
// vii) sort the employee list -- according to basic in descending order, according to dept code, according to
// emp code
// Design and implement the classes. Do the same once considering the list as an array like collection and
// again as an linked list like collection.

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//******Linked list implementation*******/

class Department {
    private int departmentCode;
    private String departmentName;
    private String departmentLocation;

    Department() {
    }

    Department(int departmentCode, String departmentName, String departmentLocation) {
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.departmentLocation = departmentLocation;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }
}

class Employee {
    private int emplyoeeCode;
    private String emplyoeeName;
    private float basicpay;
    private int departmentCode;

    Employee() {
    }

    Employee(int emplyoeeCode, String emplyoeeName, float basicpay, int departmentCode) {
        this.emplyoeeCode = emplyoeeCode;
        this.emplyoeeName = emplyoeeName;
        this.basicpay = basicpay;
        this.departmentCode = departmentCode;
    }

    // setter methods
    public void setBasicPay(float basicpay) {
        this.basicpay = basicpay;
    }

    // getter methods
    public int getEmployeeCode() {
        return emplyoeeCode;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public float getBasicPay() {
        return basicpay;
    }

    public void display() {
        System.out.println("Employee Code: " + emplyoeeCode);
        System.out.println("Employee Name: " + this.emplyoeeName);
        System.out.println("Basic Pay: " + basicpay);
        System.out.println("Department Code: " + departmentCode);
    }

}

class University {
    private LinkedList<Department> d;
    private LinkedList<Employee> e;
    private int numberOfDepartment;
    private int numberOfEmployee;

    University() {
        d = new LinkedList<Department>();
        e = new LinkedList<Employee>();
        this.numberOfDepartment = 0;
        this.numberOfEmployee = 0;
    }

    public void addEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id");
        int emplyoeeCode = sc.nextInt();
        int notFound = 1;
        for (int i = 0; i < numberOfEmployee; i++) {
            if (e.get(i).getEmployeeCode() == emplyoeeCode) {
                notFound = 0;
                break;
            }
        }

        if (notFound == 0) {
            System.out.println("Please enter a unique employee code");

            return;
        }
        System.out.println("Enter the name of the employee");
        sc.nextLine();
        String employeeName = sc.nextLine();
        System.out.println("Enter the basic pay of the employee");
        float basicpay = sc.nextFloat();
        System.out.println("Enter the department code of the employee");
        int departmentCode = sc.nextInt();
        int found = 0;
        for (int i = 0; i < numberOfDepartment; i++) {
            if (d.get(i).getDepartmentCode() == departmentCode) {
                found = 1;
                break;
            }
        }

        if (found == 0) {
            System.out.println("Please enter a valid department code");

            return;
        }

        Employee temp = new Employee(emplyoeeCode, employeeName, basicpay, departmentCode);
        e.add(temp);
        this.numberOfEmployee += 1;
        System.out.println("Employee added successfully");
    }

    public void addDepartment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the department code:");
        int departmentCode = sc.nextInt();
        int notFound = 1;
        for (int i = 0; i < numberOfDepartment; i++) {
            if (d.get(i).getDepartmentCode() == departmentCode) {
                notFound = 0;
                break;
            }
        }

        if (notFound == 0) {
            System.out.println("Please enter a unique department code");

            return;
        }
        System.out.println("Enter the name of the department:");
        String departmentname = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the location of the department:");
        String departmentLocation = sc.nextLine();

        Department temp = new Department(departmentCode, departmentname, departmentLocation);
        d.add(temp);
        this.numberOfDepartment += 1;

        System.out.println("Department added successfully");
    }

    public void displayEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee code");
        int emplyoeeCode = sc.nextInt();
        System.out.println("Enter the department code");
        int departmentCode = sc.nextInt();

        int found = 0;
        for (int i = 0; i < numberOfEmployee; i++) {
            if (e.get(i).getEmployeeCode() == emplyoeeCode && e.get(i).getDepartmentCode() == departmentCode) {
                found = 1;
                e.get(i).display();
            }
        }

        if (found == 0) {
            System.out.println("No such employee found");
        }

    }

    public void displayAllEmployee() {
        for (int i = 0; i < numberOfEmployee; i++) {
            e.get(i).display();
        }
    }

    public void totalBasicPay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the department code");
        int departmentCode = sc.nextInt();
        float totalBasicPay = 0;
        int found = 0;

        for (int i = 0; i < numberOfEmployee; i++) {
            if (e.get(i).getDepartmentCode() == departmentCode) {
                found = 1;
                totalBasicPay += e.get(i).getBasicPay();
            }
        }
        if (found == 0) {
            System.out.println("No employee for this department found");

            return;

        }
        System.out.println("Total Basic Pay: " + totalBasicPay);

    }

    public void removeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee code");
        int employeeCode = sc.nextInt();
        int found = 0;
        for (int i = 0; i < numberOfEmployee; i++) {
            if (e.get(i).getEmployeeCode() == employeeCode) {
                found = 1;
                e.remove(i);
                this.numberOfEmployee -= 1;
                System.out.println("Remove successful");

                return;
            }
        }
        if (found == 0) {
            System.out.println("No such employee found");
        }

    }

    public void modifyBasic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee code");
        int employeeCode = sc.nextInt();
        int found = 0;
        for (int i = 0; i < numberOfEmployee; i++) {
            if (e.get(i).getEmployeeCode() == employeeCode) {
                System.out.println("Enter the new basic pay of the employee");
                float basicpay = sc.nextFloat();
                e.get(i).setBasicPay(basicpay);

                return;
            }
        }
        if (found == 0) {
            System.out.println("No such employee found");
        }

    }

    public void sortEmployeeBasic() {
        Collections.sort(e, new MyComparator1());
        System.out.println("Employee list sorted based on their basic pay");
    }

    public void sortEmployeeDepartmentCode() {
        Collections.sort(e, new MyComparator2());
        System.out.println("Employee list sorted based on their department code");
    }

    public void sortEmployeeCode() {
        Collections.sort(e, new MyComparator3());
        System.out.println("Employee list sorted based on their emploee code");
    }
}

class MyComparator1 implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Float.compare(e2.getBasicPay(), e1.getBasicPay());
    }
}

class MyComparator2 implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Float.compare(e2.getDepartmentCode(), e1.getDepartmentCode());
    }
}

class MyComparator3 implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Float.compare(e2.getEmployeeCode(), e1.getEmployeeCode());
    }
}

public class oneB {
    public static void main(String args[]) {
        University u = new University();
        int n = 1;
        while (n != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 to add an employee");
            System.out.println("Enter 2 to add a department");
            System.out.println("Enter 3 to display details of a particular employee");
            System.out.println("Enter 4 to display details of all the employees");
            System.out.println("Enter 5 to display the total basic pay of a department");
            System.out.println("Enter 6 to remove an employee");
            System.out.println("Enter 7 to modify basic pay of an employee");
            System.out.println("Enter 8 to sort the employee list of the basis of their basic pay");
            System.out.println("Enter 9 to sort the employee list based on their departmental code");
            System.out.println("Enter 10 to sort the employee list based on their employee code");
            System.out.println("Enter 0 to exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    u.addEmployee();
                    break;
                case 2:
                    u.addDepartment();
                    break;
                case 3:
                    u.displayEmployee();
                    break;
                case 4:
                    u.displayAllEmployee();
                    break;
                case 5:
                    u.totalBasicPay();
                    break;
                case 6:
                    u.removeEmployee();
                    break;
                case 7:
                    u.modifyBasic();
                    break;
                case 8:
                    u.sortEmployeeBasic();
                    break;
                case 9:
                    u.sortEmployeeDepartmentCode();
                    break;
                case 10:
                    u.sortEmployeeCode();
                    break;
                default:
                    break;
            }
        }
    }
}