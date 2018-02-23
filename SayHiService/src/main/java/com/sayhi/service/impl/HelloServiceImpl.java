package com.sayhi.service.impl;

import com.sayhi.bean.HelloBean;
import com.sayhi.dao.IHelloDAO;
import com.sayhi.dao.impl.HelloDAOImpl;
import com.sayhi.service.IHelloService;

public class HelloServiceImpl implements IHelloService{

	public HelloBean getHello() {
		IHelloDAO dao = new HelloDAOImpl();
		HelloBean helloBean = dao.getHello();
		helloBean.setSay("Hi " + helloBean.getLastName() + ", from Server!!!");
		return helloBean;
	}

}
