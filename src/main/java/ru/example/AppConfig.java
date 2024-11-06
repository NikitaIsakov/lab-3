package ru.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;

@Configuration
@ComponentScan("ru.example.pencilcase")
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Value("${pencilcase.color}")
    private String pencilCaseColor;

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PencilCase pencilCase(Stationery stationery) {
        PencilCase pencilCase = new PencilCase(stationery);
        pencilCase.setColor(pencilCaseColor);
        return pencilCase;
    }

    @Bean
    public Stationery pencil() {
        return new Pencil("HB");
    }
}
