package com.designpattern.decoratorsubclasses;

import com.designpattern.baseclass.Burger;
import com.designpattern.decorator.BurgerDecorator;

public class ItalianSausageDecorator extends BurgerDecorator {

	Burger burger;

	public ItalianSausageDecorator(Burger burger) {
		super();
		this.burger = burger;
	}

	@Override
	public double price() {
		return 143 + burger.price();
	}

	@Override
	public String getDescription() {
		return "With Italian Sausage " + burger.getDescription() + " cost ";
	}

}
