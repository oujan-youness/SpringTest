package com.oujan.SpringTest.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {
	            PersistenceJPAConfig.class
	        };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		return new Class[] {MvcConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {
	            "/"
	        };
	}

}