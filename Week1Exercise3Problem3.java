
import java.util.Scanner;

public class Week1Exercise3Problem3 {
       public static void main(String[] args) {
    	   Scanner input = new Scanner(System.in);
    	   
    	   System.out.println("Enter the information: Cars");
    	   int cars = input.nextInt();
    	   System.out.println("Space in a car");
    	   int space_in_a_car = input.nextInt();
    	   System.out.println("Drivers");
    	   int drivers = input.nextInt();
    	   System.out.println("Passengers");
    	   int passengers = input.nextInt();
    	   System.out.println("Average miles driven");
    	   double average_miles_driven = input.nextDouble();
    	   System.out.println("Average miles per gallon");
    	   double average_miles_per_gallon = input.nextDouble();
    	   System.out.println("Gas cost per gallon");
    	   double gas_cost_per_gallon = input.nextDouble(); 
    	   int cars_driven = drivers;
    	   int cars_not_driven = cars - cars_driven;
    	   int carpool_capacity = cars_driven * space_in_a_car;
		   int average_passengers_per_car = passengers / cars_driven;
    	   double gas_cost_per_trip = (average_miles_driven * gas_cost_per_gallon)/average_miles_per_gallon;
           double money_saved = (gas_cost_per_trip * cars) - (gas_cost_per_trip * cars_driven);
           
           System.out.println("There are " + cars + "cars available.");
           System.out.println("There are only " + drivers + "drivers available.");
           System.out.println("That means there will be " + cars_not_driven + "empty cars today!");
           System.out.println("We can transport " + carpool_capacity + "people today.");
           System.out.println("Out of that, we're transporting " + passengers + "today.");
           System.out.println("So we'll need to put about " + average_passengers_per_car + "in each car.");
           System.out.println("Long story short, today, we'll be saving about $" + money_saved + "!");

       }


}
