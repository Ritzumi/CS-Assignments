package module;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryModel {
    Connection conn;
    PreparedStatement preparedStatement;

    public QueryModel() throws Exception {
        conn = DBconnection.getMSSQLConnection();
    }

    public ResultSet getEmployeeInfo(String emp_no) {
        try {
            String query = String.format("SELECT * \n" +
                    "FROM employees.employees\n" +
                    "JOIN salaries s on employees.emp_no = s.emp_no\n" +
                    "JOIN dept_emp de on employees.emp_no = de.emp_no\n" +
                    "JOIN departments d on de.dept_no = d.dept_no\n" +
                    "WHERE employees.emp_no LIKE '%s' \n" ,emp_no);
            preparedStatement = conn.prepareStatement(query);
            ResultSet result = preparedStatement.executeQuery();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
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

    public String getEmpno(String username){
        String query = String.format("SELECT * FROM employees.useraccount WHERE username = '%s'", username);
        try {
            preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return resultSet.getString("emp_no");
            } else {
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    return null;
    }

}
