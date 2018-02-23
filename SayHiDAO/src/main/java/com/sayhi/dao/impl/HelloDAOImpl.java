package com.sayhi.dao.impl;

import com.sayhi.bean.HelloBean;
import com.sayhi.dao.IHelloDAO;

public class HelloDAOImpl implements IHelloDAO {

	public HelloBean getHello() {
		HelloBean helloBean = new HelloBean();		
		helloBean.setFirstName("Cristiano");
		helloBean.setLastName("Ronaldo");
		return helloBean;
	}

}
