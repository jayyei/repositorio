package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan("com")
public class SpringWeb
{
    @Bean
    public InternalResourceViewResolver GetInternalResourceViewResolver()
    {
        InternalResourceViewResolver ViewResolver = new InternalResourceViewResolver();
        ViewResolver.setViewClass(JstlView.class);
        ViewResolver.setPrefix("/WEB-INF/views/");
        ViewResolver.setSuffix(".jsp");
        return ViewResolver;
    }
}