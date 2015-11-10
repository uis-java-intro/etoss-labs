package main.java.uis.no.intro;

public class ArithmeticSequence implements Sequence {
	private int d;
	private int a1;
	
	public ArithmeticSequence(int d, int a1) {
		this.d = d;
		this.a1 = a1;
	}
	
	public int getElement(int n) {
		return a1 + d*n;
	}
	
	public int sum(int n) {
		int result = 0;
		for (int i=0;i<n;i++) {
			result += getElement(i);
		}
		return result;
	}

	@Override
	public int product(int n) {
		int result = 1;
		for (int i=0;i<n;i++) {
			result *= getElement(i);
		}
		return result;
	}

}
