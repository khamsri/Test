package com.sayhi.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.sayhi.bean.HelloBean;
import com.sayhi.service.IHelloService;
import com.sayhi.service.impl.HelloServiceImpl;

@Path("/services")
public class HelloWS {

	@GET
	@Produces("application/json")
	public HelloBean sayHtmlHello() {
		IHelloService helloService = new HelloServiceImpl();
		return helloService.getHello();
	}
}
