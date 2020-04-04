package controller;

import module.Employee;
import module.QueryModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

public class GetEmployeeInfoServlet extends javax.servlet.http.HttpServlet {

    protected void processRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
            HttpSession session = request.getSession(false);
            System.out.println("Checkpoint: Reach Servlet");
            String fname = request.getParameter("fname").toString();
            String lname = request.getParameter("fname").toString();
            QueryModel q = new QueryModel();
             ResultSet result = q.getEmployeeInfo(fname, lname); //result should be only one since we take max salary only
            boolean haveInfo = result.next();
            Employee e;
            if(haveInfo){
            e = new Employee(result.getString("first_name"), result.getString("last_name"),
                        result.getString("hire_date"), result.getString("dept_name"), result.getInt("salary"));
            } else {
                e = null;
            }
            request.setAttribute("result", e);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/empSearch.jsp");
            requestDispatcher.forward(request, response);
            System.out.println("Checkpoint: Dispatch successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        processRequest(request, response);
    }
}