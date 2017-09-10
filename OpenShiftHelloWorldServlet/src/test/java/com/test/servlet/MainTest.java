package com.test.servlet;

import static org.junit.Assert.assertTrue;

import javax.servlet.ServletException;

import org.junit.Test;


public class MainTest {

	@Test
	public void test() {
		HelloWorldServlet hws = new HelloWorldServlet();
		assertTrue(hws.sayHello().equals("hello"));		
	}

}
