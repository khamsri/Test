package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sayhi.bean.HelloBean;
import com.sayhi.dao.IHelloDAO;
import com.sayhi.dao.impl.HelloDAOImpl;

public class HelloDAOTest {
	
	@Test
	public void success1() {
		IHelloDAO dao = new HelloDAOImpl();
		HelloBean bean = dao.getHello();
		assertTrue(bean.getFirstName().equals("Cristiano"));
	}
	
	public void success2() {
		IHelloDAO dao = new HelloDAOImpl();
		HelloBean bean = dao.getHello();
		assertTrue(bean.getLastName().equals("Ronaldo"));
	}
	
	public void failure1() {
		IHelloDAO dao = new HelloDAOImpl();
		HelloBean bean = dao.getHello();
		assertFalse(bean.getFirstName().equals("cris"));
	}

	public void failure2() {
		IHelloDAO dao = new HelloDAOImpl();
		HelloBean bean = dao.getHello();
		assertFalse(bean.getLastName().equals("ronal"));
	}

}
