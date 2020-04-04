package module;

public class Employee {
    private String first_name;
    private String last_name;
    private String hire_date;
    private String dept_name;
    private Integer salary;


    public Employee(String first_name, String last_name, String hire_date, String dept_name, Integer salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.hire_date = hire_date;
        this.dept_name = dept_name;
        this.salary = salary;
    }

    public String getFirstname() {
        return first_name;
    }

    public String getLastname() {
        return last_name;
    }

    public String getHiredate() {
        return hire_date;
    }

    public String getDeptname() {
        return dept_name;
    }

    public Integer getSalary() {
        return salary;
    }
}
