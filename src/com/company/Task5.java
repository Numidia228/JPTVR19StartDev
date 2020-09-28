package com.company;

import java.util.Random;

public class Task5 {
    public void run() {
        System.out.println("----- Задача 5 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ массив  из 10х5 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        System.out.println("----- конец задачи 5 ------");
        Random random = new Random();
        int myArr[][] = new int[10][5];
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++)
                myArr[i][j] = random.nextInt(49 + 1);
        }
        for (int i = 0; i < myArr.length; i++) {
            System.out.println();
            for (int j = 0; j < myArr[i].length; j++) {
                System.out.printf(myArr[i][j] + " ");
            }
        }
    }
}


