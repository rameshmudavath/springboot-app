package com.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

public class LoveCalculatorInitializer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		System.out.println("my custom class onstartup method called>>>ramesh");
	}

}
