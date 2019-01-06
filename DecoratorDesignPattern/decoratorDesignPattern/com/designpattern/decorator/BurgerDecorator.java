package com.designpattern.decorator;

import com.designpattern.baseclass.Burger;

public abstract class BurgerDecorator extends Burger {

	@Override
	public abstract double price();
	
	public abstract String getDescription();

}
