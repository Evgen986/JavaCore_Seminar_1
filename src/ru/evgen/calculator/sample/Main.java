package ru.evgen.calculator.sample;

import ru.evgen.calculator.services.CalculateService;

/**
 * Точка входа в программу.
 */
public final class Main {
    private Main() {
    }

    /**
     * Метод входа в программу.
     * @param args аргументы для точки входа
     */
    public static void main(final String[] args) {
        CalculateService service = new CalculateService();
        service.start("7+5");
        service.start("7-5");
        service.start("7/5");
        service.start("7*5");
        service.start("dsfdsf");
        service.start("5_6");
    }
}
