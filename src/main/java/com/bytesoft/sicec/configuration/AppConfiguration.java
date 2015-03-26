/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesoft.sicec.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;

/**
 * Application Configuration class from spring framework.
 */
@Configuration
@ComponentScan(basePackages = "com.bytesoft.sicec.controller")
@EnableWebMvc
public class AppConfiguration extends WebMvcConfigurerAdapter {

    /**
     * Get the View Resolver definition.
     * @return <code>UrlBasedViewResolver</code>
     */
    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        final UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);

        return resolver;
    }

    /**
     * Get the tiles configuration.
     * @return <code>TilesConfigurer</code>
     */
    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions("/WEB-INF/tiles-definitions.xml");
        return tilesConfigurer;
    }

    /**
     * Get the url view resolver configuration.
     * @return <code>UrlBasedViewResolver</code>
     */
    @Bean
    public UrlBasedViewResolver viewResolver() {
        UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
        viewResolver.setViewClass(org.springframework.web.servlet.view.tiles3.TilesView.class);
        return viewResolver;
    }

    /**
     * Register the resource handlers.
     * @param registry <code>ResourceHandlerRegistry</code>
     */
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/resources/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/resources/js/");
        registry.addResourceHandler("/bootstrap/**").addResourceLocations("/WEB-INF/resources/bootstrap/");
    }

}
