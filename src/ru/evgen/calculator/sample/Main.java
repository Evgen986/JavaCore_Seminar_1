package ru.evgen.calculator.sample;

import ru.evgen.calculator.services.CalculateService;

/**
 * Точка входа в программу
 */
public class Main {
    public static void main(String[] args) {
        CalculateService service = new CalculateService();
        service.start(args[0]);
    }
}