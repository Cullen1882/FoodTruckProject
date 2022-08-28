package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String name;
	private String cuisineType;
	private int truckId = 1;
	private int rating;
	
	
	
	public void setTruckId(int iD) {
		this.truckId += iD;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getCuisineType() {
		return cuisineType;
	}
	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String toString() {
	     
	    return "\n Truck name: " + name + "\n Truck ID: " + truckId + "\n Truck cuisine: " + cuisineType + "\n Rating: " + rating;
	}
}
