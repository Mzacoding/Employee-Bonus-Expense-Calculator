 
package com.bonusexpense;

import com.employee.Employee;
import java.util.List;

 
public interface BonusExpenseCalculatorInteface {
    
    
    double bonusCalculation(List<Employee> employees);
            
     double calculationDeduction(List<Employee> employees);
                    
    double calculationNetSalary(List<Employee> employees, double  deductions);
   
    double calculationTotalCompanyExpenses(double salaries ,double deductions); 
}


