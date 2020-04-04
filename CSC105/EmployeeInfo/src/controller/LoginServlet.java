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
        try (PrintWriter out = response.getWriter()) {
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String password = request.getParameter("password");
            String truePassword = "12345";
            if(password.equals(truePassword)){
                HttpSession session = request.getSession();
                session.setAttribute("firstname", firstname);
                session.setAttribute("lastname", lastname);
                out.println("Hello " + session.getAttribute("firstname") + " " + session.getAttribute("lastname"));
                getServletContext().getRequestDispatcher("/GetEmployeeInfoServlet").forward(request,response);
            } else {
                out.println("Problem with your password");
                getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

//            String username = request.getParameter("username").toString();
//            String password = request.getParameter("password").toString();
//            QueryModel q = new QueryModel();
//            if(password.equals(q.checkPassword(username))){
//                HttpSession session = request.getSession();
//                session.setAttribute("username", username);
//                out.println("Hello " + session.getAttribute("username"));
//            } else {
//                out.println("Problem with your password");
//                request.getRequestDispatcher("/Login.jsp").include(request, response);
//            }