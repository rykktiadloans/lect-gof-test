package creational.abstractfactory.abstractfactory1.teddyfactory;

import creational.abstractfactory.abstractfactory1.Bear;
import creational.abstractfactory.abstractfactory1.Cat;
import creational.abstractfactory.abstractfactory1.ToyFactory;

public class TeddyToyFactory implements ToyFactory {

	@Override
	public Bear getBear() {
		return new TeddyBear();
	}

	@Override
	public Cat getCat() {
		return new TeddyCat();
	}

}
