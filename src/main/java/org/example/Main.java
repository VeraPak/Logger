package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Logger logger = Logger.getInstance();

    public static void main(String[] args) {
        logger.log("Запускаем программу\n");
        logger.log("Просим пользователя ввести входные данные для списка\n");

        System.out.print("Введите размер списка: ");
        int lengthList = scan.nextInt(); //N
        System.out.print("Введите верхнюю границу для значений: ");
        int valuesLimit = scan.nextInt(); //M

        logger.log("Создаём и наполняем список\n");
        List<Integer> list = new Random()
                .ints(lengthList, 0, valuesLimit+1)
                        .boxed()
                                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Вот случайный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации\n");
        System.out.print("Введите порог для фильтра: ");
        int f = scan.nextInt();

        logger.log("Запускаем фильтрацию\n");
        Filter filter = new Filter(f);
        List<Integer> newList = filter.filterOut(list);

        logger.log("Выводим результат на экран\n");
        System.out.println("Отфильтрованный список: " + list);
        logger.log("Завершаем программу\n");
    }
}