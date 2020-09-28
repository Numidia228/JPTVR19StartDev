package com.company;

import java.util.Random;

public class Task4 {
    public void run(){
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10заполняем его случайн ячеек типа int, \nыми ЧЕТНЫМИ числами и выводим \nего значения в цикле");
        Random random = new Random();
        int[] myArr = new int[10];
        int evenNumber;
        for (int i = 0; i < myArr.length; i++) {
            while (true) {
                evenNumber = random.nextInt(49 + 1);
                if (evenNumber % 2 == 0) {
                    myArr[i] += evenNumber;
                    break;
                }
            }
        }
        for (int i = 0; i < myArr.length; i++) {
            System.out.printf("%4d", myArr[i]);
        }

        System.out.println();
        System.out.println("----- конец задачи 4 ------");
    }
}
