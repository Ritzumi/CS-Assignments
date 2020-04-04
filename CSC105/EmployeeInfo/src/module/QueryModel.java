package module;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class QueryModel {
    Connection conn;
    PreparedStatement preparedStatement;

    public QueryModel() throws Exception {
        conn = DBconnection.getMSSQLConnection();
    }

    public ResultSet getEmployee(String firstname, String lastname){
        try {
            String query = String.format("SELECT * FROM employees.employees WHERE first_name LIKE '%s' AND last_name LIKE '%s' ORDER BY first_name", firstname, lastname);
            System.out.println(query);
            preparedStatement = conn.prepareStatement(query);
            ResultSet result = preparedStatement.executeQuery();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet getEmployeeInfo(String fname, String lname) {
        try {
            System.out.println("Checkpoint: Reach methods");
            String query = String.format("SELECT employees.first_name, employees.last_name, employees.hire_date, d.dept_name, s.salary " +
                    "FROM employees.employees " +
                    "JOIN salaries s ON employees.emp_no = s.emp_no " +
                    "JOIN dept_emp de ON employees.emp_no = de.emp_no " +
                    "JOIN departments d ON de.dept_no = d.dept_no " +
                    "WHERE first_name LIKE '%s' AND last_name LIKE '%s' " +
                    "GROUP BY employees.first_name, employees.last_name, employees.hire_date, d.dept_name, s.salary " +
                    "ORDER BY s.salary DESC ", fname, lname);
            preparedStatement = conn.prepareStatement(query);
            ResultSet result = preparedStatement.executeQuery();
            System.out.println("Checkpoint: Execute Successful");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean newEmployee(String emp_no, String birthdate, String first_name, String last_name, String gender, String hire_date) {
        try {
            String query = String.format("INSERT INTO employees.employees(emp_no, birth_date, first_name, last_name, gender, hire_date) " +
                    "VALUES('%s','%s','%s','%s','%s','%s')", emp_no, birthdate, first_name, last_name, gender, hire_date);
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            // log to server
            e.printStackTrace();
            return false;
        }
    }

    public String checkPassword(String username) {
        try {
            String query = String.format("SELECT * FROM employees.useraccount WHERE username = '%s'", username);
            preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return resultSet.getString("password");
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
