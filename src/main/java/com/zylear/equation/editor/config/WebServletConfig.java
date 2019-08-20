package com.zylear.equation.editor.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Created by xiezongyu on 2019/3/8.
 */
@Configuration
public class WebServletConfig {

    @Bean
    public ServletRegistrationBean apiDispatcherServletRegistration(ApplicationContext context) {

        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        dispatcherServlet.setApplicationContext(context);
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(dispatcherServlet);
        registrationBean.addUrlMappings("/api/*");
        registrationBean.setName("api_servlet");
        return registrationBean;
    }

}
