package edu.freeit.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class IfElseSwitchConstructors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Your name: ");
        String name = scanner.nextLine();
        System.out.println(isMale(name));
        System.out.println("enter number of day: ");
        int day = scanner.nextInt();
        System.out.println(getDayOfWeek(day));
        sayGoodbye(name);
    }
    private static String isMale(String name) {
        String[] letters = {"а", "е", "ё", "и", "о", "у", "э", "ю", "я"};
        String letter = name.substring(name.length() - 1);
        if (Arrays.asList(letters).contains(letter)) {
            return "Female";
        } else {
            return "Male";
        }
    }
    private static String getDayOfWeek(int day) {
        switch (day) {
            case 1 -> {
                return  "Monday";
            }
            case 2 -> {
                return  "Tuesday";
            }
            case 3 -> {
                return  "Wednesday";
            }
            case 4 -> {
                return  "Thursday";
            }
            case 5 -> {
                return  "Friday";
            }
            case 6 -> {
                return  "Saturday";
            }
            case 7 -> {
                return  "Sunday";
            }
            default -> {
                return  "no such day";
            }
        }
    }
    private static void sayGoodbye(String name) {
        System.out.println("Goodbye " + name);
    }
}
