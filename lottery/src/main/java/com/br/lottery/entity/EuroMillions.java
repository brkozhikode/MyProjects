package com.br.lottery.entity;

public class EuroMillions {

    private Integer number1;
    private Integer number2;
    private Integer number3;
    private Integer number4;
    private Integer number5;
    private Integer luckyStars1;
    private Integer luckystars2;
    public EuroMillions(Integer number1, Integer number2, Integer number3, Integer number4, Integer number5, Integer luckyStars1, Integer luckystars2) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
        this.number5 = number5;
        this.luckyStars1 = luckyStars1;
        this.luckystars2 = luckystars2;
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public Integer getNumber3() {
        return number3;
    }

    public void setNumber3(Integer number3) {
        this.number3 = number3;
    }

    public Integer getNumber4() {
        return number4;
    }

    public void setNumber4(Integer number4) {
        this.number4 = number4;
    }

    public Integer getNumber5() {
        return number5;
    }

    public void setNumber5(Integer number5) {
        this.number5 = number5;
    }

    public Integer getLuckyStars1() {
        return luckyStars1;
    }

    public void setLuckyStars1(Integer luckyStars1) {
        this.luckyStars1 = luckyStars1;
    }

    public Integer getLuckystars2() {
        return luckystars2;
    }

    public void setLuckystars2(Integer luckystars2) {
        this.luckystars2 = luckystars2;
    }


}
