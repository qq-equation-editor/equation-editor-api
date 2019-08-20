package com.zylear.equation.editor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan("com.zylear.equation.editor.*")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class EquationEditorApiApplication extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

    public static void main(String[] args) {
        SpringApplication.run(EquationEditorApiApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EquationEditorApiApplication.class);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(80);
        container.setContextPath("/eqed");
    }

}
