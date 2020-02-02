package com.example.spring;

import java.text.NumberFormat;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ApplicationTests {

	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	NumberFormat nf;

	@Test
	void contextLoads() {
		System.out.println("Total # of beans are :"+ ctx.getBeanDefinitionCount());
		Arrays.asList(ctx.getBeanDefinitionNames()).forEach(s -> System.out.println(s.toString()));
	}
	
	@Test
	void testThis() {
		double amount = 123143.4353;
		System.out.println(nf.format(amount));
	}

}
