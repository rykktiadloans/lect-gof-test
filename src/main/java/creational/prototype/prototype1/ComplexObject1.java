package creational.prototype.prototype1;

import java.util.Arrays;

class ComplexObject1 implements Cloneable {

	private int[] nums = {1,2,3,4,5};

	public int[] getNums() {
		return nums;
	}

	public Object clone() {
		try {
			return super.clone();
		}catch(CloneNotSupportedException cnse) {
			System.out.println(cnse.getMessage());
			return null;
		}
	}

	@Override
	public String toString() {
		return "ComplexObject1{" +
				"nums=" + Arrays.toString(nums) +
				'}';
	}
}