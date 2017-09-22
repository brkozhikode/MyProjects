package com.br.lottery.service;


import com.br.lottery.entity.EuroMillions;
import com.br.lottery.entity.Lotto;

public interface LotteryService {

    Integer getRandomNumber(Integer maxNum);

    EuroMillions getEuroMillions();

    Lotto getLotto();
}
