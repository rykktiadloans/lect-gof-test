package creational.abstractfactory.abstractfactory1.woodenfactory;

import creational.abstractfactory.abstractfactory1.Bear;
import creational.abstractfactory.abstractfactory1.Cat;
import creational.abstractfactory.abstractfactory1.ToyFactory;

public class WoodenToyFactory implements ToyFactory {

	@Override
	public Bear getBear() {
		return new WoodenBear();
	}

	@Override
	public Cat getCat() {
		return new WoodenCat();
	}

}
