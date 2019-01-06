package com.designpattern.decoratorsubclasses;

import com.designpattern.baseclass.Burger;
import com.designpattern.decorator.BurgerDecorator;

public class ChineseSausageDecorator extends BurgerDecorator {

	Burger burger;

	public ChineseSausageDecorator(Burger burger) {
		super();
		this.burger = burger;
	}

	@Override
	public double price() {
		return 120 + burger.price();
	}

	@Override
	public String getDescription() {
		return "With Chinese Sausage " + burger.getDescription() + " cost ";
	}

}
