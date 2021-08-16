package c.middle;

import java.math.BigDecimal;

public class CalculateSalary {

    public long getSalaryIncrease(Employee employee){
        /* increaseRate의 타입 double -> BigDecimal 변환함.
        - 급여와 같이 정확한 계산이 필요한 곳에는 오차가 발생할 수 있는 double을 사용하면 안된다.
        - double 타입이었을 때 출력 결과값에 오류가 없었던 것은,
          예시 소수들이 운이 좋아서 오차가 나는 소수 부분은 long과 곱하고 나서 절사되었기 때문이다.
          ex) 0.3 -> 0.300000000000000001
             70,000,000 * 0.300000000000000001 = 21,000,000.00000000000000001

          이율이 다음과 같은 케이스가 된다면 정확한 급여를 계산할 수 없는 것을 확인할 수 있다.
          long a = 1_000_000_000_000_000_000L;
          double b=0.155555555555566666;
          System.out.println(a*b); // 출력 : 1.55555555555566656E17

         */
        BigDecimal increaseRate=new BigDecimal("0.0");
        switch (employee.getType()){
            case 1:
                increaseRate=new BigDecimal("-0.95");
                break;
            case 2:
                increaseRate=new BigDecimal("0.1");
                break;
            case 3:
                increaseRate=new BigDecimal("0.2");
                break;
            case 4:
                increaseRate=new BigDecimal("0.3");
                break;
            case 5:
                increaseRate=new BigDecimal("1.0");
                break;
        }
        return employee.getSalary()+increaseRate.multiply(BigDecimal.valueOf(employee.getSalary())).longValue();
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
