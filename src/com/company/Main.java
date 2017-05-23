package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Duration Between Dates");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the date in Months/Days/Year format ex. 05/23/2017");

        String entry1 = s.nextLine();

        if (entry1.matches("\\d\\d\\W\\d\\d\\W\\d\\d\\d\\d") == false) {
            System.out.println("Wrong format try again");
            entry1 = s.nextLine();
        }

        String monthString1 = entry1.substring(0, 2);
        int monthInt = Integer.valueOf(monthString1);
        System.out.println(monthString1);

        String dayString1 = entry1.substring(3, 5);
        int dayInt = Integer.valueOf(dayString1);

        String yearString1 = entry1.substring(6);
        int yearInt = Integer.valueOf(yearString1);
        System.out.println(yearString1);

        LocalDate firstdate = LocalDate.of(yearInt, Month.of(monthInt), dayInt);

        String entry2 = s.nextLine();
        if (entry2.matches("\\d\\d\\W\\d\\d\\W\\d\\d\\d\\d") == false) {
            System.out.println("Wrong format");
            entry2 = s.nextLine();
        }

        String monthString2 = entry2.substring(0, 2);
        int monthInt2 = Integer.valueOf(monthString2);

        String dayString2 = entry2.substring(3, 5);
        int dayInt2 = Integer.valueOf(dayString2);

        String yearString2 = entry2.substring(6);
        int yearInt2 = Integer.valueOf(yearString2);

        LocalDate secondDate = LocalDate.of(yearInt2, Month.of(monthInt2), dayInt2);

        Period p = Period.between(firstdate, secondDate);
        System.out.println("Number of Years " + p.getYears() + " Number of Months " + p.getMonths() + " Number of Days " + p.getDays());

    }
}
