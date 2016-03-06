package creational.prototype.prototype1;

public class PrototypeUsage1 {

	public static void main(String[] args) {

		// shallow copy
		ComplexObject1 complexObject1 = new ComplexObject1();
		ComplexObject1 complexObject1Prototype = (ComplexObject1) complexObject1.clone();
		System.out.println(complexObject1);
		System.out.println(complexObject1Prototype);

		// deep copy
		ComplexObject2 complexObject2 = new ComplexObject2();
		ComplexObject2 complexObject2Prototype = complexObject2.clone();
		System.out.println(complexObject2);
		System.out.println(complexObject2Prototype);

	}

}
