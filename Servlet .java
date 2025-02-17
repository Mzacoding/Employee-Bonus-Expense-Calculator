package com.calculateservlet;

import com.employee.Employee;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateServlet extends HttpServlet {

    private List<Employee> employee = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        double salary = Double.parseDouble(request.getParameter("salary"));

        String jobRole = request.getParameter("jobRole");
        

        employee.add(new Employee(salary, jobRole));


        if (employee.size() >= 5) {
            
             request.setAttribute("employees", employee);
            

            RequestDispatcher disp = request.getRequestDispatcher("CalculateExpensesServelet.do");
            disp.forward(request, response);

        } else {
            RequestDispatcher disp = request.getRequestDispatcher("/information.jsp");
            disp.include(request, response);
        }

    }

}
