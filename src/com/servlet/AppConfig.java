package com.servlet;

import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;


@HandlesTypes({
    javax.servlet.http.HttpServlet.class,
    javax.servlet.Filter.class
})
public class AppConfig implements ServletContainerInitializer {
	
	@Override
	public void onStartup(Set<Class<?>> arg0, ServletContext appContext)
			throws ServletException {
		
        for (Iterator iterator = arg0.iterator(); iterator.hasNext();) {
			Class<?> class1 = (Class<?>) iterator.next();
		}
		ServletRegistration.Dynamic dispatcher = appContext.addServlet(
				"dispatcher", new HelloServlet());
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
  }
	

}
    
