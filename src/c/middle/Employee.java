package c.middle;

import java.math.BigDecimal;

public class Employee {
    private String name; // 이름
    private SalaryIncreaseRate type; //업무 역할
    private BigDecimal salary; //연봉

    public Employee(String name, SalaryIncreaseRate type, BigDecimal salary) {
        this.name = name;
        this.type = type;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SalaryIncreaseRate getType() {
        return type;
    }

    public void setType(SalaryIncreaseRate type) {
        this.type = type;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }


}
