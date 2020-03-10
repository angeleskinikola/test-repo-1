package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String words =new Scanner(System.in).nextLine();

	    String[] numbersInWords = words.split(" ");

	    String toInt = "";

	    int mult = 1;
	    for(String str : numbersInWords) {
            switch (str.toUpperCase()) {
                case "ONE":
                    toInt += "1";
                    break;
                case "TWO":
                    toInt += "2";
                    break;
                case "THREE":
                    toInt += "3";
                    break;
                case "FOUR":
                    toInt += "4";
                    break;
                case "FIVE":
                    toInt += "5";
                    break;
                case "SIX":
                    toInt += "6";
                    break;
                case "SEVEN":
                    toInt += "7";
                    break;
                case "EIGHT":
                    toInt += "8";
                    break;
                case "NINE":
                    toInt += "9";
                    break;
                case "ZERO":
                    toInt += "0";
                    break;
            }
        }

	    int parsedNum = Integer.parseInt(toInt);

	    System.out.println(parsedNum);

    }
}
