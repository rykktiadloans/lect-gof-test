package creational.abstractfactory.abstractfactory1;

import creational.abstractfactory.abstractfactory1.teddyfactory.TeddyToyFactory;
import creational.abstractfactory.abstractfactory1.woodenfactory.WoodenToyFactory;

public class AbstractFactoryUsage1 {

	public static void main(String[] args) {

		ToyFactory toyFactory = new TeddyToyFactory();
		//ToyFactory toyFactory = new WoodenToyFactory();

		Bear bear = toyFactory.getBear();
		Cat cat = toyFactory.getCat();

		System.out.println("I've got " + bear.getName() + " and " + cat.getName());

	}

}
