package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Year:");
        int year =new Scanner(System.in).nextInt();
        String[] daysInYear;

        if(isLeap(year)) {
            daysInYear = new String[366];
        } else {
            daysInYear = new String[365];
        }



            int count = 0;
            for(int month = 1; month < 13; month++) {
                switch (month) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        for(int day = 1; day < 32; day++) {
                            daysInYear[count++] = year + "-" + month + "-" + day;
                        }
                        break;
                    case 2:
                        for(int day = 1; day < 29; day++) {
                            daysInYear[count++] = year + "-" + month + "-" + day;
                        }
                        if(isLeap(year)) {
                            daysInYear[count++] = year + "-" + month + "-" + 29;
                        }
                        break;
                    case 4: case 6: case 9: case 11:
                        for(int day = 1; day < 31; day++) {
                            daysInYear[count++] = year + "-" + month + "-" + day;
                        }

                        break;
                }
            }


        for(String day : daysInYear) {
            System.out.println(day);
        }


    }

    static boolean isLeap(int year) {
        if(year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
