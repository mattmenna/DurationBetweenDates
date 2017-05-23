package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Duration Between Dates");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the date in Years, Months and Days all numbers");

        String entry1 = s.nextLine();


        if (entry1.matches("\\d\\d\\W\\d\\d\\W\\d\\d\\d\\d") == false) {
            System.out.println("Wrong format");
            return;
        }
       String monthString = entry1.substring(0,1);
        int monthInt = Integer.valueOf(monthString);

        String dayString = entry1.substring(3,4);
        int dayInt = Integer.valueOf(monthString);

        String yearString = entry1.substring(6,9);
        int yearInt = Integer.valueOf(monthString);

        LocalDate firstdate = LocalDate.of(yearInt, Month.of(monthInt), dayInt);


        String entry2 = s.nextLine();
        if (entry2.matches("\\d\\d\\W\\d\\d\\W\\d\\d\\d\\d") == false) {
            System.out.println("Wrong format");
            return;
        }
        String monthString = entry2.substring(0,1);
        int monthInt = Integer.valueOf(monthString);

        String dayString = entry2.substring(3,4);
        int dayInt = Integer.valueOf(monthString);

        String yearString = entry2.substring(6,9);
        int yearInt = Integer.valueOf(monthString);

        LocalDate secondDate = LocalDate.of(yearInt, Month.of(monthInt), dayInt);
        //LocalDate secondDate = LocalDate.of(year, Month.of(month), daysOfmonth);

    /*
        int year = s.nextInt();
        int month = s.nextInt();
        int daysOfmonth = s.nextInt();

        LocalDate today = LocalDate.now();

        LocalDate tomorrow = LocalDate.of(year, Month.of(month), daysOfmonth);

        Period p = Period.between(today, tomorrow);
        System.out.println("Number of Years " + p.getYears() + " Number of Months " + p.getMonths() + " Number of Days " + p.getDays());
    */

    }
}
