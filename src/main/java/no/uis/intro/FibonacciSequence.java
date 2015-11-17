package main.java.no.uis.intro;

public class FibonacciSequence extends AbstractSequence {

	@Override
	public int getElement(int n) {
		if (n == 1 || n == 2) return 1;
		int second = 1;
		int first = 1;
		int current = second + first;
		for (int i=3;i<=n;i++) {
			current = second + first;
			second = first;
			first = current;
		}
		return current;
	}

}
