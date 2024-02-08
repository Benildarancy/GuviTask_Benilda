package org.task3.src.Q2;

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
        double tax =0;
        if(empSalary<=200000)
            tax=0;
        else if(empSalary<=300000)
            tax=0.1*(empSalary-200000);
        else if(empSalary<=500000)
            tax=(0.2*(empSalary-300000))+(0.1*100000);
        else if(empSalary<=1000000)
            tax=(0.3*(empSalary-500000))+(0.2*200000)+(0.1*100000);
        else
            tax=(0.4*(empSalary-1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
        System.out.println("Income tax amount is "+tax);

    }
}
