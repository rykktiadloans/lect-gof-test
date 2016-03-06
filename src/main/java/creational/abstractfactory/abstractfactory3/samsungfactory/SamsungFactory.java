package creational.abstractfactory.abstractfactory3.samsungfactory;

import creational.abstractfactory.abstractfactory3.Laptop;
import creational.abstractfactory.abstractfactory3.Phone;
import creational.abstractfactory.abstractfactory3.TechFactory;

public class SamsungFactory implements TechFactory {

	@Override
	public Laptop getLaptop() {
		return new SamsungLaptop();
	}

	@Override
	public Phone getPhone() {
		return new GalaxyS();
	}

}
