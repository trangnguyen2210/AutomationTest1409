package Java_Day4.Java_HW_Day4;

public class Employee {
    /*Create Employee class contains: private variables employee_id, employee_name, and employee_salary.
  Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable only.
  Create another Developer class to instance Employee, set and get all Employee’s attributes and print Developer information.
  Note: Analyse and comment Salary value of one developer*/
    private long employee_id;
    private String employee_name;
    private double employee_salary = 5000000;

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public double getEmployee_salary() {
        return employee_salary;
    }
}


