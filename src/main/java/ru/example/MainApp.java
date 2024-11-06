package ru.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PencilCase pencilCase = context.getBean(PencilCase.class);
        pencilCase.showContents();

        context.close();
    }
}