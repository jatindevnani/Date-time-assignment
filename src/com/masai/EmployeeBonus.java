package com.masai;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class EmployeeBonus {
    public double bonusCalculator(String input)  {
        //Formatting the date to given format

        try {
            //Returns a date formatter object
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            if(!input.matches("^\\d{2}-\\d{2}-\\d{4}")) {
                throw new InvalidAge("Please pass the date in correct format");
            }

            LocalDate joinedOn = LocalDate.parse(input, formatter);

            LocalDate currentDate = LocalDate.now();
            Period period = null;
            if (currentDate.compareTo(joinedOn) > 0) {
                period = Period.between(joinedOn, currentDate);
            } else {
                throw new InvalidAge("Age should not be in the future");
            }


            int years = period.getYears();
            if (years < 1) {
                return 5000;
            } else if (years < 2) {
                return 8000;
            } else {
                return 10000;
            }
        } catch (InvalidAge iae) {
            System.out.println(iae.getMessage());
        }
        return -1;
    }
}
