package InterfaceTaxable;



// Main class DriverMain
public class DriverMain {
    public static void main(String[] args) {
        //employee information
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Employee Salary:");
        double salary = sc.nextDouble();

        //Employee object and calculate tax
        Employee employee = new Employee(empId, name, salary);
        employee.calcTax();

        //product information
        System.out.println("\nEnter Product ID:");
        int pid = sc.nextInt();

        System.out.println("Enter Product Price:");
        double price = sc.nextDouble();

        System.out.println("Enter Product Quantity:");
        int quantity = sc.nextInt();

        //Product object and calculate tax
        Product product = new Product(pid, price, quantity);
        product.calcTax();

        sc.close();
    }
}