/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;


import java.util.Scanner;

class Task1 {
    public void run(){
        System.out.println("----- Задача 1 ------");
        System.out.println("Введите число градусов по Цельсию: ");
        // решение задачи
        Scanner scanner = new Scanner(System.in);
        double celsium = scanner.nextInt();
        double fahrenheit = celsium * 1.8 + 32;
        System.out.print("По Фарингейту это будет: ");
        System.out.print(fahrenheit);

        System.out.println();
        System.out.println("----- конец задачи 1 ------");
        System.out.println();
    }
}
