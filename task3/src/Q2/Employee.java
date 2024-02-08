package Q2;

public class Employee implements Taxable{
    int empId;
    String empName;
    Double empSalary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    public Employee(int empId, String empName, Double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;


    }
    @Override
    public void calcTax() {
        Double tax = empSalary * 10.5;
        System.out.println(tax);

    }
}
