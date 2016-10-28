package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a = -1;
        int b;
        int grades[] = new int[100];
        String names[] = new String[100];
        while (true) {
            System.out.println("Enter your name.");
            String name = i.next();
            a++;
            b = a + 1;
            System.out.println("Enter your grade or -1 to exit.");
            int g = i.nextInt();
            if (g == -1)
                break;
            grades[a] = g;
            names[a] = name;
            int sum = 0;
            for (int n = 0; n < b; n++) {
                sum = sum + grades[n];
            }
            int average = sum / b;
            int x = -1;
            int count = 0;
            while (x < a) {
                count++;
                x++;
                System.out.print(names[x] + ", ");
            }
            System.out.println("Class average: " + average);
        }
    }
}
