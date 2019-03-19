package com.tcs.gmall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

public class MainApplication {
	
	public static void main(String[] args) throws IOException {/*cl
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");*/
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:provider.xml");
		applicationContext.start();
		System.in.read();
	}
}
