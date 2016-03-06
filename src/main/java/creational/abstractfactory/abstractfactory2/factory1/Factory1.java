package creational.abstractfactory.abstractfactory2.factory1;

import creational.abstractfactory.abstractfactory2.AbstractFactory;
import creational.abstractfactory.abstractfactory2.ProductA;
import creational.abstractfactory.abstractfactory2.ProductB;
import creational.abstractfactory.abstractfactory2.ProductC;

public class Factory1 implements AbstractFactory {

	@Override
	public ProductA getProductA() {
		return new ProductAF1();
	}

	@Override
	public ProductB getProductB() {
		return new ProductBF1();
	}

	@Override
	public ProductC getProductC() {
		return new ProductCF1();
	}

}