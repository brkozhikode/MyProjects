package com.br.lottery.entity;

public class Lotto {

    private Integer number1;
    private Integer number2;
    private Integer number3;
    private Integer number4;
    private Integer number5;
    private Integer number6;

    public Lotto(Integer number1, Integer number2, Integer number3, Integer number4, Integer number5, Integer number6) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
        this.number5 = number5;
        this.number6 = number6;
    }

    public Integer getNumber1() {
        return number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public Integer getNumber3() {
        return number3;
    }

    public Integer getNumber4() {
        return number4;
    }

    public Integer getNumber5() {
        return number5;
    }

    public Integer getNumber6() {
        return number6;
    }
}
