package creational.abstractfactory.abstractfactory3.applefactory;

import creational.abstractfactory.abstractfactory3.Laptop;
import creational.abstractfactory.abstractfactory3.Phone;
import creational.abstractfactory.abstractfactory3.TechFactory;

public class AppleFactory implements TechFactory {

	@Override
	public Laptop getLaptop() {
		return new MacBookPro();
	}

	@Override
	public Phone getPhone() {
		return new Iphone();
	}

}
