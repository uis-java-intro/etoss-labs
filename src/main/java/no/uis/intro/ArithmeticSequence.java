package main.java.no.uis.intro;

public class ArithmeticSequence extends AbstractSequence implements Sequence {
	private int d;
	private int a1;
	
	public ArithmeticSequence(int d, int a1) {
		this.d = d;
		this.a1 = a1;
	}
	
	public int getElement(int n) {
		return a1 + d*n;
	}

	@Override public String toString() {
		String resultat = "";
		for (int i=0;i<10;i++) {
			resultat += getElement(i) + ", ";
		}
		return resultat;
	}
}
