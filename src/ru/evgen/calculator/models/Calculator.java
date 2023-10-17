package ru.evgen.calculator.models;

/**
 * Модель калькулятора.
 */
public class Calculator {
    private double num1;
    private double num2;

    private double result;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Получение результата математической операции.
     * @return результат математического вычисления.
     */
    public double getResult() {
        return result;
    }

    /**
     * Сложение двух чисел
     */
    public void addition(){
        result = num1 + num2;
    }

    /**
     * Вычитание двух чисел
     */
    public void subtraction(){
        result = num1 - num2;
    }

    /**
     * Деление двух чисел
     */
    public void division(){
        result = num1 / num2;
    }

    /**
     * Умножение двух чисел
     */
    public void multiplication(){
        result = num1 * num2;
    }
}
