package ru.evgen.calculator.models;

/**
 * Модель калькулятора.
 */
public class Calculator {
    /**
     * Первое число для вычисления.
     */
    private final double num1;
    /**
     * Второе число для вычисления.
     */
    private final double num2;
    /**
     * Результат вычисления.
     */
    private double result;

    /**
     * Конструктор калькулятора.
     * @param num1 первое число для вычисления
     * @param num2 второе число для вычисления
     */
    public Calculator(final double num1, final double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Получение результата математической операции.
     *
     * @return результат математического вычисления.
     */
    public double getResult() {
        return result;
    }

    /**
     * Сложение двух чисел.
     */
    public void addition() {
        result = num1 + num2;
    }

    /**
     * Вычитание двух чисел.
     */
    public void subtraction() {
        result = num1 - num2;
    }

    /**
     * Деление двух чисел.
     */
    public void division() {
        result = num1 / num2;
    }

    /**
     * Умножение двух чисел.
     */
    public void multiplication() {
        result = num1 * num2;
    }
}
