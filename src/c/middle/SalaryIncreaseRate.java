package c.middle;

import java.math.BigDecimal;

public enum SalaryIncreaseRate {
    owner(1,new BigDecimal("-0.95")),
    manager(2,new BigDecimal("0.1")),
    designer(3,new BigDecimal("0.2")),
    architect(4,new BigDecimal("0.3")),
    developer(5,new BigDecimal("1.0"));

    private final int value;
    private final BigDecimal rate;

    SalaryIncreaseRate(int value, BigDecimal rate){
        this.value=value;
        this.rate=rate;
    }
    public int getValue(){
        return value;
    }
    public BigDecimal getRate(){
        return rate;
    }
}
