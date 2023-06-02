package com.example.webappj2eetodos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "loginServlet", value = "/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String psw = request.getParameter("psw");
        if(userName.equals("Team") && psw.equals("BestTeamEver")){
            response.sendRedirect("todoList");
        }
        else
        {
            request.getRequestDispatcher("errorPage.jsp").forward(request,response);
        }
    }
}
