package c.middle;

import java.math.BigDecimal;

public class CalculateSalary {

    public BigDecimal getSalaryIncrease(Employee employee){
        return employee.getSalary().add(employee.getType().getRate().multiply(employee.getSalary()));
    }

    public void calculateSalaries(){
        Employee[] employees= {
             new Employee("LeeDaeRi",SalaryIncreaseRate.owner,new BigDecimal("1000000000")),
                new Employee("KimManager",SalaryIncreaseRate.manager,new BigDecimal("100000000")),
                new Employee("WhangDesign",SalaryIncreaseRate.designer, new BigDecimal("70000000")),
                new Employee("ParkArchi",SalaryIncreaseRate.architect, new BigDecimal("80000000")),
                new Employee("LeeDevelop",SalaryIncreaseRate.developer, new BigDecimal("60000000"))
        };


        for(Employee employee: employees){
            System.out.println(employee.getName()+"="+getSalaryIncrease(employee).toBigInteger());
        }
    }


    public static void main(String[] args){

        CalculateSalary calculateSalary=new CalculateSalary();

        calculateSalary.calculateSalaries();
    }

}
