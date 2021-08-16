package c.middle;

public class CalculateSalary {

    public long getSalaryIncrease(Employee employee){
        double increaseRate=0.0;
        switch (employee.getType()){
            case 1:
                increaseRate=-0.95;
                break;
            case 2:
                increaseRate=0.1;
                break;
            case 3:
                increaseRate=0.2;
                break;
            case 4:
                increaseRate=0.3;
                break;
            case 5:
                increaseRate=1.0;
                break;
        }
        return employee.getSalary()+(long)(employee.getSalary()*increaseRate);
    }

    public void calculateSalaries(){
        Employee[] employees= {
                new Employee("LeeDaeRi",1,1_000_000_000L),
                new Employee("KimManager",2,100_000_000L),
                new Employee("WhangDesign",3,70_000_000L),
                new Employee("ParkArchi",4,80_000_000L),
                new Employee("LeeDevelop",5,60_000_000L)
        };

        for(Employee employee: employees){
            System.out.println(employee.getName()+"="+getSalaryIncrease(employee));
        }
    }


    public static void main(String[] args){
        CalculateSalary calculateSalary=new CalculateSalary();
        calculateSalary.calculateSalaries();
    }

}
