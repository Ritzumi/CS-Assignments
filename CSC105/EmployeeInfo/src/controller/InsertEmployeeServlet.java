package controller;

import module.QueryModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InsertEmployeeServlet")
public class InsertEmployeeServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            String fname = request.getParameter("fname").toString() + "";
            String lname = request.getParameter("lname").toString() + "";
            String gender = request.getParameter("gender").toString() + "";
            String empno = request.getParameter("empno").toString() + "";
            String hdate = request.getParameter("hdate").toString() + "";
            String bdate = request.getParameter("bdate").toString() + "";
            QueryModel q = new QueryModel();
            String success;
            if (lname.isBlank() || lname.isBlank() || empno.isBlank() || hdate.isBlank() || bdate.isBlank()){
                success = "";
            } else {
                success = q.newEmployee(empno, bdate, fname, lname, gender, hdate) ? "success" : "";
            }
            request.setAttribute("result", success);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/insEmp.jsp");
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
