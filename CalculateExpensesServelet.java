package com.calculateexpenses;

import com.bonusexpensecalculator.BonusExpenseCalculator;
import com.employee.Employee;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateExpensesServelet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Employee> employee = (List<Employee>) request.getAttribute("employees");
        
        BonusExpenseCalculator cal = new BonusExpenseCalculator();
        
        double totalBonus = cal.bonusCalculation(employee);
        
        double deductions = cal.calculationDeduction(employee);
        double netSalary = cal.calculationNetSalary(employee, deductions);
        
        double totalCampaniesExpenses = cal.calculationTotalCompanyExpenses(netSalary, deductions);
        
        request.setAttribute("totalCampaniesExpenses", totalCampaniesExpenses);
        
        forwardRequest(request, response);
    }
    
    private void forwardRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        request.getRequestDispatcher("/CampaniesExpenses.jsp").forward(request, response);
        
    }


}
