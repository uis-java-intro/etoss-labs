package main.java.uis.no.intro;

public abstract class AbstractSequence implements Sequence {
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
