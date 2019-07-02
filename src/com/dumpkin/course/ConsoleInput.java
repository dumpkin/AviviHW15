package com.dumpkin.course;

import java.util.Scanner;

public class ConsoleInput {

    byte inputByte(String line) {
        System.out.print(line + " ");

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextByte()) {
            byte number = sc.nextByte();
            return number;
        } else System.out.println("Неправильний параметр!");
        return 0;
    }

    String inputString(String line) {
        System.out.print(" введіть " + line + ": ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text;
    }
}
