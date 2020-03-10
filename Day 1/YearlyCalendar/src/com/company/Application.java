package com.company;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Enter Year:");
        int year =new Scanner(System.in).nextInt();

        printCalendar(year);

    }

    static boolean isLeap(int year) {
        if(year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static void printCalendar(int year) {
        String[] daysInYear;

        if(isLeap(year)) {
            daysInYear = new String[366];
        } else {
            daysInYear = new String[365];
        }

        int count = 0;
        for(int month = 1; month < 13; month++) {
            for(int day = 1; day < 32; day++) {
                if(month == 2 && day == 29) {
                    if(isLeap(year)) {
                        daysInYear[count++] = year + "-" + String.format("%02d",month) + "-" + String.format("%02d",day);
                    }
                    break;
                } else if((month == 4 || month == 6 || month == 9 || month == 11) && day == 31) {
                    break;
                } else {
                    daysInYear[count++] = year + "-" + String.format("%02d",month) + "-" + String.format("%02d",day);
                }
            }
        }

        for(String day : daysInYear) {
            System.out.println(day);
        }
    }
}
