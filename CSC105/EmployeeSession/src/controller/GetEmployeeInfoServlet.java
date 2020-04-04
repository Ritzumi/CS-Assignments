package controller;

import module.Employee;
import module.QueryModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

@WebServlet(name = "GetEmployeeInfoServlet")
public class GetEmployeeInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()){
            HttpSession session = request.getSession(false);
            String username = session.getAttribute("username").toString();
            QueryModel q = new QueryModel();
            String empno = q.getEmpno(username);
            ResultSet result = q.getEmployeeInfo(empno);
            boolean haveInfo = result.next();
            Employee e;
            if(haveInfo){
                e = new Employee(result.getString("first_name"), result.getString("last_name"),
                        result.getString("hire_date"), result.getString("dept_name"), result.getInt("salary"));
            } else {
                e = null;
            }
            request.setAttribute("result", e);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/UserInfo.jsp");
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
