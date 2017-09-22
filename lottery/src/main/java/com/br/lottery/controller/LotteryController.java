package com.br.lottery.controller;

import com.br.lottery.entity.EuroMillions;
import com.br.lottery.entity.Lotto;
import com.br.lottery.service.LotteryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping
public class LotteryController {

	private Logger logger = LoggerFactory.getLogger(LotteryController.class);

	@Autowired
	//@Resource(name = "lotteryService")
	private LotteryService lotteryService ;

	@GetMapping("/hello")
	public String sayHello(
			@RequestParam(value = "name", required = false,
					defaultValue = "World") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}


	@GetMapping("/euro")
	public String getEuroMillions(Model model){
	    EuroMillions euroMillions = lotteryService.getEuroMillions();
		model.addAttribute("number1", euroMillions.getNumber1());
        model.addAttribute("number2", euroMillions.getNumber2());
        model.addAttribute("number3", euroMillions.getNumber3());
        model.addAttribute("number4", euroMillions.getNumber4());
        model.addAttribute("number5", euroMillions.getNumber5());

        model.addAttribute("number6", euroMillions.getLuckyStars1());
        model.addAttribute("number7", euroMillions.getLuckystars2());

		return "euro";

	}

	@GetMapping("/lotto")
	public String getLottoNums(Model model){
		logger.debug("In getLottoNums");
        Lotto lotto = lotteryService.getLotto();
		model.addAttribute("lnumber1", lotto.getNumber1());
		model.addAttribute("lnumber2", lotto.getNumber2());
		model.addAttribute("lnumber3", lotto.getNumber3());
		model.addAttribute("lnumber4", lotto.getNumber4());
		model.addAttribute("lnumber5", lotto.getNumber5());
		model.addAttribute("lnumber6", lotto.getNumber6());

		return "lotto";

	}


    @GetMapping("/euroapi")
    public ResponseEntity<EuroMillions> getEuro(){
		EuroMillions euroMillions = lotteryService.getEuroMillions();
		return new ResponseEntity<EuroMillions>(euroMillions, HttpStatus.OK);


    }

    @GetMapping("/lottoapi")
    public ResponseEntity<Lotto> getLotto(){
        Lotto lotto = lotteryService.getLotto();
        return new ResponseEntity<Lotto>(lotto, HttpStatus.OK);


    }
}
