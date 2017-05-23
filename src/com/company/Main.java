package com.company;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Duration Between Dates");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the date in Months/Days/Year format ex. MM/DD/YYYY");

        String entry1 = s.nextLine();

        // gets first date
        if (entry1.matches("\\d\\d\\W\\d\\d\\W\\d\\d\\d\\d") == false) {
            System.out.println("Wrong format try again. Remember it should be MM/DD/YYYY");
            entry1 = s.nextLine(); //trys again to get proper input05/23/2017
        }

        System.out.println("You entered " + entry1);
        // takes user input in MM/DD/YYYY format and breaks it down into substrings for MM, DD, and YYYY
        String monthString1 = entry1.substring(0, 2);
        int monthInt = Integer.valueOf(monthString1);


        String dayString1 = entry1.substring(3, 5);
        int dayInt = Integer.valueOf(dayString1);

        String yearString1 = entry1.substring(6);
        int yearInt = Integer.valueOf(yearString1);

        LocalDate firstdate = null;
        try {
            firstdate = LocalDate.of(yearInt, Month.of(monthInt), dayInt);
        } catch (DateTimeException e) {
            System.out.println("Uh Oh something happened");
        }

        System.out.println("Next date please, make sure it is in the future!");

        // gets second date
        String entry2 = s.nextLine();
        if (entry2.matches("\\d\\d\\W\\d\\d\\W\\d\\d\\d\\d") == false) {
            System.out.println("Wrong format try again. Remember it should be MM/DD/YYYY");
            entry2 = s.nextLine(); //trys again to get proper input
        }

        System.out.println("You entered " + entry2);

        String monthString2 = entry2.substring(0, 2);
        int monthInt2 = Integer.valueOf(monthString2);

        String dayString2 = entry2.substring(3, 5);
        int dayInt2 = Integer.valueOf(dayString2);

        String yearString2 = entry2.substring(6);
        int yearInt2 = Integer.valueOf(yearString2);

        LocalDate secondDate = null;
        try {
            secondDate = LocalDate.of(yearInt2, Month.of(monthInt2), dayInt2);

            Period p = Period.between(firstdate, secondDate);
            System.out.println("Number of Years = " + p.getYears() + " Number of Months = " + p.getMonths() + " Number of Days = " + p.getDays());
        } catch (DateTimeException e) {
            System.out.println("Uh Oh Something is wrong");
        }

    }
}
