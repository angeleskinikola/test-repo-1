package com.company;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Enter height of box: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Enter width of box: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Enter depth of box: ");
        int c = new Scanner(System.in).nextInt();

        Box box = new Box(a,b,c);
        box.volume();

    }
}
