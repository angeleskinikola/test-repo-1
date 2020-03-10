package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter MM/DD/YYYY");

	    String str = new Scanner(System.in).nextLine();
	    String[] string = str.split("/");

        System.out.println("Month: " + string[0]);
        System.out.println("Day: " + string[1]);
        System.out.println("Year: " + string[2]);
    }
}
