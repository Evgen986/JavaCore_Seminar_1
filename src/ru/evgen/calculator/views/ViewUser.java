package ru.evgen.calculator.views;

import java.util.Scanner;

/**
 * Получение данных от пользователя и вывод результата работы программы
 */
public class ViewUser {
    /**
     * Печать результата работы программы для пользователя
     * @param result результат вычисления из контроллера
     */
    public void printResult(String result){
        System.out.println(result);
    }
}
