package com.sayhi.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sayhi.bean.HelloBean;
import com.sayhi.service.impl.HelloServiceImpl;

public class HelloServiceTest {
	
	@Test
	public void success1() {
		IHelloService helloService = new HelloServiceImpl();
		HelloBean bean = helloService.getHello();
		assertTrue(bean.getSay().equals("Hi " + bean.getLastName() + ", from Server!!!"));
	}
}
