package com.bonusexpensecalculator;

import com.bonusexpense.BonusExpenseCalculatorInteface;
import com.employee.Employee;
import java.util.List;

public class BonusExpenseCalculator implements BonusExpenseCalculatorInteface {

    private final double MANAGER_RATE = 0.2;

    private final double DEVELOPER_RATE = 0.15;

    private final double INTERN_RATE = 0.05;

    private final double TAX_RATE = 0.18;
    private final double MEDICAL_AID = 0.05;
    private final double RETIREMENT_RATE = 0.07;

    @Override
    public double bonusCalculation(List<Employee> employees) {

        double totalBonus = 0;

        for (int x = 0; x < employees.size(); x++) {

            String jobRole = employees.get(x).getJob_role();
            double salary = employees.get(x).getSalary();

            switch (jobRole) {

                case "Manager":

                    totalBonus += salary * MANAGER_RATE;
                    break;

                case "Developer":

                    totalBonus += salary * DEVELOPER_RATE;
                    break;
                case "Intern":

                    totalBonus += salary * INTERN_RATE;
                    break;

            }

        }

        return totalBonus;

    }

    @Override
    public double calculationDeduction(List<Employee> employees) {

        double totalDeductions = 0;

        double deduction_Per_Employee;
        for (int x = 0; x < employees.size(); x++) {

            double salary = employees.get(x).getSalary();

            deduction_Per_Employee = (salary * TAX_RATE) + (salary * RETIREMENT_RATE) + (salary * MEDICAL_AID);

            totalDeductions += deduction_Per_Employee;

        }

        return totalDeductions;

    }



    @Override
    public double calculationNetSalary(List<Employee> employees, double deductions) {

        double netSalary;
        double salaries = 0;
        for (int x = 0; x < employees.size(); x++) {

            salaries += employees.get(x).getSalary();
        }

        netSalary = salaries - deductions;

        return netSalary;

    }

    @Override
    public double calculationTotalCompanyExpenses(double salaries, double deductions) {

        return salaries + deductions;
    }

}
