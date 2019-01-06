package com.designpattern.baseclasschilds;

import com.designpattern.baseclass.Burger;

public class VegBurger extends Burger {

	public VegBurger() {
		super();
		this.description = "Veg Burger";
	}

	@Override
	public double price() {
		return 157.90;
	}

}
