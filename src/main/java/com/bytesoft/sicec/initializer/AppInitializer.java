/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesoft.sicec.initializer;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

/**
 * Application Initializer for Spring context.
 */
public class AppInitializer implements WebApplicationInitializer {

    /**
     * Override method of Web Application Initializer.
     * @param servletContext <code>ServletContext</code>
     * @throws ServletException Servlet Exception
     */
    @Override
    public void onStartup(final ServletContext servletContext) throws ServletException {
        final AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(com.bytesoft.sicec.configuration.AppConfiguration.class);
        ctx.setServletContext(servletContext);
 
        final Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }

}
