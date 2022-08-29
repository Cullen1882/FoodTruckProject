package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		FoodTruckApp app = new FoodTruckApp();

		int numOfTrucks = 0;
		int maxTrucks = 5;
		boolean keepGoing = true;
		FoodTruck[] trucks = new FoodTruck[maxTrucks];

		for (int idx = 0; idx < maxTrucks; idx++) {
			FoodTruck truck = new FoodTruck();

			System.out.print("Enter name of Truck, type Quit in truck name to stop entering trucks: ");
			String name = kb.next();
			if (name.equalsIgnoreCase("Quit")) {
				break;
			} else {
				truck.setName(name);

			}

			System.out.print("Enter food type: ");
			truck.setCuisineType(kb.next());

			System.out.print("Enter Truck rating: ");
			truck.setRating(kb.nextInt());
			truck.setTruckId(idx);
			trucks[idx] = truck;
			numOfTrucks++;

		}
		while (keepGoing) {
			System.out.println("1) List all existing food trucks");
			System.out.println("2) See the average rating of food trucks");
			System.out.println("3) See the highest rated food truck");
			System.out.println("4) Quit the program");
			int userMenuChoice = kb.nextInt();

			switch (userMenuChoice) {
			case 1:
				app.getTrucks(trucks, numOfTrucks);
				break;
			case 2:
				app.getAverage(trucks, numOfTrucks);
				break;
			case 3:
				app.getHighest(trucks, numOfTrucks);
				break;
			case 4:
				System.out.println("Thank you for using the Food Truck App, GoodBye!");
				keepGoing = false;
				break;
			default:
				System.out.println("ERROR: Please make another choice.");
				break;
			}
		}
		kb.close();
	}

//getTrucks()
	public void getTrucks(FoodTruck[] trucks, int numTruck) {
		for (int i = 0; i < numTruck; i++) {
			System.out.println(trucks[i]);

		}
	}

//getAverage
	public void getAverage(FoodTruck[] trucks, int numTruck) {
		int sumRats = 0;
		for (int i = 0; i < numTruck; i++) {
			trucks[i].getRating();
			int sum = trucks[i].getRating();
			sumRats += sum;
		}
		double average = sumRats / numTruck;
		System.out.println("The average rating for the trucks provided is: " + average);
	}

//getHighest
	public void getHighest(FoodTruck[] trucks, int numTruck) {
		int highest = 0;
		for (int i = 0; i < numTruck; i++) {
			if (highest < trucks[i].getRating()) {
				highest = trucks[i].getRating();
			}

		}
		System.out.println("The highest rating for the trucks provided is: " + highest);
	}
}
