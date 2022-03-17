package com.masai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EmployeeBonus eb = new EmployeeBonus();

        //Date in format dd-MM-yyyy
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter join date to calculate your bonus (dd-mm-yyyy)");
        String joinDate = scanner.nextLine();

        System.out.println(eb.bonusCalculator(joinDate));
    }
}
