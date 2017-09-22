package com.br.lottery;

import com.br.lottery.controller.LotteryController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LotteryControllerTests {

    @Autowired
    private LotteryController lotteryController;

    @Test
    public void testSayhello(){
        //LotteryController lotteryController = new LotteryController();
        String name = lotteryController.sayHello("Dolly", new BindingAwareModelMap());
        assertEquals("hello",name);
    }

   /* @Test
    public void testRandomNum(){
        //LotteryServiceImpl lotteryService = new LotteryServiceImpl();
        String numbers = lotteryController.getEuroMillions();
        System.out.print(numbers);
        assertThat(numbers, notNullValue());
    }*/
}
