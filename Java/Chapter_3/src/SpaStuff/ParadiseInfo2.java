package SpaStuff;

import java.util.Scanner;

//Author Logan Gosch
//Date: 1/23/2020

public class ParadiseInfo2 {

	public static void main(String[] args) 
	{
		double price;
		double discount;
		double savings;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter cutoff price for discount >>>");
		price = input.nextDouble();
		
		System.out.print("Enter discount rate as a whole number>>>");
		discount = input.nextDouble();
		
		displayInfo();
		
		savings = computeDiscountInfo(price, discount);
		System.out.println("Special this week on any service over" + price);
		
		System.out.print("Discount of " + discount + " percent");
		System.out.println("That's a savings pf at least $" + savings);
	}
	public static void displayInfo()
	{
		System.out.print("Paradise Day Spa wants to pamper you.\n");
		System.out.print("We will make you look good.");
	}
	public static double computeDiscountInfo(double pr, double dscnt){
	    double savings;
	    savings = pr * dscnt/100;
	    return savings;
    }
}
