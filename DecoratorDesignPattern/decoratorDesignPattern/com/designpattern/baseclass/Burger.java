package com.designpattern.baseclass;

public abstract class Burger {
	
	public String description = "Unknown Food";

	public String getDescription() {
		return description;
	}

	public abstract double price();

}
