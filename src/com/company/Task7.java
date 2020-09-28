package com.company;

import java.util.Scanner;

class Task7 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- Задача 7 ------");
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        // посчитайте сколько раз в строке встречается введенная вами буква
        System.out.println("Введите букву: ");
        String letter = scanner.nextLine();

        int count = 0;
        int index = str.indexOf(letter);
            while(index != -1){
                count++;
                str = str.substring(index + 1);
                index = str.indexOf(letter);
            }
        System.out.println("Буква \"" + letter + "\" встречается в тексте " + count + " раз");
    }
}