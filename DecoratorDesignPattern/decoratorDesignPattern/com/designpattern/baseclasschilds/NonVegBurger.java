package com.designpattern.baseclasschilds;

import com.designpattern.baseclass.Burger;

public class NonVegBurger extends Burger {

	public NonVegBurger() {
		super();
		this.description = "NonVeg Burger";
	}

	@Override
	public double price() {
		return 197.60;
	}

}
