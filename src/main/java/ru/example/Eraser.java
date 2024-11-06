package ru.example;

import org.springframework.stereotype.Component;

@Component
public class Eraser implements Stationery {
    private String brand;

    public Eraser(String brand) {
        this.brand = brand;
    }

    @Override
    public String getInfo() {
        return "Ластик от бренда: " + brand;
    }
}
