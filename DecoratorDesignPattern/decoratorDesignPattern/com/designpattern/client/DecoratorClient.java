package com.designpattern.client;

import com.designpattern.baseclass.Burger;
import com.designpattern.baseclasschilds.VegBurger;
import com.designpattern.decoratorsubclasses.ChineseSausageDecorator;
import com.designpattern.decoratorsubclasses.ItalianSausageDecorator;

public class DecoratorClient {

	public static void main(String[] args) {

		Burger vegBurger = new VegBurger();
		System.out.println(vegBurger.description + " costs " + vegBurger.price());

		vegBurger = new ChineseSausageDecorator(vegBurger);
		System.out.println(vegBurger.getDescription() + vegBurger.price());
		
		Burger vegBurger1 = new VegBurger();
		vegBurger1 = new ItalianSausageDecorator(vegBurger1);
		System.out.println(vegBurger1.getDescription() + vegBurger1.price());
	}

}
