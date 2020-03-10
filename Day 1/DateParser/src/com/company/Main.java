package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter MM/DD/YYYY");

	String str = new Scanner(System.in).nextLine();
	String[] string = str.split("/");
	    
	String month = string[0];
	String day = string[1];
	String year = string[2];

        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);
    }
}
