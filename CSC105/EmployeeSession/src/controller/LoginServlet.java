package controller;

import module.QueryModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            QueryModel q = new QueryModel();
            if(password.equals(q.checkPassword(username))){
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                out.println("Hello " + session.getAttribute("username") );
                getServletContext().getRequestDispatcher("/GetEmployeeInfoServlet").include(request,response);
            } else {
                //out.println("<button onclick=\"window.location.href = 'Login.jsp';\">Go to Login</button>");
                getServletContext().getRequestDispatcher("/Login.jsp").include(request, response);
                out.println("<br>Problem with your password");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}