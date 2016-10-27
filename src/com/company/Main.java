package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a = -1;
        int b;
        int grades[] = new int[100];
        while (true) {
            System.out.println("Enter your name.");
            String name = i.nextLine();
            a++;
            b = a + 1;
            System.out.println("Enter your grade.");
            int g = i.nextInt();
            if (g == -1)
                break;
            grades[a] = g;
            int sum = 0;
            for (int n = 0; n < b; n++)
                sum = sum + grades[n];
            System.out.println(sum / b);
        }
    }
}
