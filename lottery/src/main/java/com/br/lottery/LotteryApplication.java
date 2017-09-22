package com.br.lottery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ("com.br.lottery")
public class LotteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LotteryApplication.class, args);
	}
}
