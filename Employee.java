package InterfaceTaxable;
// Interface Taxable
interface Taxable {
    double salesTax = 0.07;   // Sales tax is 7%
    double incomeTax = 0.105; // Income tax is 10.5%

    void calcTax();
}
// Employee class
class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        double tax = salary * incomeTax;
        System.out.println("Income Tax for Employee " + name + " (ID: " + empId + "): " + tax);
    }
}
