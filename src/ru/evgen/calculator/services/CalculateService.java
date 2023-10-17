package ru.evgen.calculator.services;

import ru.evgen.calculator.models.Calculator;
import ru.evgen.calculator.views.ViewUser;


/**
 * Контроллер программы, осуществляет связь между моделью калькулятора
 * и вводом-выводом пользователю.
 */
public class CalculateService {
    /**
     * Поле визуализации работы программы для поля.
     */
    private final ViewUser viewUser = new ViewUser();

    /**
     * Метод централизующий работу контроллера.
     *
     * @param input входные данные для работы программы
     */
    public void start(final String input) {
        if (validate(input)) {
            viewUser.printResult(calculate(input));
        } else {
            viewUser.printResult("Введены некорректные данные!");
        }
    }

    /**
     * Вычисление математического результата на основе данных от пользователя.
     *
     * @param input данные полученные от пользователя в представлении.
     * @return результат математической операции.
     */
    private String calculate(final String input) {
        String[] userInput = input.split("");
        double num1 = Double.parseDouble(userInput[0]);
        double num2 = Double.parseDouble(userInput[2]);
        String act = userInput[1];
        Calculator calculator = new Calculator(num1, num2);
        switch (act) {
            case "+" -> {
                calculator.addition();
                return String.format("%.2f + %.2f = %.2f",
                        num1,
                        num2,
                        calculator.getResult());
            }
            case "-" -> {
                calculator.subtraction();
                return String.format("%.2f - %.2f = %.2f",
                        num1,
                        num2,
                        calculator.getResult());
            }
            case "/" -> {
                calculator.division();
                return String.format("%.2f / %.2f = %.2f",
                        num1,
                        num2,
                        calculator.getResult());
            }
            case "*" -> {
                calculator.multiplication();
                return String.format("%.2f * %.2f = %.2f",
                        num1,
                        num2,
                        calculator.getResult());
            }
            default -> {
                return "Введен некорректный знак!";
            }
        }
    }

    /**
     * Валидация данных полученных от пользователя.
     *
     * @param date данные полученные из представления
     * @return true - при успешной валидации, иначе false.
     */
    private boolean validate(final String date) {
        String[] arr = date.split("");
        try {
            Double.parseDouble(arr[0]);
            Double.parseDouble(arr[2]);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
