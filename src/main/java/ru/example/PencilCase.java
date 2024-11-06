package ru.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PencilCase {
    private Stationery stationery;
    private String color;

    // Constructor-based dependency injection
    @Autowired
    public PencilCase(Stationery stationery) {
        this.stationery = stationery;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showContents() {
        System.out.println("Пенал " + color + " содержит: " + stationery.getInfo());
    }

    // Init and destroy methods
    public void init() {
        System.out.println("Пенал готов к использованию.");
    }

    public void destroy() {
        System.out.println("Пенал выброшен.");
    }
}
