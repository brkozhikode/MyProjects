package com.br.lottery.service;

import com.br.lottery.entity.EuroMillions;
import com.br.lottery.entity.Lotto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

@Service
public class LotteryServiceImpl implements LotteryService {

    private Logger logger = LoggerFactory.getLogger(LotteryServiceImpl.class);

    @Override
    public Integer getRandomNumber(Integer maxNum){

        //ArrayList<Integer> LotteryNumbers = new ArrayList<Integer>();

        Random random = new Random();

        Integer randomNum = random.nextInt(maxNum)+1;
                logger.debug("Random Num " + randomNum);
        return randomNum;

    }

    @Override
    public EuroMillions getEuroMillions() {

        List<Integer> mainNumbersList = getUniqueNumbers(5,50);

        List<Integer> luckyStarsList = getUniqueNumbers(2,12);

        return new EuroMillions(mainNumbersList.get(0),mainNumbersList.get(1),mainNumbersList.get(2),mainNumbersList.get(3),mainNumbersList.get(4),luckyStarsList.get(0),luckyStarsList.get(1));
    }

    @Override
    public Lotto getLotto() {
        List<Integer> mainNumbersList = getUniqueNumbers(6, 59);
        return new Lotto(mainNumbersList.get(0),mainNumbersList.get(1),mainNumbersList.get(2),mainNumbersList.get(3),mainNumbersList.get(4),mainNumbersList.get(5));

    }

    private List<Integer> getUniqueNumbers(int arraySize, int maxNumber) {
        HashSet<Integer> mainNumbers = new HashSet<Integer>();
        while (mainNumbers.size() <= arraySize){
            mainNumbers.add(getRandomNumber(maxNumber));
        }
        // Creating a List of HashSet elements
        return new ArrayList<Integer>(mainNumbers);
    }

}
