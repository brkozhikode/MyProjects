package com.br.lottery;

import com.br.lottery.controller.LotteryController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(LotteryController.class)
public class LotteryControllerIntegrationTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testHelloWithoutName() throws Exception {
        mvc.perform(get("/hello").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(view().name("hello"))
                .andExpect(model().attribute("name", is("World")));

    }

    @Test
    public void testHelloWithName() throws Exception {
        mvc.perform(get("/hello").param("name","Dolly").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(view().name("hello"))
                .andExpect(model().attribute("name", is("Dolly")));

    }

    @Test
    public void testEuro() throws Exception {
        mvc.perform(get("/euro").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk());

    }

    @Test
    public void testEuroApi() throws Exception {
        mvc.perform(get("/euroapi").accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());

    }

    @Test
    public void testLotto() throws Exception {
        mvc.perform(get("/lotto").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk());

    }

    @Test
    public void testLottoApi() throws Exception {
        mvc.perform(get("/lottoapi").accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());

    }

}
