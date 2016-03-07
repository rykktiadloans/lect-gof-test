package creational.prototype.example1;

import java.util.Arrays;

public class ComplexObject2 {

	private int[] nums = {1,2,3,4,5};

	public int[] getNums() {
		return nums;
	}

	public ComplexObject2 clone() {
		return new ComplexObject2();
	}

	@Override
	public String toString() {
		return "ComplexObject2{" +
				"nums=" + Arrays.toString(nums) +
				'}';
	}
}
