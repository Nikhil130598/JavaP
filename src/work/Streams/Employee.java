package work.Streams;


import java.util.Locale;

public class Employee {

    private int empId;
    private String companyName;
    private double empSalary;

    public Employee(int empId,String companyName,double empSalary){

        this.empId = empId;
        this.companyName = companyName;
        this.empSalary = empSalary;
    }



    public int getEmpId(){
        return empId;
    }

    public String getCompanyName(){

        return companyName;
    }

    public double getEmpSalary(){

        return empSalary;
    }

    public String toString(){

        return empId + " " + companyName + " " + empSalary + " ";
    }


}
