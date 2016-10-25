package com.com.study.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.annotation.IPersonService;

public class AopTest{

	@Test
	public void interceptorTest(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IPersonService pservice = (IPersonService) ctx.getBean("personService");
		pservice.run();
	}
}
