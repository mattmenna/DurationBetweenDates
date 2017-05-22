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

        int year = s.nextInt();
        int month = s.nextInt();
        int daysOfmonth = s.nextInt();

        LocalDate today = LocalDate.now();

        LocalDate tomorrow = LocalDate.of(year, Month.of(month), daysOfmonth);

        Period p = Period.between(today, tomorrow);
        System.out.println("Number of Years "+ p.getYears() + " Number of Months " + p.getMonths() + " Number of Days " + p.getDays());


    }
}
