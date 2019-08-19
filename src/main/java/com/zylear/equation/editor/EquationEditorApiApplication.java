package com.zylear.equation.editor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zylear.equation.editor.*")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class EquationEditorApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EquationEditorApiApplication.class, args);
    }

}
