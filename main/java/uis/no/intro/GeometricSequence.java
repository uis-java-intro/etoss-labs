package main.java.uis.no.intro;

public class GeometricSequence extends AbstractSequence {
	private int d;
	private int a1;
	
	public GeometricSequence(int d, int a1) {
		this.d = d;
		this.a1 = a1;
	}
	
	public int getElement(int n) {
		return a1*(int)Math.pow(d, n);
	}
}
