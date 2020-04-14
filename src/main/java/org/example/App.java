package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число больше 0");
        int n = scan.nextInt();
        FooBar fooBarIfCase = new FooBarMinimumIf();
        System.out.print(fooBarIfCase.FooBar(n));
        scan.close();
    }


}

