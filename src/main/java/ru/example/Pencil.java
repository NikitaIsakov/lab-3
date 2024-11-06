package ru.example;

import org.springframework.stereotype.Component;

@Component
public class Pencil implements Stationery {
    private String hardness;

    public Pencil(String hardness) {
        this.hardness = hardness;
    }

    @Override
    public String getInfo() {
        return "Карандаш с твердостью: " + hardness;
    }
}
